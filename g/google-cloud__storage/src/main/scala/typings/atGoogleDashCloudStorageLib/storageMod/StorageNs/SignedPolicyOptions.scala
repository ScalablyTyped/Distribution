package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options when obtaining the signed policy.
     */

trait SignedPolicyOptions extends js.Object {
  var acl: js.UndefOr[java.lang.String] = js.undefined
  var contentLengthRange: js.UndefOr[ContentLengthRange] = js.undefined
  @JSName("equals")
  var equals_FSignedPolicyOptions: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var expires: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var startsWith: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var successRedirect: js.UndefOr[java.lang.String] = js.undefined
  var successStatus: js.UndefOr[java.lang.String] = js.undefined
}

