package typings.fastifyAccepts.mod

import typings.accepts.mod.Accepts
import typings.fastifyAccepts.FnCharsets
import typings.fastifyAccepts.FnEncodings
import typings.fastifyAccepts.FnFalse
import typings.fastifyAccepts.FnFalseTypes
import typings.fastifyAccepts.fastifyAcceptsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("fastify", JSImport.Namespace)
@js.native
object fastifyAugmentingMod extends js.Object {
  @js.native
  trait FastifyReply[HttpResponse] extends js.Object {
    @JSName("requestCharset")
    var requestCharset_Original: FnCharsets = js.native
    @JSName("requestCharsets")
    var requestCharsets_Original: FnCharsets = js.native
    @JSName("requestEncoding")
    var requestEncoding_Original: FnEncodings = js.native
    @JSName("requestEncodings")
    var requestEncodings_Original: FnCharsets = js.native
    @JSName("requestLanguage")
    var requestLanguage_Original: FnFalse = js.native
    @JSName("requestLanguages")
    var requestLanguages_Original: FnFalse = js.native
    @JSName("requestType")
    var requestType_Original: FnFalseTypes = js.native
    @JSName("requestTypes")
    var requestTypes_Original: FnFalseTypes = js.native
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
  
  @js.native
  trait FastifyRequest[HttpRequest] extends js.Object {
    @JSName("charset")
    var charset_Original: FnCharsets = js.native
    @JSName("charsets")
    var charsets_Original: FnCharsets = js.native
    @JSName("encoding")
    var encoding_Original: FnEncodings = js.native
    @JSName("encodings")
    var encodings_Original: FnCharsets = js.native
    @JSName("language")
    var language_Original: FnFalse = js.native
    @JSName("languages")
    var languages_Original: FnFalse = js.native
    @JSName("type")
    var type_Original: FnFalseTypes = js.native
    @JSName("types")
    var types_Original: FnFalseTypes = js.native
    def accepts(): Accepts = js.native
    def charset(): js.Array[String] = js.native
    def charset(charsets: String*): String | `false` = js.native
    def charset(charsets: js.Array[String]): String | `false` = js.native
    def charsets(): js.Array[String] = js.native
    def charsets(charsets: String*): String | `false` = js.native
    def charsets(charsets: js.Array[String]): String | `false` = js.native
    def encoding(): js.Array[String] = js.native
    def encoding(encodings: String*): String | `false` = js.native
    def encoding(encodings: js.Array[String]): String | `false` = js.native
    def encodings(): js.Array[String] = js.native
    def encodings(charsets: String*): String | `false` = js.native
    def encodings(charsets: js.Array[String]): String | `false` = js.native
    def language(): js.Array[String] = js.native
    def language(languages: String*): String | `false` = js.native
    def language(languages: js.Array[String]): String | `false` = js.native
    def languages(): js.Array[String] = js.native
    def languages(languages: String*): String | `false` = js.native
    def languages(languages: js.Array[String]): String | `false` = js.native
    def `type`(types: String*): js.Array[String] | String | `false` = js.native
    def `type`(types: js.Array[String]): js.Array[String] | String | `false` = js.native
    def types(types: String*): js.Array[String] | String | `false` = js.native
    def types(types: js.Array[String]): js.Array[String] | String | `false` = js.native
  }
  
}

