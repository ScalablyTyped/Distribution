package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAclMod {
  type AddAclCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type AddAclResponse = js.Tuple2[AccessControlObject, requestLib.requestMod.Response]
  type GetAclCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type GetAclResponse = js.Tuple2[
    AccessControlObject | js.Array[AccessControlObject], 
    requestLib.requestMod.Response
  ]
  type RemoveAclCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type RemoveAclResponse = js.Array[requestLib.requestMod.Response]
  type UpdateAclCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* acl */ js.UndefOr[AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type UpdateAclResponse = js.Tuple2[AccessControlObject, requestLib.requestMod.Response]
}
