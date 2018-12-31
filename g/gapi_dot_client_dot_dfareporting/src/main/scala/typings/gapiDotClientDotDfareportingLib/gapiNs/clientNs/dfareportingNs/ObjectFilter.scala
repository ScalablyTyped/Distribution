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

