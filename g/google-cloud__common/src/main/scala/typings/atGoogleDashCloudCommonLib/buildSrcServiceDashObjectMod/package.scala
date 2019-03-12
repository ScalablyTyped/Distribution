package typings
package atGoogleDashCloudCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServiceDashObjectMod {
  type CreateCallback[T] = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type CreateResponse[T] = js.Array[js.Any]
  type DeleteCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type DeleteOptions = js.Object
  type ExistsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type ExistsOptions = js.Object
  type GetMetadataOptions = js.Object
  type GetOrCreateOptions = GetConfig with CreateOptions
  type GetResponse[T] = js.Tuple2[T, requestLib.requestMod.requestNs.Response]
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.buildSrcUtilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type Metadata = js.Any
  type MetadataCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* metadata */ js.UndefOr[Metadata], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type MetadataResponse = js.Tuple2[Metadata, requestLib.requestMod.requestNs.Response]
  type RequestResponse = js.Tuple2[Metadata, requestLib.requestMod.requestNs.Response]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type SetMetadataOptions = js.Object
  type SetMetadataResponse = js.Array[Metadata]
}
