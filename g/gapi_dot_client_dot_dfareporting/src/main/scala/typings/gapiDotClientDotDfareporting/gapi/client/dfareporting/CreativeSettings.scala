package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeSettings extends js.Object {
  /** Header text for iFrames for this site. Must be less than or equal to 2000 characters long. */
  var iFrameFooter: js.UndefOr[String] = js.undefined
  /** Header text for iFrames for this site. Must be less than or equal to 2000 characters long. */
  var iFrameHeader: js.UndefOr[String] = js.undefined
}

object CreativeSettings {
  @scala.inline
  def apply(iFrameFooter: String = null, iFrameHeader: String = null): CreativeSettings = {
    val __obj = js.Dynamic.literal()
    if (iFrameFooter != null) __obj.updateDynamic("iFrameFooter")(iFrameFooter)
    if (iFrameHeader != null) __obj.updateDynamic("iFrameHeader")(iFrameHeader)
    __obj.asInstanceOf[CreativeSettings]
  }
}

