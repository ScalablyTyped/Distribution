package typings.atGoogleDashCloudStorage

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAclMod {
  type AddAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type AddAclResponse = js.Tuple2[AccessControlObject, Metadata]
  type GetAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetAclResponse = js.Tuple2[AccessControlObject | js.Array[AccessControlObject], Metadata]
  type RemoveAclCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  type RemoveAclResponse = js.Array[Metadata]
  type UpdateAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type UpdateAclResponse = js.Tuple2[AccessControlObject, Metadata]
}
