package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_SourceWords
import typings.googleapis.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Dictlayerdata extends js.Object {
  var common: js.UndefOr[Anon_Title] = js.native
  var dict: js.UndefOr[Anon_SourceWords] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Schema$Dictlayerdata {
  @scala.inline
  def apply(common: Anon_Title = null, dict: Anon_SourceWords = null, kind: String = null): Schema$Dictlayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dictlayerdata]
  }
}

