package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escalade", JSImport.Default)
  @js.native
  def default(directory: String, callback: Callback): js.Promise[String | Unit] = js.native
  
  type Callback = js.Function2[
    /* directory */ String, 
    /* files */ js.Array[String], 
    Promisable[String | `false` | Unit]
  ]
  
  type Promisable[T] = T | js.Promise[T]
}
