package typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Globalize.loadTimeZone ( ianaTzData, ... )
    * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
    * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
    */
  def loadTimeZone(ianaTzData: js.Object): Unit = js.native
}

object Static {
  @scala.inline
  def apply(loadTimeZone: js.Object => Unit): Static = {
    val __obj = js.Dynamic.literal(loadTimeZone = js.Any.fromFunction1(loadTimeZone))
    __obj.asInstanceOf[Static]
  }
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadTimeZone(value: js.Object => Unit): Self = this.set("loadTimeZone", js.Any.fromFunction1(value))
  }
  
}

