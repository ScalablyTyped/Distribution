package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /**
    * The resource to read the package from. The supported resource type is:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}
    * bucket.storage.googleapis.com/
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the package. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Package {
  @scala.inline
  def apply(location: java.lang.String = null, name: java.lang.String = null): Package = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Package]
  }
}

