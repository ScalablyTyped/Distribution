package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomHttpPattern extends js.Object {
  /** The name of this custom HTTP verb. */
  var kind: js.UndefOr[String] = js.undefined
  /** The path matched by this custom verb. */
  var path: js.UndefOr[String] = js.undefined
}

object CustomHttpPattern {
  @scala.inline
  def apply(kind: String = null, path: String = null): CustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHttpPattern]
  }
}

