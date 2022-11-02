package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServerSideUtils {
  
  @JSImport("facebook-nodejs-business-sdk", "ServerSideUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInternationalPhoneNumber(phone_number: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternationalPhoneNumber")(phone_number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeAndHash(input: String, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAndHash")(input.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normalizeCity(city: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeCity")(city.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeCountry(country: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeCountry")(country.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeCurrency(currency: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeCurrency")(currency.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeDeliveryCategory(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDeliveryCategory")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeDobd(dobd: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDobd")(dobd.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeDobm(dobm: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDobm")(dobm.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeDoby(doby: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDoby")(doby.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeEmail(email: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(email.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeF5NameField(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeF5NameField")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeGender(gender: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeGender")(gender.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def normalizePhone(phone_number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePhone")(phone_number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeState(state: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeState")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeZip(zip: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeZip")(zip.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def toSHA256(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toSHA256")().asInstanceOf[Any]
  inline def toSHA256(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toSHA256")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
