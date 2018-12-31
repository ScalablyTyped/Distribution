package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKey extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKey". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are
    * converted to lowercase.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the object of this dynamic targeting key. This is a required field. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the object of this dynamic targeting key. This is a required field. */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
}

