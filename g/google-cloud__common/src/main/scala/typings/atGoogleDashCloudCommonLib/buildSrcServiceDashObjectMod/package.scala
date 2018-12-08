package typings
package atGoogleDashCloudCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServiceDashObjectMod {
  type DeleteCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type ExistsCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* metadata */ js.UndefOr[Metadata | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetResponse = js.Tuple2[ServiceObject[js.Object], requestLib.requestMod.requestNs.Response]
  type InstanceResponseCallback = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[ServiceObject[js.Object] | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type Metadata = js.Any
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type SetMetadataResponse = js.Array[requestLib.requestMod.requestNs.Response]
}
