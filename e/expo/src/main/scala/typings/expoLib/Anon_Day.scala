package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var intervalMs: js.UndefOr[scala.Double] = js.undefined
  var repeat: js.UndefOr[
    expoLib.expoLibStrings.minute | expoLib.expoLibStrings.hour | expoLib.expoLibStrings.day | expoLib.expoLibStrings.week | expoLib.expoLibStrings.month | expoLib.expoLibStrings.year
  ] = js.undefined
  var time: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
}

object Anon_Day {
  @scala.inline
  def apply(
    intervalMs: scala.Int | scala.Double = null,
    repeat: expoLib.expoLibStrings.minute | expoLib.expoLibStrings.hour | expoLib.expoLibStrings.day | expoLib.expoLibStrings.week | expoLib.expoLibStrings.month | expoLib.expoLibStrings.year = null,
    time: stdLib.Date | scala.Double = null
  ): Anon_Day = {
    val __obj = js.Dynamic.literal()
    if (intervalMs != null) __obj.updateDynamic("intervalMs")(intervalMs.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Day]
  }
}

