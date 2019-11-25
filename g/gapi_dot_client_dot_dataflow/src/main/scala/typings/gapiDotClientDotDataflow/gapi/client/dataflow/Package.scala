package typings.gapiDotClientDotDataflow.gapi.client.dataflow

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
  var location: js.UndefOr[String] = js.undefined
  /** The name of the package. */
  var name: js.UndefOr[String] = js.undefined
}

object Package {
  @scala.inline
  def apply(location: String = null, name: String = null): Package = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

