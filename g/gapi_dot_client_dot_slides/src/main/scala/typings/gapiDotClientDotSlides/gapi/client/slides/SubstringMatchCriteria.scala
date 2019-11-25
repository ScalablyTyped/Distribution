package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstringMatchCriteria extends js.Object {
  /**
    * Indicates whether the search should respect case:
    *
    * - `True`: the search is case sensitive.
    * - `False`: the search is case insensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /** The text to search for in the shape or table. */
  var text: js.UndefOr[String] = js.undefined
}

object SubstringMatchCriteria {
  @scala.inline
  def apply(matchCase: js.UndefOr[Boolean] = js.undefined, text: String = null): SubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstringMatchCriteria]
  }
}

