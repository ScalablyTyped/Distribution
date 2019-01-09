package typings
package flatpickrLib.distTypesInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatpickrFn extends js.Object {
  var defaultConfig: flatpickrLib.distTypesOptionsMod.ParsedOptions = js.native
  var l10ns: flatpickrLib.flatpickrLibStrings.FlatpickrFn with js.Any with flatpickrLib.Anon_Default = js.native
  def apply(selector: java.lang.String): Instance | js.Array[Instance] = js.native
  def apply(selector: java.lang.String, config: flatpickrLib.distTypesOptionsMod.Options): Instance | js.Array[Instance] = js.native
  def apply(selector: stdLib.HTMLElement): Instance | js.Array[Instance] = js.native
  def apply(selector: stdLib.HTMLElement, config: flatpickrLib.distTypesOptionsMod.Options): Instance | js.Array[Instance] = js.native
  def apply(selector: stdLib.NodeList): Instance | js.Array[Instance] = js.native
  def apply(selector: stdLib.NodeList, config: flatpickrLib.distTypesOptionsMod.Options): Instance | js.Array[Instance] = js.native
  def compareDates(date1: stdLib.Date, date2: stdLib.Date): scala.Double = js.native
  def compareDates(date1: stdLib.Date, date2: stdLib.Date, timeless: scala.Boolean): scala.Double = js.native
  def formatDate(date: stdLib.Date, format: java.lang.String): java.lang.String = js.native
  def localize(l10n: flatpickrLib.distTypesLocaleMod.CustomLocale): scala.Unit = js.native
  def parseDate(date: flatpickrLib.distTypesOptionsMod.DateOption): js.UndefOr[stdLib.Date] = js.native
  def parseDate(date: flatpickrLib.distTypesOptionsMod.DateOption, format: java.lang.String): js.UndefOr[stdLib.Date] = js.native
  def parseDate(
    date: flatpickrLib.distTypesOptionsMod.DateOption,
    format: java.lang.String,
    timeless: scala.Boolean
  ): js.UndefOr[stdLib.Date] = js.native
  def setDefaults(config: flatpickrLib.distTypesOptionsMod.Options): scala.Unit = js.native
}

