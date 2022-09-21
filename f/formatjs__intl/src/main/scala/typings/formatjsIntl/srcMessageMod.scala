package typings.formatjsIntl

import typings.formatjsIntl.anon.DefaultLocale
import typings.formatjsIntl.anon.FormattersPickFormattersg
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.intlMessageformat.srcCoreMod.Options
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMessageMod {
  
  @JSImport("@formatjs/intl/src/message", "formatMessage")
  @js.native
  val formatMessage: FormatMessageFn[Any] = js.native
  
  type FormatMessageFn[T] = js.Function5[
    /* hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsFallbackOnEmptyStringOnErrorTimeZoneDefaultRichTextElements */ DefaultLocale[T], 
    /* state */ FormattersPickFormattersg, 
    /* messageDescriptor */ MessageDescriptor, 
    /* values */ js.UndefOr[
      Record[
        String, 
        PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
      ]
    ], 
    /* opts */ js.UndefOr[Options], 
    (js.Array[T | String]) | String | T
  ]
}
