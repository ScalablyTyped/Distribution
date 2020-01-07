package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification response message.
  */
@js.native
trait Schema$ClassifyTextResponse extends js.Object {
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[Schema$ClassificationCategory]] = js.native
}

object Schema$ClassifyTextResponse {
  @scala.inline
  def apply(categories: js.Array[Schema$ClassificationCategory] = null): Schema$ClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClassifyTextResponse]
  }
}

