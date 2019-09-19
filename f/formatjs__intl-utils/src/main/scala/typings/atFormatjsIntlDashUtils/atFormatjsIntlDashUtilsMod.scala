package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.boolean
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.string
import typings.atFormatjsIntlDashUtils.distDiffMod.Thresholds
import typings.std.Date
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object atFormatjsIntlDashUtilsMod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def findSupportedLocale[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T]): js.UndefOr[String] = js.native
  def findSupportedLocale[T /* <: Anon_Locale */](locales: js.Array[js.UndefOr[String]], localeData: Record[String, T]): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](opts: T, prop: K, `type`: boolean): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any],
    fallback: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](opts: T, prop: K, `type`: string): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any],
    fallback: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def getParentLocaleHierarchy(locale: String): js.Array[String] = js.native
  def selectUnit(from: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def supportedLocalesOf[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T]): js.Array[js.UndefOr[String]] = js.native
  def supportedLocalesOf[T /* <: Anon_Locale */](locales: js.Array[js.UndefOr[String]], localeData: Record[String, T]): js.Array[js.UndefOr[String]] = js.native
  def toObject[T](arg: T): T = js.native
}

