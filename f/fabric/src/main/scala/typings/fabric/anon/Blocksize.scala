package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blocksize extends js.Object {
  /**
    * Blocksize for pixelate
    * @default 4
    */
  var blocksize: js.UndefOr[Double] = js.undefined
}

object Blocksize {
  @scala.inline
  def apply(blocksize: js.UndefOr[Double] = js.undefined): Blocksize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocksize)) __obj.updateDynamic("blocksize")(blocksize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blocksize]
  }
}

