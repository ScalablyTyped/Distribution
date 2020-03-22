package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.Array[PolicyBinding]
  var etag: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[PolicyBinding], etag: String = null, version: Int | Double = null): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

