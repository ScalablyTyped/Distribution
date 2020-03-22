package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListProps> */
trait WeakValidationMapSideNavL extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var headingLevel: js.UndefOr[Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var titleProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
}

object WeakValidationMapSideNavL {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    headingLevel: Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]] = null,
    title: Validator[js.UndefOr[Null | String]] = null,
    titleProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null
  ): WeakValidationMapSideNavL = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSideNavL]
  }
}

