package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enterprise extends js.Object {
  /** Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated flow. */
  var administrator: js.UndefOr[js.Array[Administrator]] = js.undefined
  /** The unique ID for the enterprise. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterprise". */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of the enterprise, for example, "Example, Inc". */
  var name: js.UndefOr[String] = js.undefined
  /** The enterprise's primary domain, such as "example.com". */
  var primaryDomain: js.UndefOr[String] = js.undefined
}

object Enterprise {
  @scala.inline
  def apply(
    administrator: js.Array[Administrator] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    primaryDomain: String = null
  ): Enterprise = {
    val __obj = js.Dynamic.literal()
    if (administrator != null) __obj.updateDynamic("administrator")(administrator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (primaryDomain != null) __obj.updateDynamic("primaryDomain")(primaryDomain)
    __obj.asInstanceOf[Enterprise]
  }
}

