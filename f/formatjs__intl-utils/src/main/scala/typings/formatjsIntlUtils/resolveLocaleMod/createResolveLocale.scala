package typings.formatjsIntlUtils.resolveLocaleMod

import org.scalablytyped.runtime.TopLevel
import typings.formatjsIntlUtils.AnonDictk
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/resolve-locale", "createResolveLocale")
@js.native
object createResolveLocale extends js.Object {
  def apply[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.formatjsIntlUtils.formatjsIntlUtilsStrings.createResolveLocale with TopLevel[js.Any] */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ AnonDictk, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
}

