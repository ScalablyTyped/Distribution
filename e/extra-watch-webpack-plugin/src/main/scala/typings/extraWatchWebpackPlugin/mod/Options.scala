package typings.extraWatchWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * `string` or `array`, default `[]`, attach extra dirs to webpack's watch system
    */
  var dirs: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * `string` (absolute path or glob pattern) or `array`, default `[]`, attach extra files to webpack's watch system
    */
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(dirs: String | js.Array[String] = null, files: String | js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (dirs != null) __obj.updateDynamic("dirs")(dirs.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

