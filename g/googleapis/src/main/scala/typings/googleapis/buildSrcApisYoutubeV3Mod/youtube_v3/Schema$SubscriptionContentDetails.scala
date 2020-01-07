package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content to witch a subscription refers.
  */
@js.native
trait Schema$SubscriptionContentDetails extends js.Object {
  /**
    * The type of activity this subscription is for (only uploads, everything).
    */
  var activityType: js.UndefOr[String] = js.native
  /**
    * The number of new items in the subscription since its content was last
    * read.
    */
  var newItemCount: js.UndefOr[Double] = js.native
  /**
    * The approximate number of items that the subscription points to.
    */
  var totalItemCount: js.UndefOr[Double] = js.native
}

object Schema$SubscriptionContentDetails {
  @scala.inline
  def apply(
    activityType: String = null,
    newItemCount: Int | Double = null,
    totalItemCount: Int | Double = null
  ): Schema$SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (newItemCount != null) __obj.updateDynamic("newItemCount")(newItemCount.asInstanceOf[js.Any])
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionContentDetails]
  }
}

