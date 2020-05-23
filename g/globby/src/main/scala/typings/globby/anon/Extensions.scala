package typings.globby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
}

object Extensions {
  @scala.inline
  def apply(extensions: js.Array[String] = null, files: js.Array[String] = null): Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}

