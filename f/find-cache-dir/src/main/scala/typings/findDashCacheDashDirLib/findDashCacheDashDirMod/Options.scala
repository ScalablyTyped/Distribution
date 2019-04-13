package typings
package findDashCacheDashDirLib.findDashCacheDashDirMod

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

object Options {
  @scala.inline
  def apply(
    name: java.lang.String,
    create: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    files: java.lang.String | js.Array[java.lang.String] = null,
    thunk: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(thunk)) __obj.updateDynamic("thunk")(thunk)
    __obj.asInstanceOf[Options]
  }
}

