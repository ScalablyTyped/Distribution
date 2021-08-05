package typings.frctlFractal.mod

import typings.frctlFractal.anon.Mount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebThemeOptions extends StObject {
  
  var favicon: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var nav: js.UndefOr[js.Array[String]] = js.undefined
  
  var panels: js.UndefOr[js.Array[String]] = js.undefined
  
  var rtl: Boolean
  
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var static: js.UndefOr[Mount] = js.undefined
  
  @JSName("static.mount")
  var staticDotmount: String
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object WebThemeOptions {
  
  inline def apply(rtl: Boolean, staticDotmount: String): WebThemeOptions = {
    val __obj = js.Dynamic.literal(rtl = rtl.asInstanceOf[js.Any])
    __obj.updateDynamic("static.mount")(staticDotmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebThemeOptions]
  }
  
  extension [Self <: WebThemeOptions](x: Self) {
    
    inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    inline def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
    
    inline def setPanels(value: js.Array[String]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    inline def setPanelsVarargs(value: String*): Self = StObject.set(x, "panels", js.Array(value :_*))
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setStatic(value: Mount): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticDotmount(value: String): Self = StObject.set(x, "static.mount", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
