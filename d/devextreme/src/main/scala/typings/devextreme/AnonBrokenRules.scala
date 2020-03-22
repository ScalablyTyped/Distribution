package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.AsyncRule
import typings.devextreme.mod.DevExpress.ui.CompareRule
import typings.devextreme.mod.DevExpress.ui.CustomRule
import typings.devextreme.mod.DevExpress.ui.EmailRule
import typings.devextreme.mod.DevExpress.ui.NumericRule
import typings.devextreme.mod.DevExpress.ui.PatternRule
import typings.devextreme.mod.DevExpress.ui.RangeRule
import typings.devextreme.mod.DevExpress.ui.RequiredRule
import typings.devextreme.mod.DevExpress.ui.StringLengthRule
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrokenRules[T] extends js.Object {
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var errorText: js.UndefOr[String] = js.undefined
  var isValid: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var newData: js.UndefOr[js.Any] = js.undefined
  var oldData: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[Promise[Unit] | JQueryPromise[Unit]] = js.undefined
}

object AnonBrokenRules {
  @scala.inline
  def apply[T](
    brokenRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    component: T = null,
    element: dxElement = null,
    errorText: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    model: js.Any = null,
    newData: js.Any = null,
    oldData: js.Any = null,
    promise: Promise[Unit] | JQueryPromise[Unit] = null
  ): AnonBrokenRules[T] = {
    val __obj = js.Dynamic.literal()
    if (brokenRules != null) __obj.updateDynamic("brokenRules")(brokenRules.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (oldData != null) __obj.updateDynamic("oldData")(oldData.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrokenRules[T]]
  }
}

