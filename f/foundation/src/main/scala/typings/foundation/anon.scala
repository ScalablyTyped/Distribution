package typings.foundation

import typings.foundation.Foundation.RevealCSSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Addcustomrule extends StObject {
    
    def S(selector: Any, context: Any): JQuery = js.native
    
    def add_custom_rule(rule: String, media: String): Unit = js.native
    
    def data_options(el: JQuery): js.Object = js.native
    
    def debounce(func: js.Function1[/* repeated */ Any, Any], delay: Double, immediate: Boolean): js.Function1[/* repeated */ Any, Any] = js.native
    
    def image_loaded(images: JQuery, callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    def is_large_only(): Boolean = js.native
    
    def is_large_up(): Boolean = js.native
    
    def is_medium_only(): Boolean = js.native
    
    def is_medium_up(): Boolean = js.native
    
    def is_small_only(): Boolean = js.native
    
    def is_small_up(): Boolean = js.native
    
    def is_xlarge_only(): Boolean = js.native
    
    def is_xlarge_up(): Boolean = js.native
    
    def is_xxlarge_only(): Boolean = js.native
    
    def is_xxlarge_up(): Boolean = js.native
    
    def random_str(): String = js.native
    def random_str(length: Double): String = js.native
    
    def register_media(media: String, media_class: String): Unit = js.native
    
    def throttle(func: js.Function1[/* repeated */ Any, Any], delay: Double): js.Function1[/* repeated */ Any, Any] = js.native
  }
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[js.Array[String]] = js.undefined
    
    var left: js.UndefOr[js.Array[String]] = js.undefined
    
    var right: js.UndefOr[js.Array[String]] = js.undefined
    
    var top: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: js.Array[String]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBottomVarargs(value: String*): Self = StObject.set(x, "bottom", js.Array(value*))
      
      inline def setLeft(value: js.Array[String]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: String*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setRight(value: js.Array[String]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: String*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setTop(value: js.Array[String]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTopVarargs(value: String*): Self = StObject.set(x, "top", js.Array(value*))
    }
  }
  
  trait Button extends StObject {
    
    var button: js.UndefOr[String] = js.undefined
    
    var expose: js.UndefOr[String] = js.undefined
    
    var expose_cover: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var modal: js.UndefOr[String] = js.undefined
    
    var prev_button: js.UndefOr[String] = js.undefined
    
    var timer: js.UndefOr[String] = js.undefined
    
    var tip: js.UndefOr[String] = js.undefined
    
    var wrapper: js.UndefOr[String] = js.undefined
  }
  object Button {
    
    inline def apply(): Button = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      inline def setExpose_cover(value: String): Self = StObject.set(x, "expose_cover", value.asInstanceOf[js.Any])
      
      inline def setExpose_coverUndefined: Self = StObject.set(x, "expose_cover", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setPrev_button(value: String): Self = StObject.set(x, "prev_button", value.asInstanceOf[js.Any])
      
      inline def setPrev_buttonUndefined: Self = StObject.set(x, "prev_button", js.undefined)
      
      inline def setTimer(value: String): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait Close extends StObject {
    
    var close: js.UndefOr[RevealCSSOptions] = js.undefined
    
    var open: js.UndefOr[RevealCSSOptions] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: RevealCSSOptions): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: RevealCSSOptions): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  trait Namespace extends StObject {
    
    var namespace: String
  }
  object Namespace {
    
    inline def apply(namespace: String): Namespace = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
