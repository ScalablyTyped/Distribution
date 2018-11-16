package typings
package emailDashAddressesLib.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("emailAddresses")
@js.native
object emailAddressesNsMembers extends js.Object {
  def parseAddressList(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseAddressList(input: java.lang.String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseFrom(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseFrom(input: java.lang.String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseOneAddress(input: Options): ParsedMailbox | ParsedGroup = js.native
  def parseOneAddress(input: java.lang.String): ParsedMailbox | ParsedGroup = js.native
  def parseReplyTo(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseReplyTo(input: java.lang.String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  def parseSender(input: Options): ParsedMailbox | ParsedGroup = js.native
  def parseSender(input: java.lang.String): ParsedMailbox | ParsedGroup = js.native
}

