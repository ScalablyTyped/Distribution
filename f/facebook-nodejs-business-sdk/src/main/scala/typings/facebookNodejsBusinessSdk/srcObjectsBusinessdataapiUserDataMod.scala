package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiUserDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/user-data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UserData {
    def this(
      email: String,
      phone: String,
      first_name: String,
      last_name: String,
      date_of_birth: String,
      city: String,
      state: String,
      zip: String,
      country: String,
      external_id: String,
      address: String
    ) = this()
  }
  
  @js.native
  trait UserData extends StObject {
    
    var _address: String = js.native
    
    var _city: String = js.native
    
    var _country: String = js.native
    
    var _date_of_birth: String = js.native
    
    var _email: String = js.native
    
    var _external_id: String = js.native
    
    var _first_name: String = js.native
    
    var _last_name: String = js.native
    
    var _phone: String = js.native
    
    var _state: String = js.native
    
    var _zip: String = js.native
    
    def address: String = js.native
    def address_=(address: String): Unit = js.native
    
    def city: String = js.native
    def city_=(city: String): Unit = js.native
    
    def country: String = js.native
    def country_=(country: String): Unit = js.native
    
    def date_of_birth: String = js.native
    def date_of_birth_=(date_of_birth: String): Unit = js.native
    
    def email: String = js.native
    def email_=(email: String): Unit = js.native
    
    def external_id: String = js.native
    def external_id_=(external_id: String): Unit = js.native
    
    def first_name: String = js.native
    def first_name_=(first_name: String): Unit = js.native
    
    def last_name: String = js.native
    def last_name_=(last_name: String): Unit = js.native
    
    def phone: String = js.native
    def phone_=(phone: String): Unit = js.native
    
    def setAddress(address: String): Unit = js.native
    
    def setCity(city: String): UserData = js.native
    
    def setCountry(country: String): UserData = js.native
    
    def setDateOfBirth(date_of_birth: String): UserData = js.native
    
    def setEmail(email: String): UserData = js.native
    
    def setExternalId(external_id: String): UserData = js.native
    
    def setFirstName(first_name: String): UserData = js.native
    
    def setLastName(last_name: String): UserData = js.native
    
    def setPhone(phone: String): UserData = js.native
    
    def setState(state: String): UserData = js.native
    
    def setZip(zip: String): UserData = js.native
    
    def state: String = js.native
    def state_=(state: String): Unit = js.native
    
    def toJson(): Record[String, Any] = js.native
    
    def zip: String = js.native
    def zip_=(zip: String): Unit = js.native
  }
}
