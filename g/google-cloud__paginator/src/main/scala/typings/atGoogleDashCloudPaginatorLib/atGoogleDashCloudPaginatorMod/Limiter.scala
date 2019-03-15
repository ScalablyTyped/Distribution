package typings
package atGoogleDashCloudPaginatorLib.atGoogleDashCloudPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limiter extends js.Object {
  var stream: nodeLib.streamMod.Transform
  def makeRequest(args: js.Any*): js.UndefOr[nodeLib.streamMod.Transform]
}

object Limiter {
  @scala.inline
  def apply(
    makeRequest: /* repeated */ js.Any => js.UndefOr[nodeLib.streamMod.Transform],
    stream: nodeLib.streamMod.Transform
  ): Limiter = {
    val __obj = js.Dynamic.literal(makeRequest = js.Any.fromFunction1(makeRequest), stream = stream)
  
    __obj.asInstanceOf[Limiter]
  }
}

