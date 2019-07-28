package typings.findDashCacheDashDir.findDashCacheDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-cache-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options): String | Null = js.native
  /**
    * Finds the cache directory using the supplied options. The algorithm tries to find a `package.json` file,
    * searching every parent directory of the `cwd` specified (or implied from other options).
    * @param options
    * @returns A string containing the absolute path to the cache directory, or null if package.json was never found.
    */
  def apply(options: OptionsWithThunk): (js.Function1[/* repeated */ String, String]) | Null = js.native
}

