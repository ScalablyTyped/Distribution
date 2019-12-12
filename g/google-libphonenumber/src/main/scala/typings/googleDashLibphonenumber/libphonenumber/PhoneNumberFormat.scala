package typings.googleDashLibphonenumber.libphonenumber

import org.scalablytyped.runtime.TopLevel
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.E164
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneNumberFormat extends js.Object

@JSGlobal("libphonenumber.PhoneNumberFormat")
@js.native
object PhoneNumberFormat extends js.Object {
  @js.native
  sealed trait E164 extends PhoneNumberFormat
  
  @js.native
  sealed trait INTERNATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait NATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait RFC3966 extends PhoneNumberFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneNumberFormat with Double] = js.native
  /* 0 */ @js.native
  object E164 extends TopLevel[E164 with Double]
  
  /* 1 */ @js.native
  object INTERNATIONAL extends TopLevel[INTERNATIONAL with Double]
  
  /* 2 */ @js.native
  object NATIONAL extends TopLevel[NATIONAL with Double]
  
  /* 3 */ @js.native
  object RFC3966 extends TopLevel[RFC3966 with Double]
  
}

