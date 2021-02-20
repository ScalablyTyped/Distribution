package typings.googleLibphonenumber.libphonenumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneNumberFormat extends StObject
@JSGlobal("libphonenumber.PhoneNumberFormat")
@js.native
object PhoneNumberFormat extends StObject {
  
  @js.native
  sealed trait E164 extends PhoneNumberFormat
  
  @js.native
  sealed trait INTERNATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait NATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait RFC3966 extends PhoneNumberFormat
}
