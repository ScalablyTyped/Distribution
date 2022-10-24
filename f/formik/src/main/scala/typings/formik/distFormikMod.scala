package typings.formik

import typings.formik.anon.Dirty
import typings.formik.distTypesMod.FormikConfig
import typings.formik.distTypesMod.FormikErrors
import typings.formik.distTypesMod.FormikValues
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormikMod {
  
  @JSImport("formik/dist/Formik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] & ExtraProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Formik")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDataForValidation")(values.asInstanceOf[js.Any]).asInstanceOf[FormikValues]
  
  inline def useFormik[Values /* <: FormikValues */](param0: FormikConfig[Values]): Dirty[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormik")(param0.asInstanceOf[js.Any]).asInstanceOf[Dirty[Values]]
  
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Boolean): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Boolean, context: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Unit, context: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  
  inline def yupToFormErrors[Values](yupError: Any): FormikErrors[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("yupToFormErrors")(yupError.asInstanceOf[js.Any]).asInstanceOf[FormikErrors[Values]]
}
