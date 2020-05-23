package typings.elasticlunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tf extends js.Object {
  var tf: js.UndefOr[Double] = js.undefined
}

object Tf {
  @scala.inline
  def apply(tf: js.UndefOr[Double] = js.undefined): Tf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tf)) __obj.updateDynamic("tf")(tf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tf]
  }
}

