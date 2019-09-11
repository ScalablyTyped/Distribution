package typings.expressDashBoom.expressDashBoomMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoomError[Data] extends js.Object {
  var data: Data
  var isBoom: Boolean
  var isServer: Boolean
  var message: String
  var output: Output
  def reformat(): Unit
}

object BoomError {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    output: Output,
    reformat: () => Unit
  ): BoomError[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom, isServer = isServer, message = message, output = output, reformat = js.Any.fromFunction0(reformat))
  
    __obj.asInstanceOf[BoomError[Data]]
  }
}

