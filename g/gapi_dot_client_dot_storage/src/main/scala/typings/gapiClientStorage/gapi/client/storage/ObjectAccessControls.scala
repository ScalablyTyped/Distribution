package typings.gapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControls extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** The kind of item this is. For lists of object access control entries, this is always storage#objectAccessControls. */
  var kind: js.UndefOr[String] = js.undefined
}

object ObjectAccessControls {
  @scala.inline
  def apply(items: js.Array[ObjectAccessControl] = null, kind: String = null): ObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAccessControls]
  }
}

