package typings.elasticlunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTf extends js.Object {
  var tf: js.UndefOr[Double] = js.undefined
}

object AnonTf {
  @scala.inline
  def apply(tf: Int | Double = null): AnonTf = {
    val __obj = js.Dynamic.literal()
    if (tf != null) __obj.updateDynamic("tf")(tf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTf]
  }
}

