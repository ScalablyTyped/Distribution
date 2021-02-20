package typings.egjsComponent

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/component", JSImport.Namespace)
  @js.native
  class ^ () extends Component {
    def this(options: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("@egjs/component", "hasOn")
  @js.native
  def hasOn(eventName: String): Boolean = js.native
  
  @JSImport("@egjs/component", "off")
  @js.native
  def off(): Component = js.native
  @JSImport("@egjs/component", "off")
  @js.native
  def off(
    eventName: js.UndefOr[scala.Nothing],
    handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]
  ): Component = js.native
  @JSImport("@egjs/component", "off")
  @js.native
  def off(eventName: String): Component = js.native
  @JSImport("@egjs/component", "off")
  @js.native
  def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  
  @JSImport("@egjs/component", "on")
  @js.native
  def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  @JSImport("@egjs/component", "on")
  @js.native
  def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
  
  @JSImport("@egjs/component", "once")
  @js.native
  def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  @JSImport("@egjs/component", "once")
  @js.native
  def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
  
  @JSImport("@egjs/component", "trigger")
  @js.native
  def trigger(eventName: String): Boolean = js.native
  @JSImport("@egjs/component", "trigger")
  @js.native
  def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = js.native
  
  @js.native
  trait Component extends StObject {
    
    def hasOn(eventName: String): Boolean = js.native
    
    def off(): Component = js.native
    def off(
      eventName: js.UndefOr[scala.Nothing],
      handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]
    ): Component = js.native
    def off(eventName: String): Component = js.native
    def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
    
    def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
    def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
    
    def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
    def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
    
    var options: StringDictionary[js.Any] = js.native
    
    def trigger(eventName: String): Boolean = js.native
    def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = js.native
  }
}
