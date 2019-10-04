package typings.atFormatjsIntlDashUtils.distResolveDashLocaleMod

import typings.atFormatjsIntlDashUtils.Anon_Bestfit
import typings.atFormatjsIntlDashUtils.Anon_K
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/resolve-locale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Anon_K, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: Anon_Bestfit): js.Array[String] = js.native
}

