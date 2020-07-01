package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuctionType extends js.Object {
  var auctionType: js.UndefOr[js.Array[String]] = js.native
  var contextType: js.UndefOr[String] = js.native
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.native
  var platform: js.UndefOr[js.Array[String]] = js.native
}

object AuctionType {
  @scala.inline
  def apply(
    auctionType: js.Array[String] = null,
    contextType: String = null,
    geoCriteriaId: js.Array[Double] = null,
    platform: js.Array[String] = null
  ): AuctionType = {
    val __obj = js.Dynamic.literal()
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    if (geoCriteriaId != null) __obj.updateDynamic("geoCriteriaId")(geoCriteriaId.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuctionType]
  }
}

