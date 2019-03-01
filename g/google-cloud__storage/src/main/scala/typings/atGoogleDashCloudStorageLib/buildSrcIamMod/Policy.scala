package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.Array[PolicyBinding]
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[PolicyBinding], etag: java.lang.String = null): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindings")(bindings)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    __obj.asInstanceOf[Policy]
  }
}

