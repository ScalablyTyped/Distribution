package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var displayName: String = js.native
  
  var displayNameLastFirst: String = js.native
  
  var familyName: String = js.native
  
  var givenName: String = js.native
  
  var honorificPrefix: String = js.native
  
  var honorificSuffix: String = js.native
  
  var metadata: FieldMetadata = js.native
  
  var middleName: String = js.native
  
  var phoneticFamilyName: String = js.native
  
  var phoneticFullName: String = js.native
  
  var phoneticGivenName: String = js.native
  
  var phoneticHonorificPrefix: String = js.native
  
  var phoneticHonorificSuffix: String = js.native
  
  var phoneticMiddleName: String = js.native
}
object Name {
  
  @scala.inline
  def apply(
    displayName: String,
    displayNameLastFirst: String,
    familyName: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    metadata: FieldMetadata,
    middleName: String,
    phoneticFamilyName: String,
    phoneticFullName: String,
    phoneticGivenName: String,
    phoneticHonorificPrefix: String,
    phoneticHonorificSuffix: String,
    phoneticMiddleName: String
  ): Name = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayNameLastFirst = displayNameLastFirst.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], phoneticFamilyName = phoneticFamilyName.asInstanceOf[js.Any], phoneticFullName = phoneticFullName.asInstanceOf[js.Any], phoneticGivenName = phoneticGivenName.asInstanceOf[js.Any], phoneticHonorificPrefix = phoneticHonorificPrefix.asInstanceOf[js.Any], phoneticHonorificSuffix = phoneticHonorificSuffix.asInstanceOf[js.Any], phoneticMiddleName = phoneticMiddleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameLastFirst(value: String): Self = StObject.set(x, "displayNameLastFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticFullName(value: String): Self = StObject.set(x, "phoneticFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticHonorificPrefix(value: String): Self = StObject.set(x, "phoneticHonorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticHonorificSuffix(value: String): Self = StObject.set(x, "phoneticHonorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticMiddleName(value: String): Self = StObject.set(x, "phoneticMiddleName", value.asInstanceOf[js.Any])
  }
}
