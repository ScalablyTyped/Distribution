package typings
package globalizeLib.distGlobalizeDateMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
  		 * Globalize.loadTimeZone ( ianaTzData, ... )
  		 * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
  		 * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
  		 */
  def loadTimeZone(ianaTzData: js.Object): scala.Unit
}

object Static {
  @scala.inline
  def apply(loadTimeZone: js.Object => scala.Unit): Static = {
    val __obj = js.Dynamic.literal(loadTimeZone = js.Any.fromFunction1(loadTimeZone))
  
    __obj.asInstanceOf[Static]
  }
}

