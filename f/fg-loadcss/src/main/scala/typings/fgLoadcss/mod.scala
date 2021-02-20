package typings.fgLoadcss

import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(
    href: String,
    before: js.UndefOr[scala.Nothing],
    media: js.UndefOr[scala.Nothing],
    attributes: Record[String, String]
  ): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String, before: js.UndefOr[scala.Nothing], media: String): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String, before: js.UndefOr[scala.Nothing], media: String, attributes: Record[String, String]): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String, before: HTMLElement): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(
    href: String,
    before: HTMLElement,
    media: js.UndefOr[scala.Nothing],
    attributes: Record[String, String]
  ): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String, before: HTMLElement, media: String): HTMLLinkElement = js.native
  @JSImport("fg-loadcss", "loadCSS")
  @js.native
  def loadCSS(href: String, before: HTMLElement, media: String, attributes: Record[String, String]): HTMLLinkElement = js.native
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      def onloadCSS(stylesheet: HTMLLinkElement, callback: js.Function0[Unit]): Unit = js.native
    }
    object Window {
      
      @scala.inline
      def apply(onloadCSS: (HTMLLinkElement, js.Function0[Unit]) => Unit): Window = {
        val __obj = js.Dynamic.literal(onloadCSS = js.Any.fromFunction2(onloadCSS))
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnloadCSS(value: (HTMLLinkElement, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onloadCSS", js.Any.fromFunction2(value))
      }
    }
  }
}
