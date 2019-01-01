package typings
package findDashCacheDashDirLib.findDashCacheDashDirMod.findCacheDirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If `true`, the directory will be created synchronously before returning.
    * @default false
    */
  var create: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Directory to start searching for a `package.json` from.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of files that will be searched for a common parent directory.
    * This common parent directory will be used in lieu of the `cwd` option below.
    */
  var files: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Should be the same as your project name in `package.json`.
    */
  var name: java.lang.String
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  var thunk: js.UndefOr[scala.Boolean] = js.undefined
}

