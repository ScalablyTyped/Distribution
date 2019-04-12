package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var info: dialogflowLib.Anon_Key
  var title: java.lang.String
}

object Item {
  @scala.inline
  def apply(
    info: dialogflowLib.Anon_Key,
    title: java.lang.String,
    description: java.lang.String = null,
    image: Image = null
  ): Item = {
    val __obj = js.Dynamic.literal(info = info, title = title)
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    __obj.asInstanceOf[Item]
  }
}

