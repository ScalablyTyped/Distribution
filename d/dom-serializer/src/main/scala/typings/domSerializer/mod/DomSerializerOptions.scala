package typings.domSerializer.mod

import typings.domSerializer.domSerializerStrings.foreign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomSerializerOptions extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var xmlMode: js.UndefOr[Boolean | foreign] = js.undefined
}

object DomSerializerOptions {
  @scala.inline
  def apply(decodeEntities: js.UndefOr[Boolean] = js.undefined, xmlMode: Boolean | foreign = null): DomSerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.get.asInstanceOf[js.Any])
    if (xmlMode != null) __obj.updateDynamic("xmlMode")(xmlMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomSerializerOptions]
  }
}

