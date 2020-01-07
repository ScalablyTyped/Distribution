package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Settings
  */
@js.native
trait Schema$CreativeSettings extends js.Object {
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameFooter: js.UndefOr[String] = js.native
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameHeader: js.UndefOr[String] = js.native
}

object Schema$CreativeSettings {
  @scala.inline
  def apply(iFrameFooter: String = null, iFrameHeader: String = null): Schema$CreativeSettings = {
    val __obj = js.Dynamic.literal()
    if (iFrameFooter != null) __obj.updateDynamic("iFrameFooter")(iFrameFooter.asInstanceOf[js.Any])
    if (iFrameHeader != null) __obj.updateDynamic("iFrameHeader")(iFrameHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeSettings]
  }
}

