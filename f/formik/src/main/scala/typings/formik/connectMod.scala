package typings.formik

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with AnonFormik[Values]]): ComponentType[OuterProps] = js.native
}

