package typings.gettextJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gettext.js", "i18n")
  @js.native
  val i18n: GettextStatic = js.native
  
  @js.native
  trait Gettext extends StObject {
    
    def __(msgid: String, args: js.Any*): String = js.native
    
    def _n(msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
    
    def _p(msgctxt: String, msgid: String, args: js.Any*): String = js.native
    
    def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
    
    def getLocale(): String = js.native
    
    def gettext(msgid: String, args: js.Any*): String = js.native
    
    def loadJSON(jsonData: JsonData): Gettext = js.native
    def loadJSON(jsonData: JsonData, domain: String): Gettext = js.native
    
    def ngettext(msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
    
    def pgettext(msgctxt: String, msgid: String, args: js.Any*): String = js.native
    
    def setLocale(locale: String): Gettext = js.native
    
    def setMessages(domain: String, locale: String, messages: JsonDataMessages): Gettext = js.native
    def setMessages(domain: String, locale: String, messages: JsonDataMessages, plural_forms: PluralForm): Gettext = js.native
    
    def textdomain(): Gettext | String = js.native
    def textdomain(domain: String): Gettext | String = js.native
  }
  
  @js.native
  trait GettextOptions extends StObject {
    
    var ctxt_delimiter: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var plural_func: js.UndefOr[PluralForm] = js.native
  }
  object GettextOptions {
    
    @scala.inline
    def apply(): GettextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GettextOptions]
    }
    
    @scala.inline
    implicit class GettextOptionsMutableBuilder[Self <: GettextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtxt_delimiter(value: String): Self = StObject.set(x, "ctxt_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxt_delimiterUndefined: Self = StObject.set(x, "ctxt_delimiter", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPlural_func(value: /* n */ Double => Double): Self = StObject.set(x, "plural_func", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlural_funcUndefined: Self = StObject.set(x, "plural_func", js.undefined)
    }
  }
  
  type GettextStatic = js.Function1[/* options */ js.UndefOr[GettextOptions], Gettext]
  
  @js.native
  trait JsonData extends JsonDataMessages {
    
    @JSName("")
    var _empty: JsonDataHeader = js.native
  }
  object JsonData {
    
    @scala.inline
    def apply(_empty: JsonDataHeader): JsonData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonData]
    }
    
    @scala.inline
    implicit class JsonDataMutableBuilder[Self <: JsonData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_empty(value: JsonDataHeader): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsonDataHeader extends StObject {
    
    var language: String = js.native
    
    var `plural-forms`: String = js.native
  }
  object JsonDataHeader {
    
    @scala.inline
    def apply(language: String, `plural-forms`: String): JsonDataHeader = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonDataHeader]
    }
    
    @scala.inline
    implicit class JsonDataHeaderMutableBuilder[Self <: JsonDataHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlural-forms`(value: String): Self = StObject.set(x, "plural-forms", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonDataMessages = StringDictionary[String | js.Array[String] | JsonDataHeader]
  
  type PluralForm = js.Function1[/* n */ Double, Double]
}
