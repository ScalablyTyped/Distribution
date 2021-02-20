package typings.frctlFractal.mod

import typings.frctlFractal.anon.Mount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebThemeOptions extends StObject {
  
  var favicon: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var nav: js.UndefOr[js.Array[String]] = js.native
  
  var panels: js.UndefOr[js.Array[String]] = js.native
  
  var rtl: Boolean = js.native
  
  var scripts: js.UndefOr[js.Array[String]] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var static: js.UndefOr[Mount] = js.native
  
  @JSName("static.mount")
  var staticDotmount: String = js.native
  
  var styles: js.UndefOr[js.Array[String]] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object WebThemeOptions {
  
  @scala.inline
  def apply(rtl: Boolean, staticDotmount: String): WebThemeOptions = {
    val __obj = js.Dynamic.literal(rtl = rtl.asInstanceOf[js.Any])
    __obj.updateDynamic("static.mount")(staticDotmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebThemeOptions]
  }
  
  @scala.inline
  implicit class WebThemeOptionsMutableBuilder[Self <: WebThemeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    @scala.inline
    def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
    
    @scala.inline
    def setPanels(value: js.Array[String]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    @scala.inline
    def setPanelsVarargs(value: String*): Self = StObject.set(x, "panels", js.Array(value :_*))
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setStatic(value: Mount): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticDotmount(value: String): Self = StObject.set(x, "static.mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
