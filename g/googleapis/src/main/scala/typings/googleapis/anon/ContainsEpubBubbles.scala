package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[Boolean] = js.native
  var containsImageBubbles: js.UndefOr[Boolean] = js.native
  var epubBubbleVersion: js.UndefOr[String] = js.native
  var imageBubbleVersion: js.UndefOr[String] = js.native
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

