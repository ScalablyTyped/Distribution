package typings.fgLoadcss

import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fg-loadcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCSS(href: String): HTMLLinkElement = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any]).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: String): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: String, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: Unit, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: String): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: String, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: Unit, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  
  object global {
    
    trait Window extends StObject {
      
      def onloadCSS(stylesheet: HTMLLinkElement, callback: js.Function0[Unit]): Unit
    }
    object Window {
      
      inline def apply(onloadCSS: (HTMLLinkElement, js.Function0[Unit]) => Unit): Window = {
        val __obj = js.Dynamic.literal(onloadCSS = js.Any.fromFunction2(onloadCSS))
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setOnloadCSS(value: (HTMLLinkElement, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onloadCSS", js.Any.fromFunction2(value))
      }
    }
  }
}
