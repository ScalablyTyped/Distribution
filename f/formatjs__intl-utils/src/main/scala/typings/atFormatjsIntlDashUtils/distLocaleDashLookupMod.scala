package typings.atFormatjsIntlDashUtils

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/locale-lookup", JSImport.Namespace)
@js.native
object distLocaleDashLookupMod extends js.Object {
  def findSupportedLocale[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T]): js.UndefOr[String] = js.native
  def findSupportedLocale[T /* <: Anon_Locale */](locales: js.Array[js.UndefOr[String]], localeData: Record[String, T]): js.UndefOr[String] = js.native
  def getParentLocaleHierarchy(locale: String): js.Array[String] = js.native
  def supportedLocalesOf[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T]): js.Array[js.UndefOr[String]] = js.native
  def supportedLocalesOf[T /* <: Anon_Locale */](locales: js.Array[js.UndefOr[String]], localeData: Record[String, T]): js.Array[js.UndefOr[String]] = js.native
}

