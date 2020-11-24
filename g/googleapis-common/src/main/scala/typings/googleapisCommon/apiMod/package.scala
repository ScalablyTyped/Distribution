package typings.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiMod {
  
  type APIEndpoint = typings.googleapisCommon.endpointMod.Endpoint with js.Any
  
  type BodyResponseCallback[T] = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* res */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[T] | scala.Null], 
    scala.Unit
  ]
}
