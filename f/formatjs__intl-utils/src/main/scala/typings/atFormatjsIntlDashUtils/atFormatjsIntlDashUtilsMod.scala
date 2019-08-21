package typings.atFormatjsIntlDashUtils

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
  def resolveSupportedLocales[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T]): js.Array[String] = js.native
  def resolveSupportedLocales[T /* <: Anon_Locale */](locales: String, localeData: Record[String, T], aliases: Record[String, String]): js.Array[String] = js.native
  def resolveSupportedLocales[T /* <: Anon_Locale */](locales: js.Array[js.UndefOr[String]], localeData: Record[String, T]): js.Array[String] = js.native
  def resolveSupportedLocales[T /* <: Anon_Locale */](
    locales: js.Array[js.UndefOr[String]],
    localeData: Record[String, T],
    aliases: Record[String, String]
  ): js.Array[String] = js.native
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
}

