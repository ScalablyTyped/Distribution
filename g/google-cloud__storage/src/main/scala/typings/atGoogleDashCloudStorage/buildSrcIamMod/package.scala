package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcIamMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.std.Error

  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetPolicyResponse = js.Tuple2[Policy, Metadata]
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    Unit
  ]
  type SetPolicyResponse = js.Tuple2[Policy, Metadata]
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[StringDictionary[Boolean] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type TestIamPermissionsResponse = js.Tuple2[StringDictionary[Boolean], Metadata]
}
