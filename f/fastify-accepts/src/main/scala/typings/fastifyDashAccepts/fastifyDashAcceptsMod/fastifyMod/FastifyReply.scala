package typings.fastifyDashAccepts.fastifyDashAcceptsMod.fastifyMod

import typings.accepts.acceptsMod.Accepts
import typings.fastifyDashAccepts.Fn_Charsets
import typings.fastifyDashAccepts.Fn_Encodings
import typings.fastifyDashAccepts.Fn_False
import typings.fastifyDashAccepts.Fn_FalseTypes
import typings.fastifyDashAccepts.fastifyDashAcceptsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyReply[HttpResponse] extends js.Object {
  @JSName("requestCharset")
  var requestCharset_Original: Fn_Charsets = js.native
  @JSName("requestCharsets")
  var requestCharsets_Original: Fn_Charsets = js.native
  @JSName("requestEncoding")
  var requestEncoding_Original: Fn_Encodings = js.native
  @JSName("requestEncodings")
  var requestEncodings_Original: Fn_Charsets = js.native
  @JSName("requestLanguage")
  var requestLanguage_Original: Fn_False = js.native
  @JSName("requestLanguages")
  var requestLanguages_Original: Fn_False = js.native
  @JSName("requestType")
  var requestType_Original: Fn_FalseTypes = js.native
  @JSName("requestTypes")
  var requestTypes_Original: Fn_FalseTypes = js.native
  def requestAccepts(): Accepts = js.native
  def requestCharset(): js.Array[String] = js.native
  def requestCharset(charsets: String*): String | `false` = js.native
  def requestCharset(charsets: js.Array[String]): String | `false` = js.native
  def requestCharsets(): js.Array[String] = js.native
  def requestCharsets(charsets: String*): String | `false` = js.native
  def requestCharsets(charsets: js.Array[String]): String | `false` = js.native
  def requestEncoding(): js.Array[String] = js.native
  def requestEncoding(encodings: String*): String | `false` = js.native
  def requestEncoding(encodings: js.Array[String]): String | `false` = js.native
  def requestEncodings(): js.Array[String] = js.native
  def requestEncodings(charsets: String*): String | `false` = js.native
  def requestEncodings(charsets: js.Array[String]): String | `false` = js.native
  def requestLanguage(): js.Array[String] = js.native
  def requestLanguage(languages: String*): String | `false` = js.native
  def requestLanguage(languages: js.Array[String]): String | `false` = js.native
  def requestLanguages(): js.Array[String] = js.native
  def requestLanguages(languages: String*): String | `false` = js.native
  def requestLanguages(languages: js.Array[String]): String | `false` = js.native
  def requestType(types: String*): js.Array[String] | String | `false` = js.native
  def requestType(types: js.Array[String]): js.Array[String] | String | `false` = js.native
  def requestTypes(types: String*): js.Array[String] | String | `false` = js.native
  def requestTypes(types: js.Array[String]): js.Array[String] | String | `false` = js.native
}

