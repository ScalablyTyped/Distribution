package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocksize extends js.Object {
  /**
  			 * Blocksize for pixelate
  			 * @default 4
  			 */
  var blocksize: js.UndefOr[Double] = js.undefined
}

object Anon_Blocksize {
  @scala.inline
  def apply(blocksize: Int | Double = null): Anon_Blocksize = {
    val __obj = js.Dynamic.literal()
    if (blocksize != null) __obj.updateDynamic("blocksize")(blocksize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Blocksize]
  }
}

