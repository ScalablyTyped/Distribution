package typings.formatjsIntl

import typings.formatjsIntl.anon.DefaultFormats
import typings.formatjsIntl.anon.FormattersPickFormattersg
import typings.formatjsIntl.typesMod.MessageDescriptor
import typings.intlMessageformat.srcCoreMod.Options
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  val formatMessage: FormatMessageFn[Any] = js.native
  
  type FormatMessageFn[T] = js.Function5[
    /* hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsFallbackOnEmptyStringOnErrorTimeZoneDefaultRichTextElements */ DefaultFormats[T], 
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
