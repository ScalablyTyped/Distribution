package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeridiemPM extends js.Object {
  var meridiemAM: String
  var meridiemPM: String
}

object MeridiemPM {
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): MeridiemPM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeridiemPM]
  }
}

