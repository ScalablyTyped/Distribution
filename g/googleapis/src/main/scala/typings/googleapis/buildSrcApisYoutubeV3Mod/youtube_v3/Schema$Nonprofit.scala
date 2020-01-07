package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nonprofit information.
  */
@js.native
trait Schema$Nonprofit extends js.Object {
  /**
    * Id of the nonprofit.
    */
  var nonprofitId: js.UndefOr[Schema$NonprofitId] = js.native
  /**
    * Legal name of the nonprofit.
    */
  var nonprofitLegalName: js.UndefOr[String] = js.native
}

object Schema$Nonprofit {
  @scala.inline
  def apply(nonprofitId: Schema$NonprofitId = null, nonprofitLegalName: String = null): Schema$Nonprofit = {
    val __obj = js.Dynamic.literal()
    if (nonprofitId != null) __obj.updateDynamic("nonprofitId")(nonprofitId.asInstanceOf[js.Any])
    if (nonprofitLegalName != null) __obj.updateDynamic("nonprofitLegalName")(nonprofitLegalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Nonprofit]
  }
}

