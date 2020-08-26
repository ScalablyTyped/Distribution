package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escalade", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(directory: String, callback: Callback): js.Promise[String | Unit] = js.native
  type Callback = js.Function2[
    /* directory */ String, 
    /* files */ js.Array[String], 
    Promisable[String | `false` | Unit]
  ]
  type Promisable[T] = T | js.Promise[T]
}

