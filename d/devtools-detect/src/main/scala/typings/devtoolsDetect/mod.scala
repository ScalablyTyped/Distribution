package typings.devtoolsDetect

import typings.devtoolsDetect.anon.IsOpen
import typings.devtoolsDetect.devtoolsDetectStrings.devtoolschange
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Whether DevTools is open.
    	*/
    @JSImport("devtools-detect", "default.isOpen")
    @js.native
    val isOpen: Boolean = js.native
    
    /**
    	Orientation of the DevTools if it's open.
    	*/
    @JSImport("devtools-detect", "default.orientation")
    @js.native
    val orientation: js.UndefOr[Orientation] = js.native
  }
  
  @js.native
  trait DevToolsEvent
    extends StObject
       with Event {
    
    var detail: IsOpen = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsDetect.devtoolsDetectStrings.vertical
    - typings.devtoolsDetect.devtoolsDetectStrings.horizontal
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typings.devtoolsDetect.devtoolsDetectStrings.horizontal = "horizontal".asInstanceOf[typings.devtoolsDetect.devtoolsDetectStrings.horizontal]
    
    inline def vertical: typings.devtoolsDetect.devtoolsDetectStrings.vertical = "vertical".asInstanceOf[typings.devtoolsDetect.devtoolsDetectStrings.vertical]
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, Any]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, Any], options: Boolean): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(
        `type`: devtoolschange,
        listener: js.Function1[/* event */ DevToolsEvent, Any],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
