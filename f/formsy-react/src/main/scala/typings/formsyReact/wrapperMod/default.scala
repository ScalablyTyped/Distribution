package typings.formsyReact.wrapperMod

import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react/dist/Wrapper", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T, V](WrappedComponent: ComponentType[T with PassDownProps[V]]): ComponentType[Omit[T with WrapperProps[V], String]] = js.native
}

