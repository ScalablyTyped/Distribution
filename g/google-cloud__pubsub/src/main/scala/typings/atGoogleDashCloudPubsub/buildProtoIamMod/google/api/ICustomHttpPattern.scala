package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CustomHttpPattern. */
trait ICustomHttpPattern extends js.Object {
  /** CustomHttpPattern kind */
  var kind: js.UndefOr[String | Null] = js.undefined
  /** CustomHttpPattern path */
  var path: js.UndefOr[String | Null] = js.undefined
}

object ICustomHttpPattern {
  @scala.inline
  def apply(kind: String = null, path: String = null): ICustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomHttpPattern]
  }
}

