package typings.formik

import typings.formik.anon.Formik
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with Formik[Values]]): ComponentType[OuterProps] = js.native
}
