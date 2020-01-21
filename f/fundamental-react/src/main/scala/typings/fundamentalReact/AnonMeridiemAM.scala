package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeridiemAM extends js.Object {
  /* Ante meridiem for 12 hour clock. */
  var meridiemAM: String
  /* Post meridiem for 12 hour clock. */
  var meridiemPM: String
}

object AnonMeridiemAM {
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): AnonMeridiemAM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMeridiemAM]
  }
}

