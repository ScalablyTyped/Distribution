package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Title
import typings.gapiClientBooks.anon.Words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictlayerdata extends js.Object {
  var common: js.UndefOr[Title] = js.undefined
  var dict: js.UndefOr[Words] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Dictlayerdata {
  @scala.inline
  def apply(common: Title = null, dict: Words = null, kind: String = null): Dictlayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictlayerdata]
  }
}

