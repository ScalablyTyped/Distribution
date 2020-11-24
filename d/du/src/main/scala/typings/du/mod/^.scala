package typings.du.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("du", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(dir: String): js.Promise[Double] = js.native
  def apply(dir: String, callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], _]): Unit = js.native
  def apply(dir: String, options: Options): js.Promise[Double] = js.native
  def apply(
    dir: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], _]
  ): Unit = js.native
}
