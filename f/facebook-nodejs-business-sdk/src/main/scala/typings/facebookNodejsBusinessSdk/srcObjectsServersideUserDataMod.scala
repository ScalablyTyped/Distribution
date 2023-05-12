package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideUserDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/user-data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UserData {
    def this(
      email: js.UndefOr[String],
      phone: js.UndefOr[String],
      gender: js.UndefOr[String],
      first_name: js.UndefOr[String],
      last_name: js.UndefOr[String],
      date_of_birth: js.UndefOr[String],
      city: js.UndefOr[String],
      state: js.UndefOr[String],
      zip: js.UndefOr[String],
      country: js.UndefOr[String],
      external_id: js.UndefOr[String],
      client_ip_address: js.UndefOr[String],
      client_user_agent: js.UndefOr[String],
      fbp: js.UndefOr[String],
      fbc: js.UndefOr[String],
      subscription_id: js.UndefOr[String],
      fb_login_id: js.UndefOr[String],
      lead_id: js.UndefOr[String],
      dobd: js.UndefOr[String],
      dobm: js.UndefOr[String],
      doby: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  trait UserData extends StObject {
    
    var _cities: js.Array[String] = js.native
    
    var _client_ip_address: String = js.native
    
    var _client_user_agent: String = js.native
    
    var _countries: js.Array[String] = js.native
    
    var _dates_of_birth: js.Array[String] = js.native
    
    var _dobd: String = js.native
    
    var _dobm: String = js.native
    
    var _doby: String = js.native
    
    var _emails: js.Array[String] = js.native
    
    var _external_ids: js.Array[String] = js.native
    
    var _f5first: String = js.native
    
    var _f5last: String = js.native
    
    var _fb_login_id: String = js.native
    
    var _fbc: String = js.native
    
    var _fbp: String = js.native
    
    var _fi: String = js.native
    
    var _first_names: js.Array[String] = js.native
    
    var _genders: js.Array[String] = js.native
    
    var _last_names: js.Array[String] = js.native
    
    var _lead_id: String = js.native
    
    var _phones: js.Array[String] = js.native
    
    var _states: js.Array[String] = js.native
    
    var _subscription_id: String = js.native
    
    var _zips: js.Array[String] = js.native
    
    def cities: js.Array[String] = js.native
    def cities_=(cities: js.Array[String]): Unit = js.native
    
    def city: String = js.native
    def city_=(city: String): Unit = js.native
    
    def client_ip_address: String = js.native
    def client_ip_address_=(client_ip_address: String): Unit = js.native
    
    def client_user_agent: String = js.native
    def client_user_agent_=(client_user_agent: String): Unit = js.native
    
    def countries: js.Array[String] = js.native
    def countries_=(countries: js.Array[String]): Unit = js.native
    
    def country: String = js.native
    def country_=(country: String): Unit = js.native
    
    def date_of_birth: String = js.native
    def date_of_birth_=(date_of_birth: String): Unit = js.native
    
    def dates_of_birth: js.Array[String] = js.native
    def dates_of_birth_=(dates_of_birth: js.Array[String]): Unit = js.native
    
    def dedupArray(arr: js.Array[String]): js.Array[String] = js.native
    
    def dobd: String = js.native
    def dobd_=(dobd: String): Unit = js.native
    
    def dobm: String = js.native
    def dobm_=(dobm: String): Unit = js.native
    
    def doby: String = js.native
    def doby_=(doby: String): Unit = js.native
    
    def email: String = js.native
    def email_=(email: String): Unit = js.native
    
    def emails: js.Array[String] = js.native
    def emails_=(emails: js.Array[String]): Unit = js.native
    
    def external_id: String = js.native
    def external_id_=(external_id: String): Unit = js.native
    
    def external_ids: js.Array[String] = js.native
    def external_ids_=(external_ids: js.Array[String]): Unit = js.native
    
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
    
    def first_names: js.Array[String] = js.native
    def first_names_=(first_names: js.Array[String]): Unit = js.native
    
    def gender: String = js.native
    def gender_=(gender: String): Unit = js.native
    
    def genders: js.Array[String] = js.native
    def genders_=(genders: js.Array[String]): Unit = js.native
    
    def last_name: String = js.native
    def last_name_=(last_name: String): Unit = js.native
    
    def last_names: js.Array[String] = js.native
    def last_names_=(last_names: js.Array[String]): Unit = js.native
    
    def lead_id: String = js.native
    def lead_id_=(lead_id: String): Unit = js.native
    
    def normalize(): Record[String, Any] = js.native
    
    def normalizeAndHashMultiValues(arr: js.Array[String], fieldName: String): js.Array[String] = js.native
    
    def phone: String = js.native
    def phone_=(phone: String): Unit = js.native
    
    def phones: js.Array[String] = js.native
    def phones_=(phones: js.Array[String]): Unit = js.native
    
    def setCities(cities: js.Array[String]): UserData = js.native
    
    def setCity(city: String): UserData = js.native
    
    def setClientIpAddress(client_ip_address: String): UserData = js.native
    
    def setClientUserAgent(client_user_agent: String): UserData = js.native
    
    def setCountries(countries: js.Array[String]): UserData = js.native
    
    def setCountry(country: String): UserData = js.native
    
    def setDateOfBirth(date_of_birth: String): UserData = js.native
    
    def setDatesOfBirth(dates_of_birth: js.Array[String]): UserData = js.native
    
    def setDobd(dobd: String): UserData = js.native
    
    def setDobm(dobm: String): UserData = js.native
    
    def setDoby(doby: String): UserData = js.native
    
    def setEmail(email: String): UserData = js.native
    
    def setEmails(emails: js.Array[String]): UserData = js.native
    
    def setExternalId(external_id: String): UserData = js.native
    
    def setExternalIds(external_ids: js.Array[String]): UserData = js.native
    
    def setF5First(f5first: String): UserData = js.native
    
    def setF5Last(f5last: String): UserData = js.native
    
    def setFbLoginId(fb_login_id: String): UserData = js.native
    
    def setFbc(fbc: String): UserData = js.native
    
    def setFbp(fbp: String): UserData = js.native
    
    def setFi(fi: String): UserData = js.native
    
    def setFirstName(first_name: String): UserData = js.native
    
    def setFirstNames(first_names: js.Array[String]): UserData = js.native
    
    def setGender(gender: String): UserData = js.native
    
    def setGenders(genders: js.Array[String]): UserData = js.native
    
    def setLastName(last_name: String): UserData = js.native
    
    def setLastNames(last_names: js.Array[String]): UserData = js.native
    
    def setLeadId(lead_id: String): UserData = js.native
    
    def setPhone(phone: String): UserData = js.native
    
    def setPhones(phones: js.Array[String]): UserData = js.native
    
    def setState(state: String): UserData = js.native
    
    def setStates(states: js.Array[String]): UserData = js.native
    
    def setSubscriptionId(subscription_id: String): UserData = js.native
    
    def setZip(zip: String): UserData = js.native
    
    def setZips(zips: js.Array[String]): UserData = js.native
    
    def state: String = js.native
    def state_=(state: String): Unit = js.native
    
    def states: js.Array[String] = js.native
    def states_=(states: js.Array[String]): Unit = js.native
    
    def subscription_id: String = js.native
    def subscription_id_=(subscription_id: String): Unit = js.native
    
    def zip: String = js.native
    def zip_=(zip: String): Unit = js.native
    
    def zips: js.Array[String] = js.native
    def zips_=(zips: js.Array[String]): Unit = js.native
  }
}
