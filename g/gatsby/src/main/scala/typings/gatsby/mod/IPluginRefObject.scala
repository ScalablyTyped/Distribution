package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPluginRefObject extends js.Object {
  var options: js.UndefOr[IPluginRefOptions] = js.undefined
  var parentDir: js.UndefOr[String] = js.undefined
  var resolve: String
}

object IPluginRefObject {
  @scala.inline
  def apply(resolve: String, options: IPluginRefOptions = null, parentDir: String = null): IPluginRefObject = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parentDir != null) __obj.updateDynamic("parentDir")(parentDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginRefObject]
  }
}

