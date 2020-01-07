package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Contacts representing contacts. This is the response from the
  * server to GET requests on the contacts collection.
  */
@js.native
trait Schema$ContactsListResponse extends js.Object {
  /**
    * Contact list.
    */
  var items: js.UndefOr[js.Array[Schema$Contact]] = js.native
  /**
    * The type of resource. This is always mirror#contacts.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ContactsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Contact] = null, kind: String = null): Schema$ContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContactsListResponse]
  }
}

