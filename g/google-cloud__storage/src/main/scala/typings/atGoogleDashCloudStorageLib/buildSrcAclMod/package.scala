package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAclMod {
  type AddAclCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type AddAclResponse = js.Tuple2[AccessControlObject, requestLib.requestMod.requestNs.Response]
  type GetAclCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetAclResponse = js.Tuple2[
    AccessControlObject | js.Array[AccessControlObject], 
    requestLib.requestMod.requestNs.Response
  ]
  type RemoveAclCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type RemoveAclResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type UpdateAclCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type UpdateAclResponse = js.Tuple2[AccessControlObject, requestLib.requestMod.requestNs.Response]
}
