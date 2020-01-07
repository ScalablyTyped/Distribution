package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for iTunes Connect App Analytics.
  */
@js.native
trait Schema$ITunesConnectAnalytics extends js.Object {
  /**
    * Affiliate token used to create affiliate-coded links.
    */
  var at: js.UndefOr[String] = js.native
  /**
    * Campaign text that developers can optionally add to any link in order to
    * track sales from a specific marketing campaign.
    */
  var ct: js.UndefOr[String] = js.native
  /**
    * iTune media types, including music, podcasts, audiobooks and so on.
    */
  var mt: js.UndefOr[String] = js.native
  /**
    * Provider token that enables analytics for Dynamic Links from within
    * iTunes Connect.
    */
  var pt: js.UndefOr[String] = js.native
}

object Schema$ITunesConnectAnalytics {
  @scala.inline
  def apply(at: String = null, ct: String = null, mt: String = null, pt: String = null): Schema$ITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (ct != null) __obj.updateDynamic("ct")(ct.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ITunesConnectAnalytics]
  }
}

