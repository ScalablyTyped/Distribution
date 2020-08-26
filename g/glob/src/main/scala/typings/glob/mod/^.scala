package typings.glob.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GlobSync: IGlobSyncStatic = js.native
  @JSName("Glob")
  var Glob_ : IGlobStatic = js.native
  var glob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof G */ js.Any = js.native
  def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
  def apply(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
  ): IGlob = js.native
}

