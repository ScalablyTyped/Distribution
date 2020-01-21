package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentSource extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.undefined
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[String] = js.undefined
}

object ComponentSource {
  @scala.inline
  def apply(name: String = null, originalTransformOrCollection: String = null, userName: String = null): ComponentSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalTransformOrCollection != null) __obj.updateDynamic("originalTransformOrCollection")(originalTransformOrCollection.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSource]
  }
}

