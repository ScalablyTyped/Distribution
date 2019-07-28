package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeridiemAM extends js.Object {
  /* Ante meridiem for 12 hour clock. */
  var meridiemAM: String
  /* Post meridiem for 12 hour clock. */
  var meridiemPM: String
}

object Anon_MeridiemAM {
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): Anon_MeridiemAM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM, meridiemPM = meridiemPM)
  
    __obj.asInstanceOf[Anon_MeridiemAM]
  }
}

