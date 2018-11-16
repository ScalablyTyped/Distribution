package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetIamPolicyRequest extends js.Object {
  /**
               * REQUIRED: The complete policy to be applied to the `resource`. The size of
               * the policy is limited to a few 10s of KB. An empty policy is a
               * valid policy but certain Cloud Platform services (such as Projects)
               * might reject them.
               */
  var policy: js.UndefOr[Policy] = js.undefined
}

