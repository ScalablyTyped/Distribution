package typings.emailDashAddresses

import typings.emailDashAddresses.emailAddressesNs.Options
import typings.emailDashAddresses.emailAddressesNs.ParsedGroup
import typings.emailDashAddresses.emailAddressesNs.ParsedMailbox
import typings.emailDashAddresses.emailAddressesNs.ParsedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-addresses", JSImport.Namespace)
@js.native
object emailDashAddressesMod extends js.Object {
  def apply(opts: Options): ParsedResult = js.native
  def parseAddressList(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseAddressList(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseFrom(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseFrom(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseOneAddress(input: String): ParsedMailbox | ParsedGroup = js.native
  def parseOneAddress(input: Options): ParsedMailbox | ParsedGroup = js.native
  def parseReplyTo(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseReplyTo(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseSender(input: String): ParsedMailbox | ParsedGroup = js.native
  def parseSender(input: Options): ParsedMailbox | ParsedGroup = js.native
}

