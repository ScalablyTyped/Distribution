package typings.favicoJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object favicojs {
  
  @js.native
  trait Favico extends StObject {
    
    def badge(number: Double): Unit = js.native
    def badge(number: Double, animation: String): Unit = js.native
    def badge(number: Double, opts: FavicoJsOptions): Unit = js.native
    
    def image(imageElement: HTMLElement): Unit = js.native
    
    def reset(): Unit = js.native
    
    def video(imageElement: HTMLElement): Unit = js.native
    
    def webcam(): Unit = js.native
  }
  
  trait FavicoJsOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var dataUrl: js.UndefOr[js.Function1[/* url */ String, js.Any]] = js.undefined
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var elementId: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FavicoJsOptions {
    
    @scala.inline
    def apply(): FavicoJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavicoJsOptions]
    }
    
    @scala.inline
    implicit class FavicoJsOptionsMutableBuilder[Self <: FavicoJsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setDataUrl(value: /* url */ String => js.Any): Self = StObject.set(x, "dataUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FavicoJsStatic
    extends StObject
       with Instantiable0[Favico]
       with Instantiable1[/* opt */ FavicoJsOptions, Favico]
}
