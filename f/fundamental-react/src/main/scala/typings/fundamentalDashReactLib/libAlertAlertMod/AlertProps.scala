package typings
package fundamentalDashReactLib.libAlertAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** to show a dismiss button. */
  var dismissible: js.UndefOr[scala.Boolean] = js.undefined
  /* Value to be applied to the anchor's `href` attribute. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /* Additional props to be spread to the link's `<a>` element. */
  var linkProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Localized display text of the link. */
  var linkText: js.UndefOr[java.lang.String] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_Close] = js.undefined
  /* Callback function passing event when close button is clicked. */
  var onCloseClicked: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    buttonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    dismissible: js.UndefOr[scala.Boolean] = js.undefined,
    link: java.lang.String = null,
    linkProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    linkText: java.lang.String = null,
    localizedText: fundamentalDashReactLib.Anon_Close = null,
    onCloseClicked: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    `type`: AlertType = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (link != null) __obj.updateDynamic("link")(link)
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps)
    if (linkText != null) __obj.updateDynamic("linkText")(linkText)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (onCloseClicked != null) __obj.updateDynamic("onCloseClicked")(js.Any.fromFunction1(onCloseClicked))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AlertProps]
  }
}

