package typings.getpass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* password */ java.lang.String, 
    scala.Unit
  ]
}
