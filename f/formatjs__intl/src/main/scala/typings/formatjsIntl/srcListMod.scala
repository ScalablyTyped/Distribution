package typings.formatjsIntl

import typings.formatjsIntl.anon.Locale
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntlListformat.mod.default
import typings.std.ConstructorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/src/list", JSImport.Namespace)
@js.native
object srcListMod extends js.Object {
  
  @JSName("formatList")
  def formatList_1(
    hasLocaleOnError: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): String = js.native
}
