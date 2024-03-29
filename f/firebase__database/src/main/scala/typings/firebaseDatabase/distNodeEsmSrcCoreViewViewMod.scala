package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreOperationOperationMod.Operation
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventGeneratorMod.EventGenerator
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.Event
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.EventRegistration
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.QueryContext
import typings.firebaseDatabase.distNodeEsmSrcCoreViewViewCacheMod.ViewCache
import typings.firebaseDatabase.distNodeEsmSrcCoreViewViewProcessorMod.ViewProcessor
import typings.firebaseDatabase.distNodeEsmSrcCoreWriteTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreViewViewMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/View", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/View", "View")
  @js.native
  open class View protected () extends StObject {
    def this(query_ : QueryContext, initialViewCache: ViewCache) = this()
    
    var eventGenerator_ : EventGenerator = js.native
    
    var eventRegistrations_ : js.Array[EventRegistration] = js.native
    
    var processor_ : ViewProcessor = js.native
    
    def query: QueryContext = js.native
    
    /* private */ var query_ : Any = js.native
    
    var viewCache_ : ViewCache = js.native
  }
  
  inline def viewAddEventRegistration(view: View, eventRegistration: EventRegistration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("viewAddEventRegistration")(view.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def viewApplyOperation(view: View, operation: Operation, writesCache: WriteTreeRef): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewApplyOperation")(view.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def viewApplyOperation(view: View, operation: Operation, writesCache: WriteTreeRef, completeServerCache: Node): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewApplyOperation")(view.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def viewGetCompleteNode(view: View): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("viewGetCompleteNode")(view.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def viewGetCompleteServerCache(view: View, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("viewGetCompleteServerCache")(view.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def viewGetInitialEvents(view: View, registration: EventRegistration): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewGetInitialEvents")(view.asInstanceOf[js.Any], registration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def viewGetServerCache(view: View): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("viewGetServerCache")(view.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def viewIsEmpty(view: View): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("viewIsEmpty")(view.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def viewRemoveEventRegistration(view: View): js.Array[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("viewRemoveEventRegistration")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Event]]
  inline def viewRemoveEventRegistration(view: View, eventRegistration: Null, cancelError: js.Error): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewRemoveEventRegistration")(view.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def viewRemoveEventRegistration(view: View, eventRegistration: EventRegistration): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewRemoveEventRegistration")(view.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def viewRemoveEventRegistration(view: View, eventRegistration: EventRegistration, cancelError: js.Error): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("viewRemoveEventRegistration")(view.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
}
