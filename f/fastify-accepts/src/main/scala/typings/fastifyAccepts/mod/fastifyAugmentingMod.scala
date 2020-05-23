package typings.fastifyAccepts.mod

import typings.accepts.mod.Accepts
import typings.fastifyAccepts.anon.FnCall
import typings.fastifyAccepts.anon.FnCallTypes
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
    var requestCharset_Original: FnCall = js.native
    @JSName("requestCharsets")
    var requestCharsets_Original: FnCall = js.native
    @JSName("requestEncoding")
    var requestEncoding_Original: FnCall = js.native
    @JSName("requestEncodings")
    var requestEncodings_Original: FnCall = js.native
    @JSName("requestLanguage")
    var requestLanguage_Original: FnCall = js.native
    @JSName("requestLanguages")
    var requestLanguages_Original: FnCall = js.native
    @JSName("requestType")
    var requestType_Original: FnCallTypes = js.native
    @JSName("requestTypes")
    var requestTypes_Original: FnCallTypes = js.native
    def requestAccepts(): Accepts = js.native
    def requestCharset(): js.Array[String] = js.native
    def requestCharset(languages: String*): String | `false` = js.native
    def requestCharset(languages: js.Array[String]): String | `false` = js.native
    def requestCharsets(): js.Array[String] = js.native
    def requestCharsets(languages: String*): String | `false` = js.native
    def requestCharsets(languages: js.Array[String]): String | `false` = js.native
    def requestEncoding(): js.Array[String] = js.native
    def requestEncoding(languages: String*): String | `false` = js.native
    def requestEncoding(languages: js.Array[String]): String | `false` = js.native
    def requestEncodings(): js.Array[String] = js.native
    def requestEncodings(languages: String*): String | `false` = js.native
    def requestEncodings(languages: js.Array[String]): String | `false` = js.native
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
    var charset_Original: FnCall = js.native
    @JSName("charsets")
    var charsets_Original: FnCall = js.native
    @JSName("encoding")
    var encoding_Original: FnCall = js.native
    @JSName("encodings")
    var encodings_Original: FnCall = js.native
    @JSName("language")
    var language_Original: FnCall = js.native
    @JSName("languages")
    var languages_Original: FnCall = js.native
    @JSName("type")
    var type_Original: FnCallTypes = js.native
    @JSName("types")
    var types_Original: FnCallTypes = js.native
    def accepts(): Accepts = js.native
    def charset(): js.Array[String] = js.native
    def charset(languages: String*): String | `false` = js.native
    def charset(languages: js.Array[String]): String | `false` = js.native
    def charsets(): js.Array[String] = js.native
    def charsets(languages: String*): String | `false` = js.native
    def charsets(languages: js.Array[String]): String | `false` = js.native
    def encoding(): js.Array[String] = js.native
    def encoding(languages: String*): String | `false` = js.native
    def encoding(languages: js.Array[String]): String | `false` = js.native
    def encodings(): js.Array[String] = js.native
    def encodings(languages: String*): String | `false` = js.native
    def encodings(languages: js.Array[String]): String | `false` = js.native
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

