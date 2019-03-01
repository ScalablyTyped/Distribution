package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsListResponse extends js.Object {
  /** Contact list. */
  var items: js.UndefOr[js.Array[Contact]] = js.undefined
  /** The type of resource. This is always mirror#contacts. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ContactsListResponse {
  @scala.inline
  def apply(items: js.Array[Contact] = null, kind: java.lang.String = null): ContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ContactsListResponse]
  }
}

