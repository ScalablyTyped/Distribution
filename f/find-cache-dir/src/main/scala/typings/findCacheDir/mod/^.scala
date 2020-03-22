package typings.findCacheDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-cache-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options): js.UndefOr[String] = js.native
  /**
    * Finds the cache directory using the supplied options.
    * The algorithm tries to find a `package.json` file, searching every parent directory of the `cwd` specified
    * (or implied from other options). It returns a `string` containing the absolute path to the cache directory,
    * or `undefined` if `package.json` was never found or if the `node_modules` directory is unwritable.
    */
  def apply(options: OptionsWithThunk): js.UndefOr[js.Function1[/* repeated */ String, String]] = js.native
}

