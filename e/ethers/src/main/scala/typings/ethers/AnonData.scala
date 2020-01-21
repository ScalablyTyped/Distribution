package typings.ethers

import typings.ethers.typesMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var value: js.UndefOr[BigNumberish] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: String, value: BigNumberish = null): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

