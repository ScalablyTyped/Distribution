package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSignalUserDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/signal/user-data", JSImport.Default)
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
      gender: String,
      client_ip_address: String,
      client_user_agent: String,
      fbp: String,
      fbc: String,
      subscription_id: String,
      fb_login_id: String,
      lead_id: String,
      dobd: String,
      dobm: String,
      doby: String,
      f5first: String,
      f5last: String,
      fi: String,
      address: String
    ) = this()
  }
  
  @js.native
  trait UserData extends StObject {
    
    var _business_data_user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    
    var _server_user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default = js.native
    
    def address: String = js.native
    def address_=(address: String): Unit = js.native
    
    def business_data_user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    
    def city: String = js.native
    def city_=(city: String): Unit = js.native
    
    def client_ip_address: String = js.native
    def client_ip_address_=(client_ip_address: String): Unit = js.native
    
    def client_user_agent: String = js.native
    def client_user_agent_=(client_user_agent: String): Unit = js.native
    
    def country: String = js.native
    def country_=(country: String): Unit = js.native
    
    def date_of_birth: String = js.native
    def date_of_birth_=(date_of_birth: String): Unit = js.native
    
    def dobd: String = js.native
    def dobd_=(dobd: String): Unit = js.native
    
    def dobm: String = js.native
    def dobm_=(dobm: String): Unit = js.native
    
    def doby: String = js.native
    def doby_=(doby: String): Unit = js.native
    
    def email: String = js.native
    def email_=(email: String): Unit = js.native
    
    def external_id: String = js.native
    def external_id_=(external_id: String): Unit = js.native
    
    def f5first: String = js.native
    def f5first_=(f5first: String): Unit = js.native
    
    def f5last: String = js.native
    def f5last_=(f5last: String): Unit = js.native
    
    def fb_login_id: String = js.native
    def fb_login_id_=(fb_login_id: String): Unit = js.native
    
    def fbc: String = js.native
    def fbc_=(fbc: String): Unit = js.native
    
    def fbp: String = js.native
    def fbp_=(fbp: String): Unit = js.native
    
    def fi: String = js.native
    def fi_=(fi: String): Unit = js.native
    
    def first_name: String = js.native
    def first_name_=(first_name: String): Unit = js.native
    
    def gender: String = js.native
    def gender_=(gender: String): Unit = js.native
    
    def last_name: String = js.native
    def last_name_=(last_name: String): Unit = js.native
    
    def lead_id: String = js.native
    def lead_id_=(lead_id: String): Unit = js.native
    
    def phone: String = js.native
    def phone_=(phone: String): Unit = js.native
    
    def server_user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default = js.native
    
    def setAddress(address: String): UserData = js.native
    
    def setCity(city: String): UserData = js.native
    
    def setClientIpAddress(client_ip_address: String): UserData = js.native
    
    def setClientUserAgent(client_user_agent: String): UserData = js.native
    
    def setCountry(country: String): UserData = js.native
    
    def setDateOfBirth(date_of_birth: String): UserData = js.native
    
    def setDobd(dobd: String): UserData = js.native
    
    def setDobm(dobm: String): UserData = js.native
    
    def setDoby(doby: String): UserData = js.native
    
    def setEmail(email: String): UserData = js.native
    
    def setExternalId(external_id: String): UserData = js.native
    
    def setF5First(f5first: String): UserData = js.native
    
    def setF5Last(f5last: String): UserData = js.native
    
    def setFbLoginId(fb_login_id: String): UserData = js.native
    
    def setFbc(fbc: String): UserData = js.native
    
    def setFbp(fbp: String): UserData = js.native
    
    def setFi(fi: String): UserData = js.native
    
    def setFirstName(first_name: String): UserData = js.native
    
    def setGender(gender: String): UserData = js.native
    
    def setLastName(last_name: String): UserData = js.native
    
    def setLeadId(lead_id: String): UserData = js.native
    
    def setPhone(phone: String): UserData = js.native
    
    def setState(state: String): UserData = js.native
    
    def setSubscriptionId(subscription_id: String): UserData = js.native
    
    def setZip(zip: String): UserData = js.native
    
    def state: String = js.native
    def state_=(state: String): Unit = js.native
    
    def subscription_id: String = js.native
    def subscription_id_=(subscription_id: String): Unit = js.native
    
    def zip: String = js.native
    def zip_=(zip: String): Unit = js.native
  }
}
