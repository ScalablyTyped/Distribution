package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITunesConnectAnalytics extends js.Object {
  /** Affiliate token used to create affiliate-coded links. */
  var at: js.UndefOr[String] = js.undefined
  /**
    * Campaign text that developers can optionally add to any link in order to
    * track sales from a specific marketing campaign.
    */
  var ct: js.UndefOr[String] = js.undefined
  /** iTune media types, including music, podcasts, audiobooks and so on. */
  var mt: js.UndefOr[String] = js.undefined
  /**
    * Provider token that enables analytics for Dynamic Links from within iTunes
    * Connect.
    */
  var pt: js.UndefOr[String] = js.undefined
}

object ITunesConnectAnalytics {
  @scala.inline
  def apply(at: String = null, ct: String = null, mt: String = null, pt: String = null): ITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at)
    if (ct != null) __obj.updateDynamic("ct")(ct)
    if (mt != null) __obj.updateDynamic("mt")(mt)
    if (pt != null) __obj.updateDynamic("pt")(pt)
    __obj.asInstanceOf[ITunesConnectAnalytics]
  }
}

