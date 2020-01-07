package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access-control list.
  */
@js.native
trait Schema$ObjectAccessControls extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[Schema$ObjectAccessControl]] = js.native
  /**
    * The kind of item this is. For lists of object access control entries,
    * this is always storage#objectAccessControls.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ObjectAccessControls {
  @scala.inline
  def apply(items: js.Array[Schema$ObjectAccessControl] = null, kind: String = null): Schema$ObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectAccessControls]
  }
}

