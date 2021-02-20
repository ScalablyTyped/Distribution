package typings.firebaseDatabase

import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.childChangeAccumulatorMod.ChildChangeAccumulator
import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.viewCacheMod.ViewCache
import typings.firebaseDatabase.writeTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewProcessorMod {
  
  @JSImport("@firebase/database/dist/src/core/view/ViewProcessor", "ProcessorResult")
  @js.native
  class ProcessorResult protected () extends StObject {
    /**
      * @param {!ViewCache} viewCache
      * @param {!Array.<!Change>} changes
      */
    def this(viewCache: ViewCache, changes: js.Array[Change]) = this()
    
    val changes: js.Array[Change] = js.native
    
    val viewCache: ViewCache = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/ViewProcessor", "ViewProcessor")
  @js.native
  class ViewProcessor protected () extends StObject {
    /**
      * @param {!NodeFilter} filter_
      */
    def this(filter_ : NodeFilter) = this()
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} ackPath
      * @param {!ImmutableTree<!boolean>} affectedTree
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var ackUserWrite_ : js.Any = js.native
    
    /**
      * @param {!Node} node
      * @param {ImmutableTree.<!Node>} merge
      * @return {!Node}
      * @private
      */
    var applyMerge_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Operation} operation
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @return {!ProcessorResult}
      */
    def applyOperation(oldViewCache: ViewCache, operation: Operation, writesCache: WriteTreeRef): ProcessorResult = js.native
    def applyOperation(oldViewCache: ViewCache, operation: Operation, writesCache: WriteTreeRef, completeCache: Node): ProcessorResult = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!ImmutableTree.<!Node>} changedChildren
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} serverCache
      * @param {boolean} filterServerNode
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var applyServerMerge_ : js.Any = js.native
    
    def applyServerOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Null,
      filterServerNode: Boolean,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Path} changePath
      * @param {!Node} changedSnap
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {boolean} filterServerNode
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    def applyServerOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Node,
      filterServerNode: Boolean,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {ImmutableTree.<!Node>} changedChildren
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} serverCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var applyUserMerge_ : js.Any = js.native
    
    def applyUserOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Null,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!Path} changePath
      * @param {!Node} changedSnap
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    def applyUserOverwrite_(
      oldViewCache: ViewCache,
      changePath: Path,
      changedSnap: Node,
      writesCache: WriteTreeRef,
      completeCache: Node,
      accumulator: ChildChangeAccumulator
    ): ViewCache = js.native
    
    /**
      * @param {!ViewCache} viewCache
      */
    def assertIndexed(viewCache: ViewCache): Unit = js.native
    
    val filter_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} changePath
      * @param {!WriteTreeRef} writesCache
      * @param {!CompleteChildSource} source
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var generateEventCacheAfterServerEvent_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!WriteTreeRef} writesCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var listenComplete_ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {!Path} path
      * @param {!WriteTreeRef} writesCache
      * @param {?Node} completeServerCache
      * @param {!ChildChangeAccumulator} accumulator
      * @return {!ViewCache}
      * @private
      */
    var revertUserWrite_ : js.Any = js.native
  }
  /* static members */
  object ViewProcessor {
    
    @JSImport("@firebase/database/dist/src/core/view/ViewProcessor", "ViewProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {!ViewCache} viewCache
      * @param {string} childKey
      * @return {boolean}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/ViewProcessor", "ViewProcessor.cacheHasChild_")
    @js.native
    def cacheHasChild_ : js.Any = js.native
    @scala.inline
    def cacheHasChild__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHasChild_")(x.asInstanceOf[js.Any])
    
    /**
      * @param {!ViewCache} oldViewCache
      * @param {!ViewCache} newViewCache
      * @param {!Array.<!Change>} accumulator
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/ViewProcessor", "ViewProcessor.maybeAddValueEvent_")
    @js.native
    def maybeAddValueEvent_ : js.Any = js.native
    @scala.inline
    def maybeAddValueEvent__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybeAddValueEvent_")(x.asInstanceOf[js.Any])
  }
}
