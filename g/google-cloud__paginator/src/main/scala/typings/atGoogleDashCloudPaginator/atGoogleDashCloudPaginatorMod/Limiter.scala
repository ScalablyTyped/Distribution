package typings.atGoogleDashCloudPaginator.atGoogleDashCloudPaginatorMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limiter extends js.Object {
  var stream: Transform
  def makeRequest(args: js.Any*): js.UndefOr[Transform]
}

object Limiter {
  @scala.inline
  def apply(makeRequest: /* repeated */ js.Any => js.UndefOr[Transform], stream: Transform): Limiter = {
    val __obj = js.Dynamic.literal(makeRequest = js.Any.fromFunction1(makeRequest), stream = stream)
  
    __obj.asInstanceOf[Limiter]
  }
}

