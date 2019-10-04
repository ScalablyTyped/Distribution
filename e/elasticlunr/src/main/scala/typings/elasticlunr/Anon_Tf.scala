package typings.elasticlunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tf extends js.Object {
  var tf: js.UndefOr[Double] = js.undefined
}

object Anon_Tf {
  @scala.inline
  def apply(tf: Int | Double = null): Anon_Tf = {
    val __obj = js.Dynamic.literal()
    if (tf != null) __obj.updateDynamic("tf")(tf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Tf]
  }
}

