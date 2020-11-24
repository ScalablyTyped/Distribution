package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var displayNameLastFirst: js.UndefOr[String] = js.native
  
  var familyName: js.UndefOr[String] = js.native
  
  var givenName: js.UndefOr[String] = js.native
  
  var honorificPrefix: js.UndefOr[String] = js.native
  
  var honorificSuffix: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  var middleName: js.UndefOr[String] = js.native
  
  var phoneticFamilyName: js.UndefOr[String] = js.native
  
  var phoneticFullName: js.UndefOr[String] = js.native
  
  var phoneticGivenName: js.UndefOr[String] = js.native
  
  var phoneticHonorificPrefix: js.UndefOr[String] = js.native
  
  var phoneticHonorificSuffix: js.UndefOr[String] = js.native
  
  var phoneticMiddleName: js.UndefOr[String] = js.native
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameLastFirst(value: String): Self = this.set("displayNameLastFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayNameLastFirst: Self = this.set("displayNameLastFirst", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setHonorificPrefix(value: String): Self = this.set("honorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorificPrefix: Self = this.set("honorificPrefix", js.undefined)
    
    @scala.inline
    def setHonorificSuffix(value: String): Self = this.set("honorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorificSuffix: Self = this.set("honorificSuffix", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = this.set("phoneticFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticFamilyName: Self = this.set("phoneticFamilyName", js.undefined)
    
    @scala.inline
    def setPhoneticFullName(value: String): Self = this.set("phoneticFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticFullName: Self = this.set("phoneticFullName", js.undefined)
    
    @scala.inline
    def setPhoneticGivenName(value: String): Self = this.set("phoneticGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticGivenName: Self = this.set("phoneticGivenName", js.undefined)
    
    @scala.inline
    def setPhoneticHonorificPrefix(value: String): Self = this.set("phoneticHonorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticHonorificPrefix: Self = this.set("phoneticHonorificPrefix", js.undefined)
    
    @scala.inline
    def setPhoneticHonorificSuffix(value: String): Self = this.set("phoneticHonorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticHonorificSuffix: Self = this.set("phoneticHonorificSuffix", js.undefined)
    
    @scala.inline
    def setPhoneticMiddleName(value: String): Self = this.set("phoneticMiddleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticMiddleName: Self = this.set("phoneticMiddleName", js.undefined)
  }
}
