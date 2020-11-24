package typings.googleCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serviceObjectMod {
  
  type CreateCallback[T] = js.Function3[
    /* err */ typings.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  
  type CreateResponse[T] = js.Array[js.Any]
  
  type DeleteCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typings.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type DeleteOptions = typings.googleCloudCommon.anon.IgnoreNotFound with js.Object
  
  type ExistsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type ExistsOptions = js.Object
  
  type GetMetadataOptions = js.Object
  
  type GetOrCreateOptions = typings.googleCloudCommon.serviceObjectMod.GetConfig with typings.googleCloudCommon.serviceObjectMod.CreateOptions
  
  type GetResponse[T] = js.Tuple2[T, typings.teenyRequest.mod.Response[js.Any]]
  
  type InstanceResponseCallback[T] = js.Function3[
    /* err */ typings.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* instance */ js.UndefOr[T | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type Metadata = js.Any
  
  type MetadataCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* metadata */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    /* apiResponse */ js.UndefOr[typings.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type MetadataResponse = js.Tuple2[
    typings.googleCloudCommon.serviceObjectMod.Metadata, 
    typings.teenyRequest.mod.Response[js.Any]
  ]
  
  type Methods = org.scalablytyped.runtime.StringDictionary[typings.googleCloudCommon.anon.ReqOpts | scala.Boolean]
  
  type RequestResponse = js.Tuple2[
    typings.googleCloudCommon.serviceObjectMod.Metadata, 
    typings.teenyRequest.mod.Response[js.Any]
  ]
  
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type SetMetadataOptions = js.Object
  
  type SetMetadataResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
}
