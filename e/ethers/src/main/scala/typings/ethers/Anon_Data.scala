package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String
  var value: js.UndefOr[BigNumberish] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: String, value: BigNumberish = null): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

