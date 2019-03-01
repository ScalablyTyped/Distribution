package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[scala.Boolean] = js.undefined
  var containsImageBubbles: js.UndefOr[scala.Boolean] = js.undefined
  var epubBubbleVersion: js.UndefOr[java.lang.String] = js.undefined
  var imageBubbleVersion: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContainsEpubBubbles {
  @scala.inline
  def apply(
    containsEpubBubbles: js.UndefOr[scala.Boolean] = js.undefined,
    containsImageBubbles: js.UndefOr[scala.Boolean] = js.undefined,
    epubBubbleVersion: java.lang.String = null,
    imageBubbleVersion: java.lang.String = null
  ): Anon_ContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsEpubBubbles)) __obj.updateDynamic("containsEpubBubbles")(containsEpubBubbles)
    if (!js.isUndefined(containsImageBubbles)) __obj.updateDynamic("containsImageBubbles")(containsImageBubbles)
    if (epubBubbleVersion != null) __obj.updateDynamic("epubBubbleVersion")(epubBubbleVersion)
    if (imageBubbleVersion != null) __obj.updateDynamic("imageBubbleVersion")(imageBubbleVersion)
    __obj.asInstanceOf[Anon_ContainsEpubBubbles]
  }
}

