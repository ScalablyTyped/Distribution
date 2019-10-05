package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextRequest extends js.Object {
  /** Finds text in a shape matching this substring. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes master,
    * or if a page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The text that will replace the matched text. */
  var replaceText: js.UndefOr[String] = js.undefined
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    pageObjectIds: js.Array[String] = null,
    replaceText: String = null
  ): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText)
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
}

