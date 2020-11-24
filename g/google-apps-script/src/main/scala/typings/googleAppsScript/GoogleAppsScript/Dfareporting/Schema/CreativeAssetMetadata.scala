package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetMetadata extends js.Object {
  
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.native
}
object CreativeAssetMetadata {
  
  @scala.inline
  def apply(): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
  
  @scala.inline
  implicit class CreativeAssetMetadataOps[Self <: CreativeAssetMetadata] (val x: Self) extends AnyVal {
    
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
    def setAssetIdentifier(value: CreativeAssetId): Self = this.set("assetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetIdentifier: Self = this.set("assetIdentifier", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: ClickTag*): Self = this.set("clickTags", js.Array(value :_*))
    
    @scala.inline
    def setClickTags(value: js.Array[ClickTag]): Self = this.set("clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTags: Self = this.set("clickTags", js.undefined)
    
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = this.set("detectedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = this.set("detectedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedFeatures: Self = this.set("detectedFeatures", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setWarnedValidationRulesVarargs(value: String*): Self = this.set("warnedValidationRules", js.Array(value :_*))
    
    @scala.inline
    def setWarnedValidationRules(value: js.Array[String]): Self = this.set("warnedValidationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnedValidationRules: Self = this.set("warnedValidationRules", js.undefined)
  }
}
