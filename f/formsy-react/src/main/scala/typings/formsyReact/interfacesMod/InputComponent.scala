package typings.formsyReact.interfacesMod

import typings.formsyReact.wrapperMod.WrapperProps
import typings.formsyReact.wrapperMod.WrapperState
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputComponent[V]
  extends Component[WrapperProps[V], WrapperState[V], js.Any] {
  var requiredValidations: js.UndefOr[Validations[V]] = js.native
  var validations: js.UndefOr[Validations[V]] = js.native
}

