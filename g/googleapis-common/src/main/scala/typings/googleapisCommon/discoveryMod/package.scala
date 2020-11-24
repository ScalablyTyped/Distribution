package typings.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object discoveryMod {
  
  type EndpointCreator = js.Function2[
    /* options */ typings.googleapisCommon.apiMod.GlobalOptions, 
    /* google */ js.Object, 
    typings.googleapisCommon.endpointMod.Endpoint
  ]
}
