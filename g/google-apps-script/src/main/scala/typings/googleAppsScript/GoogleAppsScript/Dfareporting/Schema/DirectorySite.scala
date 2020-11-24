package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySite extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var settings: js.UndefOr[DirectorySiteSettings] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object DirectorySite {
  
  @scala.inline
  def apply(): DirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySite]
  }
  
  @scala.inline
  implicit class DirectorySiteOps[Self <: DirectorySite] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setInpageTagFormatsVarargs(value: String*): Self = this.set("inpageTagFormats", js.Array(value :_*))
    
    @scala.inline
    def setInpageTagFormats(value: js.Array[String]): Self = this.set("inpageTagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInpageTagFormats: Self = this.set("inpageTagFormats", js.undefined)
    
    @scala.inline
    def setInterstitialTagFormatsVarargs(value: String*): Self = this.set("interstitialTagFormats", js.Array(value :_*))
    
    @scala.inline
    def setInterstitialTagFormats(value: js.Array[String]): Self = this.set("interstitialTagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterstitialTagFormats: Self = this.set("interstitialTagFormats", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSettings(value: DirectorySiteSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
