package typings.atGoogleDashCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServiceDashObjectMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atGoogleDashCloudCommon.Anon_ReqOpts
  import typings.atGoogleDashCloudCommon.buildSrcUtilMod.ApiError
  import typings.std.Error
  import typings.teenyDashRequest.teenyDashRequestMod.Response

  type CreateCallback[T] = js.Function3[
    /* err */ ApiError | Null, 
    /* instance */ js.UndefOr[T | Null], 
    /* repeated */ js.Any, 
    Unit
  ]
  type CreateResponse[T] = js.Array[js.Any]
  type DeleteCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Response[js.Any]], Unit]
  type DeleteOptions = js.Object
  type ExistsCallback = js.Function2[/* err */ Error | Null, /* exists */ js.UndefOr[Boolean], Unit]
  type ExistsOptions = js.Object
  type GetMetadataOptions = js.Object
  type GetOrCreateOptions = GetConfig with CreateOptions
  type GetResponse[T] = js.Tuple2[T, Response[js.Any]]
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ ApiError | Null, 
    /* instance */ js.UndefOr[T | Null], 
    /* apiResponse */ js.UndefOr[Response[js.Any]], 
    Unit
  ]
  type Metadata = js.Any
  type MetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[Metadata], 
    /* apiResponse */ js.UndefOr[Response[js.Any]], 
    Unit
  ]
  type MetadataResponse = js.Tuple2[Metadata, Response[js.Any]]
  type Methods = StringDictionary[Anon_ReqOpts | Boolean]
  type RequestResponse = js.Tuple2[Metadata, Response[js.Any]]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[Error | Null], 
    /* apiResponse */ js.UndefOr[Response[js.Any]], 
    Unit
  ]
  type SetMetadataOptions = js.Object
  type SetMetadataResponse = js.Array[Metadata]
}
