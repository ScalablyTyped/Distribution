package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conversion extends js.Object {
  
  var childDirectedTreatment: js.UndefOr[Boolean] = js.native
  
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.native
  
  var encryptedUserId: js.UndefOr[String] = js.native
  
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.native
  
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  
  var gclid: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var limitAdTracking: js.UndefOr[Boolean] = js.native
  
  var mobileDeviceId: js.UndefOr[String] = js.native
  
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.native
  
  var ordinal: js.UndefOr[String] = js.native
  
  var quantity: js.UndefOr[String] = js.native
  
  var timestampMicros: js.UndefOr[String] = js.native
  
  var treatmentForUnderage: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Conversion {
  
  @scala.inline
  def apply(): Conversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversion]
  }
  
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    
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
    def setChildDirectedTreatment(value: Boolean): Self = this.set("childDirectedTreatment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDirectedTreatment: Self = this.set("childDirectedTreatment", js.undefined)
    
    @scala.inline
    def setCustomVariablesVarargs(value: CustomFloodlightVariable*): Self = this.set("customVariables", js.Array(value :_*))
    
    @scala.inline
    def setCustomVariables(value: js.Array[CustomFloodlightVariable]): Self = this.set("customVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomVariables: Self = this.set("customVariables", js.undefined)
    
    @scala.inline
    def setEncryptedUserId(value: String): Self = this.set("encryptedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedUserId: Self = this.set("encryptedUserId", js.undefined)
    
    @scala.inline
    def setEncryptedUserIdCandidatesVarargs(value: String*): Self = this.set("encryptedUserIdCandidates", js.Array(value :_*))
    
    @scala.inline
    def setEncryptedUserIdCandidates(value: js.Array[String]): Self = this.set("encryptedUserIdCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedUserIdCandidates: Self = this.set("encryptedUserIdCandidates", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationId(value: String): Self = this.set("floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigurationId: Self = this.set("floodlightConfigurationId", js.undefined)
    
    @scala.inline
    def setGclid(value: String): Self = this.set("gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGclid: Self = this.set("gclid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLimitAdTracking(value: Boolean): Self = this.set("limitAdTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitAdTracking: Self = this.set("limitAdTracking", js.undefined)
    
    @scala.inline
    def setMobileDeviceId(value: String): Self = this.set("mobileDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceId: Self = this.set("mobileDeviceId", js.undefined)
    
    @scala.inline
    def setNonPersonalizedAd(value: Boolean): Self = this.set("nonPersonalizedAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonPersonalizedAd: Self = this.set("nonPersonalizedAd", js.undefined)
    
    @scala.inline
    def setOrdinal(value: String): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setTimestampMicros(value: String): Self = this.set("timestampMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampMicros: Self = this.set("timestampMicros", js.undefined)
    
    @scala.inline
    def setTreatmentForUnderage(value: Boolean): Self = this.set("treatmentForUnderage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentForUnderage: Self = this.set("treatmentForUnderage", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
