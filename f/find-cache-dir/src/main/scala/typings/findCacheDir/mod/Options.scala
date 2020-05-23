package typings.findCacheDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If `true`, the directory will be created synchronously before returning.
    * @default false
    */
  var create: js.UndefOr[Boolean] = js.undefined
  /**
    * Directory to start searching for a `package.json` from.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * An array of files that will be searched for a common parent directory.
    * This common parent directory will be used in lieu of the `cwd` option below.
    */
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Should be the same as your project name in `package.json`.
    */
  var name: String
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  var thunk: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    name: String,
    create: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    files: String | js.Array[String] = null,
    thunk: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(thunk)) __obj.updateDynamic("thunk")(thunk.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

