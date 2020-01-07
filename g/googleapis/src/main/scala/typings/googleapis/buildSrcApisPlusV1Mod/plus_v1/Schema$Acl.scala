package typings.googleapis.buildSrcApisPlusV1Mod.plus_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Acl extends js.Object {
  /**
    * Description of the access granted, suitable for display.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The list of access entries.
    */
  var items: js.UndefOr[js.Array[Schema$PlusAclentryResource]] = js.native
  /**
    * Identifies this resource as a collection of access controls. Value:
    * &quot;plus#acl&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Acl {
  @scala.inline
  def apply(
    description: String = null,
    items: js.Array[Schema$PlusAclentryResource] = null,
    kind: String = null
  ): Schema$Acl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Acl]
  }
}

