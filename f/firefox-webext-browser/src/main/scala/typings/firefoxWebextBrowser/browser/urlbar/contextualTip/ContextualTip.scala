package typings.firefoxWebextBrowser.browser.urlbar.contextualTip

import typings.firefoxWebextBrowser.AnonDefaultIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar.contextualTip types */
/**
  * An object containing the path to an icon, the title, button title, and link title to set on the contextual tip.
  */
trait ContextualTip extends js.Object {
  /** A string to be used as the contextual tip's button's title. */
  var buttonTitle: js.UndefOr[String] = js.undefined
  /** Specifies the default icon and theme icons */
  var icon: js.UndefOr[AnonDefaultIcon] = js.undefined
  /** A string to be used as the contextual tip's link's title. */
  var linkTitle: js.UndefOr[String] = js.undefined
  /** A string to be used as the contextual tip's title. */
  var title: String
}

object ContextualTip {
  @scala.inline
  def apply(title: String, buttonTitle: String = null, icon: AnonDefaultIcon = null, linkTitle: String = null): ContextualTip = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (buttonTitle != null) __obj.updateDynamic("buttonTitle")(buttonTitle.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (linkTitle != null) __obj.updateDynamic("linkTitle")(linkTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualTip]
  }
}

