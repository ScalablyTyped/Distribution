package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFilter extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#objectFilter". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Applicable when status is ASSIGNED. The user has access to objects with these object IDs. */
  var objectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Status of the filter. NONE means the user has access to none of the objects. ALL means the user has access to all objects. ASSIGNED means the user has
    * access to the objects with IDs in the objectIds list.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectFilter {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    objectIds: js.Array[java.lang.String] = null,
    status: java.lang.String = null
  ): ObjectFilter = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ObjectFilter]
  }
}

