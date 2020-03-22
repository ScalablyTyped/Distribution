package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
trait WeakValidationMapMessageS extends js.Object {
  var buttonProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var dismissible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var link: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var linkText: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var localizedText: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var noGlyph: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var onCloseClicked: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var `type`: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
}

object WeakValidationMapMessageS {
  @scala.inline
  def apply(
    buttonProps: Validator[js.UndefOr[_ | Null]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    dismissible: Validator[js.UndefOr[Boolean | Null]] = null,
    link: Validator[js.UndefOr[Null | String]] = null,
    linkProps: Validator[js.UndefOr[_ | Null]] = null,
    linkText: Validator[js.UndefOr[Null | String]] = null,
    localizedText: Validator[js.UndefOr[_ | Null]] = null,
    noGlyph: Validator[js.UndefOr[Boolean | Null]] = null,
    onCloseClicked: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    `type`: Validator[js.UndefOr[_ | Null]] = null
  ): WeakValidationMapMessageS = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (dismissible != null) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (noGlyph != null) __obj.updateDynamic("noGlyph")(noGlyph.asInstanceOf[js.Any])
    if (onCloseClicked != null) __obj.updateDynamic("onCloseClicked")(onCloseClicked.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapMessageS]
  }
}

