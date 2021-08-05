package typings.gettextParser

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gettext-parser", "mo")
  @js.native
  val mo: MoParser = js.native
  
  @JSImport("gettext-parser", "po")
  @js.native
  val po: MoParser = js.native
  
  trait GetTextComment extends StObject {
    
    var extracted: String
    
    var flag: String
    
    var previous: String
    
    var reference: String
    
    var translator: String
  }
  object GetTextComment {
    
    inline def apply(extracted: String, flag: String, previous: String, reference: String, translator: String): GetTextComment = {
      val __obj = js.Dynamic.literal(extracted = extracted.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTextComment]
    }
    
    extension [Self <: GetTextComment](x: Self) {
      
      inline def setExtracted(value: String): Self = StObject.set(x, "extracted", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setTranslator(value: String): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTextTranslation extends StObject {
    
    var comments: js.UndefOr[GetTextComment] = js.undefined
    
    var msgctxt: js.UndefOr[String] = js.undefined
    
    var msgid: String
    
    var msgid_plural: js.UndefOr[js.Any] = js.undefined
    
    var msgstr: js.Array[String]
  }
  object GetTextTranslation {
    
    inline def apply(msgid: String, msgstr: js.Array[String]): GetTextTranslation = {
      val __obj = js.Dynamic.literal(msgid = msgid.asInstanceOf[js.Any], msgstr = msgstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTextTranslation]
    }
    
    extension [Self <: GetTextTranslation](x: Self) {
      
      inline def setComments(value: GetTextComment): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setMsgctxt(value: String): Self = StObject.set(x, "msgctxt", value.asInstanceOf[js.Any])
      
      inline def setMsgctxtUndefined: Self = StObject.set(x, "msgctxt", js.undefined)
      
      inline def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
      
      inline def setMsgid_plural(value: js.Any): Self = StObject.set(x, "msgid_plural", value.asInstanceOf[js.Any])
      
      inline def setMsgid_pluralUndefined: Self = StObject.set(x, "msgid_plural", js.undefined)
      
      inline def setMsgstr(value: js.Array[String]): Self = StObject.set(x, "msgstr", value.asInstanceOf[js.Any])
      
      inline def setMsgstrVarargs(value: String*): Self = StObject.set(x, "msgstr", js.Array(value :_*))
    }
  }
  
  trait GetTextTranslations extends StObject {
    
    var charset: String
    
    var headers: StringDictionary[String]
    
    var translations: StringDictionary[StringDictionary[GetTextTranslation]]
  }
  object GetTextTranslations {
    
    inline def apply(
      charset: String,
      headers: StringDictionary[String],
      translations: StringDictionary[StringDictionary[GetTextTranslation]]
    ): GetTextTranslations = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTextTranslations]
    }
    
    extension [Self <: GetTextTranslations](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: StringDictionary[StringDictionary[GetTextTranslation]]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoParser extends StObject {
    
    def compile(table: GetTextTranslations): Buffer = js.native
    def compile(table: GetTextTranslations, options: js.Any): Buffer = js.native
    
    def parse(buffer: String): GetTextTranslations = js.native
    def parse(buffer: String, defaultCharset: String): GetTextTranslations = js.native
    def parse(buffer: Buffer): GetTextTranslations = js.native
    def parse(buffer: Buffer, defaultCharset: String): GetTextTranslations = js.native
  }
  
  @js.native
  trait PoParser extends StObject {
    
    def compile(table: GetTextTranslations): Buffer = js.native
    def compile(table: GetTextTranslations, options: js.Any): Buffer = js.native
    
    def createParseStream(buffer: js.Any): js.Any = js.native
    def createParseStream(buffer: js.Any, defaultCharset: String): js.Any = js.native
    
    def parse(buffer: String): GetTextTranslations = js.native
    def parse(buffer: String, defaultCharset: String): GetTextTranslations = js.native
    def parse(buffer: Buffer): GetTextTranslations = js.native
    def parse(buffer: Buffer, defaultCharset: String): GetTextTranslations = js.native
  }
}
