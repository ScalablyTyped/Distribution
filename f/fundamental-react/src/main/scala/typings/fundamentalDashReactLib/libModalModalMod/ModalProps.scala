package typings
package fundamentalDashReactLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Node(s) to render within the footer of the dialog. */
  var actions: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /* Additional props to be spread to the body section of the dialog. */
  var bodyProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the close `<button>` element. */
  var closeProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the content section of the dialog. */
  var contentProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the footer of the dialog. */
  var footerProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the header of the dialog. */
  var headerProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var headingLevel: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6`
  ] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_CloseButton] = js.undefined
  /* Callback function passing event when close button is clicked. */
  var onClose: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /* Set to **true** to make the dialog visible. */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
  var titleProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: reactLib.reactMod.ReactNode = null,
    bodyProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    closeProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contentProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    footerProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    headerProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    headingLevel: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` = null,
    localizedText: fundamentalDashReactLib.Anon_CloseButton = null,
    onClose: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    titleProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps)
    if (closeProps != null) __obj.updateDynamic("closeProps")(closeProps)
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps)
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps)
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps)
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    __obj.asInstanceOf[ModalProps]
  }
}

