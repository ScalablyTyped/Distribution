package typings
package emailDashAddressesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-addresses", JSImport.Namespace)
@js.native
object emailDashAddressesMod extends js.Object {
  def apply(opts: emailDashAddressesLib.emailAddressesNs.Options): emailDashAddressesLib.emailAddressesNs.ParsedResult = js.native
  def parseAddressList(input: emailDashAddressesLib.emailAddressesNs.Options): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseAddressList(input: java.lang.String): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseFrom(input: emailDashAddressesLib.emailAddressesNs.Options): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseFrom(input: java.lang.String): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseOneAddress(input: emailDashAddressesLib.emailAddressesNs.Options): emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup = js.native
  def parseOneAddress(input: java.lang.String): emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup = js.native
  def parseReplyTo(input: emailDashAddressesLib.emailAddressesNs.Options): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseReplyTo(input: java.lang.String): js.Array[
    emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup
  ] = js.native
  def parseSender(input: emailDashAddressesLib.emailAddressesNs.Options): emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup = js.native
  def parseSender(input: java.lang.String): emailDashAddressesLib.emailAddressesNs.ParsedMailbox | emailDashAddressesLib.emailAddressesNs.ParsedGroup = js.native
}

