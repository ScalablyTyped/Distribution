package typings.glob.globMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Glob: IGlobStatic = js.native
  var GlobSync: IGlobSyncStatic = js.native
  def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): Unit = js.native
  def apply(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
  ): Unit = js.native
  def __promisify__(pattern: String): js.Promise[js.Array[String]] = js.native
  def __promisify__(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
  def hasMagic(pattern: String): Boolean = js.native
  def hasMagic(pattern: String, options: IOptions): Boolean = js.native
  def sync(pattern: String): js.Array[String] = js.native
  def sync(pattern: String, options: IOptions): js.Array[String] = js.native
}

