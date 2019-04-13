package typings
package findDashCacheDashDirLib.findDashCacheDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithThunk extends Options {
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  @JSName("thunk")
  var thunk_OptionsWithThunk: findDashCacheDashDirLib.findDashCacheDashDirLibNumbers.`true`
}

object OptionsWithThunk {
  @scala.inline
  def apply(
    name: java.lang.String,
    thunk: findDashCacheDashDirLib.findDashCacheDashDirLibNumbers.`true`,
    create: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    files: java.lang.String | js.Array[java.lang.String] = null
  ): OptionsWithThunk = {
    val __obj = js.Dynamic.literal(name = name, thunk = thunk)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithThunk]
  }
}

