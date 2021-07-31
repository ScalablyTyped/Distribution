package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.number
import typings.formatjsIntl.formatjsIntlStrings.relative
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.typesMod.CustomFormats
import typings.formatjsIntl.typesMod.Formatters
import typings.formatjsIntl.typesMod.IntlCache
import typings.formatjsIntl.typesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@formatjs/intl/lib/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @scala.inline
    def onError(err: InvalidConfigError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: MessageFormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: MissingDataError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: MissingTranslationError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: UnsupportedFormatterError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: FormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createFormatters(): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")().asInstanceOf[Formatters]
  @scala.inline
  def createFormatters(cache: IntlCache): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")(cache.asInstanceOf[js.Any]).asInstanceOf[Formatters]
  
  @scala.inline
  def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  @scala.inline
  def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  @scala.inline
  def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  @scala.inline
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
}
