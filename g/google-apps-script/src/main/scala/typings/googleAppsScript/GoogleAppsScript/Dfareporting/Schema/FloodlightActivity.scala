package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivity extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var cacheBustingType: js.UndefOr[String] = js.native
  
  var countingMethod: js.UndefOr[String] = js.native
  
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.native
  
  var expectedUrl: js.UndefOr[String] = js.native
  
  var floodlightActivityGroupId: js.UndefOr[String] = js.native
  
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var floodlightTagType: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var sslRequired: js.UndefOr[Boolean] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var tagFormat: js.UndefOr[String] = js.native
  
  var tagString: js.UndefOr[String] = js.native
  
  var userDefinedVariableTypes: js.UndefOr[js.Array[String]] = js.native
}
object FloodlightActivity {
  
  @scala.inline
  def apply(): FloodlightActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivity]
  }
  
  @scala.inline
  implicit class FloodlightActivityOps[Self <: FloodlightActivity] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setCacheBustingType(value: String): Self = this.set("cacheBustingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheBustingType: Self = this.set("cacheBustingType", js.undefined)
    
    @scala.inline
    def setCountingMethod(value: String): Self = this.set("countingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountingMethod: Self = this.set("countingMethod", js.undefined)
    
    @scala.inline
    def setDefaultTagsVarargs(value: FloodlightActivityDynamicTag*): Self = this.set("defaultTags", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTags(value: js.Array[FloodlightActivityDynamicTag]): Self = this.set("defaultTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTags: Self = this.set("defaultTags", js.undefined)
    
    @scala.inline
    def setExpectedUrl(value: String): Self = this.set("expectedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedUrl: Self = this.set("expectedUrl", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupId(value: String): Self = this.set("floodlightActivityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupId: Self = this.set("floodlightActivityGroupId", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupName(value: String): Self = this.set("floodlightActivityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupName: Self = this.set("floodlightActivityGroupName", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupTagString(value: String): Self = this.set("floodlightActivityGroupTagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupTagString: Self = this.set("floodlightActivityGroupTagString", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupType(value: String): Self = this.set("floodlightActivityGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroupType: Self = this.set("floodlightActivityGroupType", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationIdDimensionValue(value: DimensionValue): Self = this.set("floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationIdDimensionValue: Self = this.set("floodlightConfigurationIdDimensionValue", js.undefined)
    
    @scala.inline
    def setFloodlightTagType(value: String): Self = this.set("floodlightTagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightTagType: Self = this.set("floodlightTagType", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPublisherTagsVarargs(value: FloodlightActivityPublisherDynamicTag*): Self = this.set("publisherTags", js.Array(value :_*))
    
    @scala.inline
    def setPublisherTags(value: js.Array[FloodlightActivityPublisherDynamicTag]): Self = this.set("publisherTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherTags: Self = this.set("publisherTags", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTagFormat(value: String): Self = this.set("tagFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFormat: Self = this.set("tagFormat", js.undefined)
    
    @scala.inline
    def setTagString(value: String): Self = this.set("tagString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagString: Self = this.set("tagString", js.undefined)
    
    @scala.inline
    def setUserDefinedVariableTypesVarargs(value: String*): Self = this.set("userDefinedVariableTypes", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedVariableTypes(value: js.Array[String]): Self = this.set("userDefinedVariableTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedVariableTypes: Self = this.set("userDefinedVariableTypes", js.undefined)
  }
}
