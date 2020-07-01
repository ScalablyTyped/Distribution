package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Title
import typings.googleapis.anon.Words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDictlayerdata extends js.Object {
  var common: js.UndefOr[Title] = js.native
  var dict: js.UndefOr[Words] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaDictlayerdata {
  @scala.inline
  def apply(common: Title = null, dict: Words = null, kind: String = null): SchemaDictlayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDictlayerdata]
  }
}

