package typings.atFormatjsIntlDashUtils.libResolveDashLocaleMod

import typings.atFormatjsIntlDashUtils.Anon_K
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/resolve-locale", "createResolveLocale")
@js.native
object createResolveLocale extends js.Object {
  def apply[K /* <: String */, D /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Anon_K, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
}

