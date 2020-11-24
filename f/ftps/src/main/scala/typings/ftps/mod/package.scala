package typings.ftps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FTPCallbackFunction = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* results */ typings.ftps.mod.FTPResults, 
    js.Any
  ]
}
