package typings.domutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecodeEntities extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var xmlMode: js.UndefOr[Boolean] = js.undefined
}

object Anon_DecodeEntities {
  @scala.inline
  def apply(decodeEntities: js.UndefOr[Boolean] = js.undefined, xmlMode: js.UndefOr[Boolean] = js.undefined): Anon_DecodeEntities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlMode)) __obj.updateDynamic("xmlMode")(xmlMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DecodeEntities]
  }
}

