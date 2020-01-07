package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Index extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
}

object Anon_Index {
  @scala.inline
  def apply(index: Int | Double = null, message: String = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

