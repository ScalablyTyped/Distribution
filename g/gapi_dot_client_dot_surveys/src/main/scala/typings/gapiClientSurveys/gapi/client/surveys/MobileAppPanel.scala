package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppPanel extends js.Object {
  /**
    * Country code for the country of the users that the panel contains. Uses standard ISO 3166-1 2-character language codes. For instance, 'US' for the
    * United States, and 'GB' for the United Kingdom. Any survey created targeting this panel must also target the corresponding country.
    */
  var country: js.UndefOr[String] = js.undefined
  /** Whether or not the panel is accessible to all API users. */
  var isPublicPanel: js.UndefOr[Boolean] = js.undefined
  /**
    * Language code that the panel can target. For instance, 'en-US'. Uses standard BCP47 language codes. See specification. Any survey created targeting
    * this panel must also target the corresponding language.
    */
  var language: js.UndefOr[String] = js.undefined
  /** Unique panel ID string. This corresponds to the mobile_app_panel_id used in Survey Insert requests. */
  var mobileAppPanelId: js.UndefOr[String] = js.undefined
  /** Human readable name of the audience panel. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * List of email addresses for users who can target members of this panel. Must contain at least the address of the user making the API call for panels
    * that are not public. This field will be empty for public panels.
    */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
}

object MobileAppPanel {
  @scala.inline
  def apply(
    country: String = null,
    isPublicPanel: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    mobileAppPanelId: String = null,
    name: String = null,
    owners: js.Array[String] = null
  ): MobileAppPanel = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublicPanel)) __obj.updateDynamic("isPublicPanel")(isPublicPanel.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (mobileAppPanelId != null) __obj.updateDynamic("mobileAppPanelId")(mobileAppPanelId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileAppPanel]
  }
}

