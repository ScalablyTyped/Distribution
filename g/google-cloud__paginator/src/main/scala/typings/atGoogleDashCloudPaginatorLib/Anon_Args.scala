package typings
package atGoogleDashCloudPaginatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var stream: nodeLib.streamMod.Transform
  def makeRequest(args: js.Any*): js.UndefOr[nodeLib.streamMod.Transform]
}

object Anon_Args {
  @scala.inline
  def apply(
    makeRequest: /* repeated */ js.Any => js.UndefOr[nodeLib.streamMod.Transform],
    stream: nodeLib.streamMod.Transform
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(makeRequest = js.Any.fromFunction1(makeRequest), stream = stream)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

