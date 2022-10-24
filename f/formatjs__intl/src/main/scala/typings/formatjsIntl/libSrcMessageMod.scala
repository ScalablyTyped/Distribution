package typings.formatjsIntl

import typings.formatjsIntl.anon.DefaultFormats
import typings.formatjsIntl.anon.FormattersPickFormattersg
import typings.formatjsIntl.libSrcTypesMod.MessageDescriptor
import typings.intlMessageformat.srcCoreMod.Options
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMessageMod {
  
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  val formatMessage: FormatMessageFn[Any] = js.native
  
  type FormatMessageFn[T] = js.Function5[
    /* param0 */ DefaultFormats[T], 
    /* state */ FormattersPickFormattersg, 
    /* messageDescriptor */ MessageDescriptor, 
    /* values */ js.UndefOr[
      Record[
        String, 
        PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
      ]
    ], 
    /* opts */ js.UndefOr[Options], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : std.Array<T | string> | string | T */ js.Any
  ]
}
