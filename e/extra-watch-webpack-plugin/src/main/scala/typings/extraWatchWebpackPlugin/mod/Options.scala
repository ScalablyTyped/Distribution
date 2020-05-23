package typings.extraWatchWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * attach extra dirs to webpack's watch system
    * @default []
    */
  var dirs: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * (absolute path or glob pattern), attach extra files to webpack's watch system
    * @default []
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

