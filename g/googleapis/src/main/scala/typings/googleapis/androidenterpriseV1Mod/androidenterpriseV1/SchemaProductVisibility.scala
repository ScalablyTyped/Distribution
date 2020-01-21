package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product to be made visible to a user.
  */
@js.native
trait SchemaProductVisibility extends js.Object {
  /**
    * The product ID to make visible to the user. Required for each item in the
    * productVisibility list.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Grants the user visibility to the specified product track(s), identified
    * by trackIds.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProductVisibility {
  @scala.inline
  def apply(productId: String = null, trackIds: js.Array[String] = null, tracks: js.Array[String] = null): SchemaProductVisibility = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (trackIds != null) __obj.updateDynamic("trackIds")(trackIds.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductVisibility]
  }
}

