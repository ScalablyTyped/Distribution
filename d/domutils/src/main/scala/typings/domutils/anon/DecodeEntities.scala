package typings.domutils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeEntities extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var xmlMode: js.UndefOr[Boolean] = js.undefined
}

object DecodeEntities {
  @scala.inline
  def apply(decodeEntities: js.UndefOr[Boolean] = js.undefined, xmlMode: js.UndefOr[Boolean] = js.undefined): DecodeEntities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlMode)) __obj.updateDynamic("xmlMode")(xmlMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeEntities]
  }
}

