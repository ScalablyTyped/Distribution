package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[Boolean] = js.undefined
  var containsImageBubbles: js.UndefOr[Boolean] = js.undefined
  var epubBubbleVersion: js.UndefOr[String] = js.undefined
  var imageBubbleVersion: js.UndefOr[String] = js.undefined
}

object ContainsEpubBubbles {
  @scala.inline
  def apply(
    containsEpubBubbles: js.UndefOr[Boolean] = js.undefined,
    containsImageBubbles: js.UndefOr[Boolean] = js.undefined,
    epubBubbleVersion: String = null,
    imageBubbleVersion: String = null
  ): ContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsEpubBubbles)) __obj.updateDynamic("containsEpubBubbles")(containsEpubBubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containsImageBubbles)) __obj.updateDynamic("containsImageBubbles")(containsImageBubbles.get.asInstanceOf[js.Any])
    if (epubBubbleVersion != null) __obj.updateDynamic("epubBubbleVersion")(epubBubbleVersion.asInstanceOf[js.Any])
    if (imageBubbleVersion != null) __obj.updateDynamic("imageBubbleVersion")(imageBubbleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsEpubBubbles]
  }
}

