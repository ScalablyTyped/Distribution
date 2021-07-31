package typings.fastifyAccepts

import typings.accepts.mod.Accepts
import typings.fastifyAccepts.anon.FnCall
import typings.fastifyAccepts.anon.FnCallTypes
import typings.fastifyAccepts.fastifyAcceptsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("fastify-accepts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FastifyAcceptsOptions extends StObject {
    
    var decorateReplyToo: js.UndefOr[Boolean] = js.undefined
  }
  object FastifyAcceptsOptions {
    
    @scala.inline
    def apply(): FastifyAcceptsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyAcceptsOptions]
    }
    
    @scala.inline
    implicit class FastifyAcceptsOptionsMutableBuilder[Self <: FastifyAcceptsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorateReplyToo(value: Boolean): Self = StObject.set(x, "decorateReplyToo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorateReplyTooUndefined: Self = StObject.set(x, "decorateReplyToo", js.undefined)
    }
  }
  
  /* augmented module */
  object fastifyAugmentingMod {
    
    trait FastifyReply[HttpResponse] extends StObject {
      
      def requestAccepts(): Accepts
      
      def requestCharset(): js.Array[String]
      def requestCharset(languages: String*): String | `false`
      def requestCharset(languages: js.Array[String]): String | `false`
      @JSName("requestCharset")
      var requestCharset_Original: FnCall
      
      def requestCharsets(): js.Array[String]
      def requestCharsets(languages: String*): String | `false`
      def requestCharsets(languages: js.Array[String]): String | `false`
      @JSName("requestCharsets")
      var requestCharsets_Original: FnCall
      
      def requestEncoding(): js.Array[String]
      def requestEncoding(languages: String*): String | `false`
      def requestEncoding(languages: js.Array[String]): String | `false`
      @JSName("requestEncoding")
      var requestEncoding_Original: FnCall
      
      def requestEncodings(): js.Array[String]
      def requestEncodings(languages: String*): String | `false`
      def requestEncodings(languages: js.Array[String]): String | `false`
      @JSName("requestEncodings")
      var requestEncodings_Original: FnCall
      
      def requestLanguage(): js.Array[String]
      def requestLanguage(languages: String*): String | `false`
      def requestLanguage(languages: js.Array[String]): String | `false`
      @JSName("requestLanguage")
      var requestLanguage_Original: FnCall
      
      def requestLanguages(): js.Array[String]
      def requestLanguages(languages: String*): String | `false`
      def requestLanguages(languages: js.Array[String]): String | `false`
      @JSName("requestLanguages")
      var requestLanguages_Original: FnCall
      
      def requestType(types: String*): js.Array[String] | String | `false`
      def requestType(types: js.Array[String]): js.Array[String] | String | `false`
      @JSName("requestType")
      var requestType_Original: FnCallTypes
      
      def requestTypes(types: String*): js.Array[String] | String | `false`
      def requestTypes(types: js.Array[String]): js.Array[String] | String | `false`
      @JSName("requestTypes")
      var requestTypes_Original: FnCallTypes
    }
    object FastifyReply {
      
      @scala.inline
      def apply[HttpResponse](
        requestAccepts: () => Accepts,
        requestCharset: FnCall,
        requestCharsets: FnCall,
        requestEncoding: FnCall,
        requestEncodings: FnCall,
        requestLanguage: FnCall,
        requestLanguages: FnCall,
        requestType: FnCallTypes,
        requestTypes: FnCallTypes
      ): FastifyReply[HttpResponse] = {
        val __obj = js.Dynamic.literal(requestAccepts = js.Any.fromFunction0(requestAccepts), requestCharset = requestCharset.asInstanceOf[js.Any], requestCharsets = requestCharsets.asInstanceOf[js.Any], requestEncoding = requestEncoding.asInstanceOf[js.Any], requestEncodings = requestEncodings.asInstanceOf[js.Any], requestLanguage = requestLanguage.asInstanceOf[js.Any], requestLanguages = requestLanguages.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], requestTypes = requestTypes.asInstanceOf[js.Any])
        __obj.asInstanceOf[FastifyReply[HttpResponse]]
      }
      
      @scala.inline
      implicit class FastifyReplyMutableBuilder[Self <: FastifyReply[?], HttpResponse] (val x: Self & FastifyReply[HttpResponse]) extends AnyVal {
        
        @scala.inline
        def setRequestAccepts(value: () => Accepts): Self = StObject.set(x, "requestAccepts", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRequestCharset(value: FnCall): Self = StObject.set(x, "requestCharset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestCharsets(value: FnCall): Self = StObject.set(x, "requestCharsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestEncoding(value: FnCall): Self = StObject.set(x, "requestEncoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestEncodings(value: FnCall): Self = StObject.set(x, "requestEncodings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestLanguage(value: FnCall): Self = StObject.set(x, "requestLanguage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestLanguages(value: FnCall): Self = StObject.set(x, "requestLanguages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestType(value: FnCallTypes): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestTypes(value: FnCallTypes): Self = StObject.set(x, "requestTypes", value.asInstanceOf[js.Any])
      }
    }
    
    trait FastifyRequest[HttpRequest] extends StObject {
      
      def accepts(): Accepts
      
      def charset(): js.Array[String]
      def charset(languages: String*): String | `false`
      def charset(languages: js.Array[String]): String | `false`
      @JSName("charset")
      var charset_Original: FnCall
      
      def charsets(): js.Array[String]
      def charsets(languages: String*): String | `false`
      def charsets(languages: js.Array[String]): String | `false`
      @JSName("charsets")
      var charsets_Original: FnCall
      
      def encoding(): js.Array[String]
      def encoding(languages: String*): String | `false`
      def encoding(languages: js.Array[String]): String | `false`
      @JSName("encoding")
      var encoding_Original: FnCall
      
      def encodings(): js.Array[String]
      def encodings(languages: String*): String | `false`
      def encodings(languages: js.Array[String]): String | `false`
      @JSName("encodings")
      var encodings_Original: FnCall
      
      def language(): js.Array[String]
      def language(languages: String*): String | `false`
      def language(languages: js.Array[String]): String | `false`
      @JSName("language")
      var language_Original: FnCall
      
      def languages(): js.Array[String]
      def languages(languages: String*): String | `false`
      def languages(languages: js.Array[String]): String | `false`
      @JSName("languages")
      var languages_Original: FnCall
      
      def `type`(types: String*): js.Array[String] | String | `false`
      def `type`(types: js.Array[String]): js.Array[String] | String | `false`
      @JSName("type")
      var type_Original: FnCallTypes
      
      def types(types: String*): js.Array[String] | String | `false`
      def types(types: js.Array[String]): js.Array[String] | String | `false`
      @JSName("types")
      var types_Original: FnCallTypes
    }
    object FastifyRequest {
      
      @scala.inline
      def apply[HttpRequest](
        accepts: () => Accepts,
        charset: FnCall,
        charsets: FnCall,
        encoding: FnCall,
        encodings: FnCall,
        language: FnCall,
        languages: FnCall,
        `type`: FnCallTypes,
        types: FnCallTypes
      ): FastifyRequest[HttpRequest] = {
        val __obj = js.Dynamic.literal(accepts = js.Any.fromFunction0(accepts), charset = charset.asInstanceOf[js.Any], charsets = charsets.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[FastifyRequest[HttpRequest]]
      }
      
      @scala.inline
      implicit class FastifyRequestMutableBuilder[Self <: FastifyRequest[?], HttpRequest] (val x: Self & FastifyRequest[HttpRequest]) extends AnyVal {
        
        @scala.inline
        def setAccepts(value: () => Accepts): Self = StObject.set(x, "accepts", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCharset(value: FnCall): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharsets(value: FnCall): Self = StObject.set(x, "charsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncoding(value: FnCall): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncodings(value: FnCall): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: FnCall): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguages(value: FnCall): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: FnCallTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypes(value: FnCallTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      }
    }
  }
}
