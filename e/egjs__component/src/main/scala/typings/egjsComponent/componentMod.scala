package typings.egjsComponent

import typings.egjsComponent.componentEventMod.ComponentEvent
import typings.egjsComponent.typesMod.EventCallback
import typings.egjsComponent.typesMod.EventHash
import typings.egjsComponent.typesMod.EventKey
import typings.egjsComponent.typesMod.EventMap
import typings.egjsComponent.typesMod.EventTriggerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@egjs/component/declaration/Component", JSImport.Default)
  @js.native
  open class default[T /* <: EventMap */] ()
    extends StObject
       with Component[T]
  object default {
    
    @JSImport("@egjs/component/declaration/Component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@egjs/component/declaration/Component", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Component[T /* <: EventMap */] extends StObject {
    
    /* private */ var _eventHandler: Any = js.native
    
    def hasOn[K /* <: EventKey[T] */](eventName: K): Boolean = js.native
    
    def off(): this.type = js.native
    def off(eventHash: EventHash[T, this.type]): this.type = js.native
    def off[K /* <: EventKey[T] */](eventName: K): this.type = js.native
    def off[K /* <: EventKey[T] */](eventName: K, handlerToDetach: EventCallback[T, K, this.type]): this.type = js.native
    
    def on(eventHash: EventHash[T, this.type]): this.type = js.native
    def on[K /* <: EventKey[T] */](eventName: K, handlerToAttach: EventCallback[T, K, this.type]): this.type = js.native
    
    def once(eventHash: EventHash[T, this.type]): this.type = js.native
    def once[K /* <: EventKey[T] */](eventName: K, handlerToAttach: EventCallback[T, K, this.type]): this.type = js.native
    
    def trigger[K /* <: EventKey[T] */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type EventTriggerParams<T, K> is not an array type */ params: EventTriggerParams[T, K]
    ): this.type = js.native
    def trigger[K /* <: EventKey[T] */](
      event: (ComponentEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
          K, 
          this.type
        ]) & (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any)
    ): this.type = js.native
  }
}
