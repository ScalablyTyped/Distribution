package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleIamV1__SetIamPolicyRequest extends js.Object {
  /**
               * REQUIRED: The complete policy to be applied to the `resource`. The size of
               * the policy is limited to a few 10s of KB. An empty policy is a
               * valid policy but certain Cloud Platform services (such as Projects)
               * might reject them.
               */
  var policy: js.UndefOr[GoogleIamV1__Policy] = js.undefined
  /**
               * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only
               * the fields in the mask will be modified. If no mask is provided, the
               * following default mask is used:
               * paths: "bindings, etag"
               * This field is only used by Cloud IAM.
               */
  var updateMask: js.UndefOr[java.lang.String] = js.undefined
}

