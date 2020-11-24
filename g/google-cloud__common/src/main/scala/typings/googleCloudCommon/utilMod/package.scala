package typings.googleCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilMod {
  
  type AbortableDuplex = typings.googleCloudCommon.utilMod.Duplexify with typings.googleCloudCommon.utilMod.Abortable
  
  type BodyResponseCallback = js.Function3[
    /* err */ typings.std.Error | typings.googleCloudCommon.utilMod.ApiError | scala.Null, 
    /* body */ js.UndefOr[typings.googleCloudCommon.utilMod.ResponseBody], 
    /* res */ js.UndefOr[typings.teenyRequest.mod.Response[js.Any]], 
    scala.Unit
  ]
  
  type OnAuthenticatedCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* reqOpts */ js.UndefOr[typings.googleCloudCommon.utilMod.DecorateRequestOptions], 
    scala.Unit
  ]
  
  type ResponseBody = js.Any
}
