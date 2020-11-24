package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escalade", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(directory: String, callback: Callback): js.Promise[String | Unit] = js.native
  
  type Callback = js.Function2[
    /* directory */ String, 
    /* files */ js.Array[String], 
    Promisable[String | `false` | Unit]
  ]
  
  type Promisable[T] = T | js.Promise[T]
}
