package typings.formik

import typings.formik.anon.Dirty
import typings.formik.typesMod.FormikConfig
import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikValues
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formikMod {
  
  @JSImport("formik/dist/Formik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] & ExtraProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Formik")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDataForValidation")(values.asInstanceOf[js.Any]).asInstanceOf[FormikValues]
  
  @scala.inline
  def useFormik[Values /* <: FormikValues */](
    hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest: FormikConfig[Values]
  ): Dirty[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormik")(hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest.asInstanceOf[js.Any]).asInstanceOf[Dirty[Values]]
  
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Unit, context: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  
  @scala.inline
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("yupToFormErrors")(yupError.asInstanceOf[js.Any]).asInstanceOf[FormikErrors[Values]]
}
