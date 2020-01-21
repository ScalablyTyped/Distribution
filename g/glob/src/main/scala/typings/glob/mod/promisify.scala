package typings.glob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", "__promisify__")
@js.native
object promisify extends js.Object {
  def apply(pattern: String): js.Promise[js.Array[String]] = js.native
  def apply(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
}

