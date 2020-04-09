package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("_")
  var _underscore: js.Array[Double | String]
}

object Anon {
  @scala.inline
  def apply(_underscore: js.Array[Double | String]): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

