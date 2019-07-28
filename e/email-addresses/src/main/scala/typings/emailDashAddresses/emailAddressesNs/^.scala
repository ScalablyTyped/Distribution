package typings.emailDashAddresses.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("emailAddresses")
@js.native
object ^ extends js.Object {
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

