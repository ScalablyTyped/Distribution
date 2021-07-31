package typings.formik

import typings.formik.typesMod.FormikContextType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formikContextMod {
  
  @JSImport("formik/dist/FormikContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikConsumer")
  @js.native
  val FormikConsumer: Consumer[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikProvider")
  @js.native
  val FormikProvider: Provider[FormikContextType[js.Any]] = js.native
  
  @scala.inline
  def useFormikContext[Values](): FormikContextType[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormikContext")().asInstanceOf[FormikContextType[Values]]
}
