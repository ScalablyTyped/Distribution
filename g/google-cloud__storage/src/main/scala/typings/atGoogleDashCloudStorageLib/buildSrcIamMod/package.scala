package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcIamMod {
  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetPolicyResponse = js.Tuple2[Policy, atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type SetPolicyResponse = js.Tuple2[Policy, atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* acl */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type TestIamPermissionsResponse = js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
}
