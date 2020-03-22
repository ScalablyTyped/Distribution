package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonTitle
import typings.googleapis.AnonWords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDictlayerdata extends js.Object {
  var common: js.UndefOr[AnonTitle] = js.native
  var dict: js.UndefOr[AnonWords] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaDictlayerdata {
  @scala.inline
  def apply(common: AnonTitle = null, dict: AnonWords = null, kind: String = null): SchemaDictlayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDictlayerdata]
  }
}

