package typings.frctlFractal.mod

import typings.frctlFractal.anon.Mount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebThemeOptions extends js.Object {
  
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
  implicit class WebThemeOptionsOps[Self <: WebThemeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticDotmount(value: String): Self = this.set("static.mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setNavVarargs(value: String*): Self = this.set("nav", js.Array(value :_*))
    
    @scala.inline
    def setNav(value: js.Array[String]): Self = this.set("nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    
    @scala.inline
    def setPanelsVarargs(value: String*): Self = this.set("panels", js.Array(value :_*))
    
    @scala.inline
    def setPanels(value: js.Array[String]): Self = this.set("panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanels: Self = this.set("panels", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setStatic(value: Mount): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
