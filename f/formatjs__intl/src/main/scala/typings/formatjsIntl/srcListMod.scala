package typings.formatjsIntl

import typings.formatjsIntl.anon.Locale
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntlListformat.mod.Part
import typings.formatjsIntlListformat.mod.default
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcListMod {
  
  @JSImport("@formatjs/intl/src/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatListToParts_1[T](
    opts: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): js.Array[Part[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatListToParts")(opts.asInstanceOf[js.Any], getListFormat.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Part[String]]]
  
  inline def formatList_1(
    opts: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(opts.asInstanceOf[js.Any], getListFormat.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
