package typings.atGoogleDashCloudStorage.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.Array[PolicyBinding]
  var etag: js.UndefOr[String] = js.undefined
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[PolicyBinding], etag: String = null): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

