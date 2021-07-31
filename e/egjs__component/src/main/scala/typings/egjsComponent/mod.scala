package typings.egjsComponent

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/component", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Component {
    def this(options: StringDictionary[js.Any]) = this()
  }
  @JSImport("@egjs/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasOn(eventName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOn")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def off(): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[Component]
  @scala.inline
  def off(eventName: String): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Component]
  @scala.inline
  def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
  @scala.inline
  def off(eventName: Unit, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
  
  @scala.inline
  def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
  @scala.inline
  def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(events.asInstanceOf[js.Any]).asInstanceOf[Component]
  
  @scala.inline
  def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(eventName.asInstanceOf[js.Any], handlerToAttach.asInstanceOf[js.Any])).asInstanceOf[Component]
  @scala.inline
  def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(events.asInstanceOf[js.Any]).asInstanceOf[Component]
  
  @scala.inline
  def trigger(eventName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(eventName.asInstanceOf[js.Any], customEvent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait Component extends StObject {
    
    def hasOn(eventName: String): Boolean = js.native
    
    def off(): Component = js.native
    def off(eventName: String): Component = js.native
    def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = js.native
    def off(eventName: Unit, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = js.native
    
    def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = js.native
    def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = js.native
    
    def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], js.Any]): Component = js.native
    def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], js.Any]]): Component = js.native
    
    var options: StringDictionary[js.Any] = js.native
    
    def trigger(eventName: String): Boolean = js.native
    def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = js.native
  }
}
