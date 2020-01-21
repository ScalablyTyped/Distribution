package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.alertMod.AlertType
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonPropsClassName extends js.Object {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to show a dismiss button. */
  var dismissible: js.UndefOr[Boolean] = js.undefined
  /* Value to be applied to the anchor's `href` attribute. */
  var link: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the link's `<a>` element. */
  var linkProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Localized display text of the link. */
  var linkText: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[AnonClose] = js.undefined
  /* Callback function passing event when close button is clicked. */
  var onCloseClicked: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  var `type`: js.UndefOr[AlertType] = js.undefined
}

object AnonButtonPropsClassName {
  @scala.inline
  def apply(
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    link: String = null,
    linkProps: StringDictionary[js.Any] = null,
    linkText: String = null,
    localizedText: AnonClose = null,
    onCloseClicked: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    `type`: AlertType = null
  ): AnonButtonPropsClassName = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onCloseClicked != null) __obj.updateDynamic("onCloseClicked")(js.Any.fromFunction1(onCloseClicked))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonPropsClassName]
  }
}

