package typings.egjsComponent

import org.scalablytyped.runtime.StringDictionary
import typings.egjsComponent.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object eg {
    
    @JSGlobal("eg")
    @js.native
    class ^ ()
      extends typings.egjsComponent.mod.^ {
      def this(options: StringDictionary[js.Any]) = this()
    }
    
    @JSGlobal("eg")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hasOn(eventName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOn")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def off(): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[Component]
    inline def off(eventName: String): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Component]
    inline def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
    inline def off(eventName: Unit, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
    
    inline def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
    inline def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(events.asInstanceOf[js.Any]).asInstanceOf[Component]
    
    inline def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
    inline def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(events.asInstanceOf[js.Any]).asInstanceOf[Component]
    
    inline def trigger(eventName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any], customEvent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
