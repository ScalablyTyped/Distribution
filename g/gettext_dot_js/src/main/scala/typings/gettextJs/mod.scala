package typings.gettextJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Gettext = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Gettext]
  inline def apply(options: GettextOptions): Gettext = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Gettext]
  
  @JSImport("gettext.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Gettext extends StObject {
    
    def __(msgid: String, args: Any*): String = js.native
    
    def _n(msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
    def _p(msgctxt: String, msgid: String, args: Any*): String = js.native
    
    def dcnpgettext(
      domain: Optionull[String],
      msgctxt: Optionull[String],
      msgid: String,
      msgid_plural: Optionull[String],
      n: Optionull[Double],
      args: Any*
    ): String = js.native
    
    def expand_locale(locale: String): js.Array[String] = js.native
    
    def getLocale(): String = js.native
    
    def gettext(msgid: String, args: Any*): String = js.native
    
    def loadJSON(jsonData: JsonData): Gettext = js.native
    def loadJSON(jsonData: JsonData, domain: String): Gettext = js.native
    
    def ngettext(msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
    def pgettext(msgctxt: String, msgid: String, args: Any*): String = js.native
    
    def setLocale(locale: String): Gettext = js.native
    
    def setMessages(domain: String, locale: String, messages: JsonDataMessages): Gettext = js.native
    def setMessages(domain: String, locale: String, messages: JsonDataMessages, plural_forms: PluralForm): Gettext = js.native
    
    def strfmt(fmt: String, args: Any*): String = js.native
    
    def textdomain(): Gettext | String = js.native
    def textdomain(domain: String): Gettext | String = js.native
  }
  
  trait GettextOptions extends StObject {
    
    var ctxt_delimiter: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var plural_func: js.UndefOr[PluralForm] = js.undefined
  }
  object GettextOptions {
    
    inline def apply(): GettextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GettextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GettextOptions] (val x: Self) extends AnyVal {
      
      inline def setCtxt_delimiter(value: String): Self = StObject.set(x, "ctxt_delimiter", value.asInstanceOf[js.Any])
      
      inline def setCtxt_delimiterUndefined: Self = StObject.set(x, "ctxt_delimiter", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPlural_func(value: /* n */ Double => Double): Self = StObject.set(x, "plural_func", js.Any.fromFunction1(value))
      
      inline def setPlural_funcUndefined: Self = StObject.set(x, "plural_func", js.undefined)
    }
  }
  
  trait JsonData
    extends StObject
       with JsonDataMessages {
    
    @JSName("")
    var _empty: JsonDataHeader
  }
  object JsonData {
    
    inline def apply(_empty: JsonDataHeader): JsonData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonData] (val x: Self) extends AnyVal {
      
      inline def set_empty(value: JsonDataHeader): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonDataHeader extends StObject {
    
    var language: String
    
    var `plural-forms`: String
  }
  object JsonDataHeader {
    
    inline def apply(language: String, `plural-forms`: String): JsonDataHeader = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonDataHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonDataHeader] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def `setPlural-forms`(value: String): Self = StObject.set(x, "plural-forms", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonDataMessages = StringDictionary[String | js.Array[String] | JsonDataHeader]
  
  type Optionull[T] = js.UndefOr[T | Null]
  
  type PluralForm = js.Function1[/* n */ Double, Double]
}
