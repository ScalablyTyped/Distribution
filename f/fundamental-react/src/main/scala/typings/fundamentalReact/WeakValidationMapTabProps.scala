package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
trait WeakValidationMapTabProps extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var customStyles: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var glyph: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var linkProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var tabContentProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapTabProps {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    customStyles: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    glyph: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    linkProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    tabContentProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    title: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapTabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTabProps]
  }
}

