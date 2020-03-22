package typings.formsyReact.mod

import typings.formsyReact.wrapperMod.PassDownProps
import typings.formsyReact.wrapperMod.WrapperProps
import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react", "withFormsy")
@js.native
object withFormsy extends js.Object {
  def apply[T, V](WrappedComponent: ComponentType[T with PassDownProps[V]]): ComponentType[Omit[T with WrapperProps[V], String]] = js.native
}

