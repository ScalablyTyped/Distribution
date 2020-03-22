package typings.formik

import typings.formik.typesMod.FormikContextType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/FormikContext", JSImport.Namespace)
@js.native
object formikContextMod extends js.Object {
  val FormikConsumer: Consumer[FormikContextType[js.Any]] = js.native
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  val FormikProvider: Provider[FormikContextType[js.Any]] = js.native
  def useFormikContext[Values](): FormikContextType[Values] = js.native
}

