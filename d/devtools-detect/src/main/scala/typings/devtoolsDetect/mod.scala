package typings.devtoolsDetect

import org.scalablytyped.runtime.Shortcut
import typings.devtoolsDetect.devtoolsDetectStrings.devtoolschange
import typings.std.AddEventListenerOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("devtools-detect", JSImport.Namespace)
  @js.native
  val ^ : DevTools = js.native
  
  @js.native
  trait DevTools extends StObject {
    
    /**
    		Whether DevTools is open.
    		*/
    val isOpen: Boolean = js.native
    
    /**
    		Orientation of the DevTools if it's open.
    		*/
    val orientation: js.UndefOr[Orientation] = js.native
  }
  object DevTools {
    
    @scala.inline
    def apply(isOpen: Boolean): DevTools = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevTools]
    }
    
    @scala.inline
    implicit class DevToolsMutableBuilder[Self <: DevTools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  @js.native
  trait DevToolsEvent extends Event {
    
    var detail: DevTools = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsDetect.devtoolsDetectStrings.vertical
    - typings.devtoolsDetect.devtoolsDetectStrings.horizontal
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def horizontal: typings.devtoolsDetect.devtoolsDetectStrings.horizontal = "horizontal".asInstanceOf[typings.devtoolsDetect.devtoolsDetectStrings.horizontal]
    
    @scala.inline
    def vertical: typings.devtoolsDetect.devtoolsDetectStrings.vertical = "vertical".asInstanceOf[typings.devtoolsDetect.devtoolsDetectStrings.vertical]
  }
  
  type _To = DevTools
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DevTools = ^
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, _]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, _], options: Boolean): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(
        `type`: devtoolschange,
        listener: js.Function1[/* event */ DevToolsEvent, _],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
