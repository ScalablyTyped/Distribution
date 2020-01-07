package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait Schema$ReplaceAllTextRequest extends js.Object {
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[Schema$SubstringMatchCriteria] = js.native
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}

object Schema$ReplaceAllTextRequest {
  @scala.inline
  def apply(containsText: Schema$SubstringMatchCriteria = null, replaceText: String = null): Schema$ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceAllTextRequest]
  }
}

