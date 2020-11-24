package typings.emailAddresses

import typings.emailAddresses.emailAddresses.Options
import typings.emailAddresses.emailAddresses.ParsedGroup
import typings.emailAddresses.emailAddresses.ParsedMailbox
import typings.emailAddresses.emailAddresses.ParsedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("email-addresses", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
