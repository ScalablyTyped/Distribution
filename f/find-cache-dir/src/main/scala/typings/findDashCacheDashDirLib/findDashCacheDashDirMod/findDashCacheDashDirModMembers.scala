package typings
package findDashCacheDashDirLib.findDashCacheDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-cache-dir", JSImport.Namespace)
@js.native
object findDashCacheDashDirModMembers extends js.Object {
  def apply(options: findDashCacheDashDirLib.findDashCacheDashDirMod.findCacheDirNs.Options): java.lang.String | scala.Null = js.native
  /**
    * Finds the cache directory using the supplied options. The algorithm tries to find a `package.json` file,
    * searching every parent directory of the `cwd` specified (or implied from other options).
    * @param options
    * @returns A string containing the absolute path to the cache directory, or null if package.json was never found.
    */
  def apply(options: findDashCacheDashDirLib.findDashCacheDashDirMod.findCacheDirNs.OptionsWithThunk): (js.Function1[/* repeated */ java.lang.String, java.lang.String]) | scala.Null = js.native
}

