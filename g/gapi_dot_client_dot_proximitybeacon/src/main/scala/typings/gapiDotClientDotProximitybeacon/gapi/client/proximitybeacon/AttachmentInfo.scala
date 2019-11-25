package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentInfo extends js.Object {
  /** An opaque data container for client-provided data. */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is <var>namespace/type</var>, for
    * example <code>scrupulous-wombat-12345/welcome-message</code>
    */
  var namespacedType: js.UndefOr[String] = js.undefined
}

object AttachmentInfo {
  @scala.inline
  def apply(data: String = null, namespacedType: String = null): AttachmentInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (namespacedType != null) __obj.updateDynamic("namespacedType")(namespacedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentInfo]
  }
}

