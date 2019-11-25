package typings.findDashCacheDashDir.findDashCacheDashDirMod

import typings.findDashCacheDashDir.findDashCacheDashDirNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithThunk extends Options {
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  @JSName("thunk")
  var thunk_OptionsWithThunk: `true`
}

object OptionsWithThunk {
  @scala.inline
  def apply(
    name: String,
    thunk: `true`,
    create: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    files: String | js.Array[String] = null
  ): OptionsWithThunk = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], thunk = thunk.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithThunk]
  }
}

