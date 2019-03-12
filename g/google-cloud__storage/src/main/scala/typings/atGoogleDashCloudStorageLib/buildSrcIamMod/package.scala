package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcIamMod {
  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetPolicyResponse = js.Tuple2[Policy, requestLib.requestMod.requestNs.Response]
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type SetPolicyResponse = js.Tuple2[Policy, requestLib.requestMod.requestNs.Response]
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type TestIamPermissionsResponse = js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    requestLib.requestMod.requestNs.Response
  ]
}
