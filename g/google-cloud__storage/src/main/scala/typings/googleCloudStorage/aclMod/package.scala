package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  type AddAclCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* acl */ js.UndefOr[typings.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type AddAclResponse = js.Tuple2[
    typings.googleCloudStorage.aclMod.AccessControlObject, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetAclCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* acl */ js.UndefOr[
      typings.googleCloudStorage.aclMod.AccessControlObject | js.Array[typings.googleCloudStorage.aclMod.AccessControlObject] | scala.Null
    ], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetAclResponse = js.Tuple2[
    typings.googleCloudStorage.aclMod.AccessControlObject | js.Array[typings.googleCloudStorage.aclMod.AccessControlObject], 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type RemoveAclCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type RemoveAclResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  type UpdateAclCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* acl */ js.UndefOr[typings.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type UpdateAclResponse = js.Tuple2[
    typings.googleCloudStorage.aclMod.AccessControlObject, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
