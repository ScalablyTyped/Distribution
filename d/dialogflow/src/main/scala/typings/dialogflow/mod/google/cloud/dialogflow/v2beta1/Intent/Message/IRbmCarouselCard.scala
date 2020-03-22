package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmCarouselCard. */
trait IRbmCarouselCard extends js.Object {
  /** RbmCarouselCard cardContents */
  var cardContents: js.UndefOr[js.Array[IRbmCardContent] | Null] = js.undefined
  /** RbmCarouselCard cardWidth */
  var cardWidth: js.UndefOr[CardWidth | String | Null] = js.undefined
}

object IRbmCarouselCard {
  @scala.inline
  def apply(cardContents: js.Array[IRbmCardContent] = null, cardWidth: CardWidth | String = null): IRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    if (cardContents != null) __obj.updateDynamic("cardContents")(cardContents.asInstanceOf[js.Any])
    if (cardWidth != null) __obj.updateDynamic("cardWidth")(cardWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmCarouselCard]
  }
}

