package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait Schema$ReplaceAllTextRequest extends js.Object {
  /**
    * Finds text in a shape matching this substring.
    */
  var containsText: js.UndefOr[Schema$SubstringMatchCriteria] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes master, or if a page with that object ID doesn&#39;t exist in the
    * presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}

object Schema$ReplaceAllTextRequest {
  @scala.inline
  def apply(
    containsText: Schema$SubstringMatchCriteria = null,
    pageObjectIds: js.Array[String] = null,
    replaceText: String = null
  ): Schema$ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds.asInstanceOf[js.Any])
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceAllTextRequest]
  }
}

