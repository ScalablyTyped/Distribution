package typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * Required. The destination of the connection from the containing photo to
    * another photo.
    */
  var target: js.UndefOr[PhotoId] = js.undefined
}

object Connection {
  @scala.inline
  def apply(target: PhotoId = null): Connection = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Connection]
  }
}

