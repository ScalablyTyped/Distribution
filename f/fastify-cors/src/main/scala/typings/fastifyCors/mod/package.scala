package typings.fastifyCors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OriginCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* allow */ scala.Boolean, scala.Unit]
  
  type OriginFunction = js.Function2[
    /* origin */ java.lang.String, 
    /* callback */ typings.fastifyCors.mod.OriginCallback, 
    scala.Unit
  ]
  
  type OriginType = java.lang.String | scala.Boolean | typings.std.RegExp
  
  type ValueOrArray[T] = T | typings.fastifyCors.mod.ArrayOfValueOrArray[T]
}
