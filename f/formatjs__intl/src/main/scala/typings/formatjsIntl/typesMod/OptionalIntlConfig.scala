package typings.formatjsIntl.typesMod

import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<T>, keyof std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
@js.native
trait OptionalIntlConfig[T] extends js.Object {
  
  var defaultFormats: js.UndefOr[CustomFormats] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.native
  
  var formats: js.UndefOr[CustomFormats] = js.native
  
  var locale: String = js.native
  
  var messages: js.UndefOr[Record[String, js.Array[MessageFormatElement] | String]] = js.native
  
  var onError: js.UndefOr[OnErrorFn] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object OptionalIntlConfig {
  
  @scala.inline
  def apply[T](locale: String): OptionalIntlConfig[T] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalIntlConfig[T]]
  }
  
  @scala.inline
  implicit class OptionalIntlConfigOps[Self <: OptionalIntlConfig[_], T] (val x: Self with OptionalIntlConfig[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormats(value: CustomFormats): Self = this.set("defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFormats: Self = this.set("defaultFormats", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = this.set("defaultRichTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRichTextElements: Self = this.set("defaultRichTextElements", js.undefined)
    
    @scala.inline
    def setFormats(value: CustomFormats): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
