package typings.formik

import typings.formik.anon.Dirty
import typings.formik.anon.Formik
import typings.formik.anon.PickDetailedHTMLPropsForm
import typings.formik.errorMessageMod.ErrorMessageProps
import typings.formik.fieldArrayMod.FieldArrayConfig
import typings.formik.fieldMod.FieldAttributes
import typings.formik.fieldMod.FieldHookConfig
import typings.formik.typesMod.FieldHelperProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikConfig
import typings.formik.typesMod.FormikContextType
import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikProps
import typings.formik.typesMod.FormikValues
import typings.formik.withFormikMod.ComponentDecorator
import typings.formik.withFormikMod.WithFormikConfig
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Provider
import typings.react.mod.global.JSX.Element
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formik", "ErrorMessage")
  @js.native
  val ErrorMessage: ComponentType[ErrorMessageProps] = js.native
  
  @JSImport("formik", "FastField")
  @js.native
  val FastField: ComponentType[js.Any] = js.native
  
  @JSImport("formik", "Field")
  @js.native
  def Field(hasValidateNameRenderChildrenAsComponentProps: FieldAttributes[_]): js.Any = js.native
  
  @JSImport("formik", "FieldArray")
  @js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  
  @JSImport("formik", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[PickDetailedHTMLPropsForm] = js.native
  
  @JSImport("formik", "Formik")
  @js.native
  def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] with ExtraProps): Element = js.native
  
  @JSImport("formik", "FormikConsumer")
  @js.native
  val FormikConsumer: Consumer[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik", "FormikProvider")
  @js.native
  val FormikProvider: Provider[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik", "connect")
  @js.native
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with Formik[Values]]): ComponentType[OuterProps] = js.native
  
  @JSImport("formik", "getActiveElement")
  @js.native
  def getActiveElement(): typings.std.Element | Null = js.native
  @JSImport("formik", "getActiveElement")
  @js.native
  def getActiveElement(doc: Document): typings.std.Element | Null = js.native
  
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: String): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: String, `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = js.native
  @JSImport("formik", "getIn")
  @js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = js.native
  
  @JSImport("formik", "insert")
  @js.native
  def insert(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  @JSImport("formik", "isEmptyArray")
  @js.native
  def isEmptyArray(): Boolean = js.native
  @JSImport("formik", "isEmptyArray")
  @js.native
  def isEmptyArray(value: js.Any): Boolean = js.native
  
  @JSImport("formik", "isEmptyChildren")
  @js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
  
  @JSImport("formik", "isFunction")
  @js.native
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("formik", "isInputEvent")
  @js.native
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = js.native
  
  @JSImport("formik", "isInteger")
  @js.native
  def isInteger(obj: js.Any): Boolean = js.native
  
  @JSImport("formik", "isNaN")
  @js.native
  def isNaN(obj: js.Any): Boolean = js.native
  
  @JSImport("formik", "isObject")
  @js.native
  def isObject(obj: js.Any): /* is std.Object */ Boolean = js.native
  
  @JSImport("formik", "isPromise")
  @js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  
  @JSImport("formik", "isString")
  @js.native
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("formik", "move")
  @js.native
  def move(array: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
  
  @JSImport("formik", "prepareDataForValidation")
  @js.native
  def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = js.native
  
  @JSImport("formik", "replace")
  @js.native
  def replace(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  @JSImport("formik", "setIn")
  @js.native
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  
  @JSImport("formik", "setNestedObjectValues")
  @js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  @JSImport("formik", "setNestedObjectValues")
  @js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.UndefOr[scala.Nothing], response: js.Any): T = js.native
  @JSImport("formik", "setNestedObjectValues")
  @js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  @JSImport("formik", "setNestedObjectValues")
  @js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
  
  @JSImport("formik", "swap")
  @js.native
  def swap(arrayLike: ArrayLike[_], indexA: Double, indexB: Double): js.Array[_] = js.native
  
  @JSImport("formik", "useField")
  @js.native
  def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  @JSImport("formik", "useField")
  @js.native
  def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  
  @JSImport("formik", "useFormik")
  @js.native
  def useFormik[Values /* <: FormikValues */](
    hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest: FormikConfig[Values]
  ): Dirty[Values] = js.native
  
  @JSImport("formik", "useFormikContext")
  @js.native
  def useFormikContext[Values](): FormikContextType[Values] = js.native
  
  @JSImport("formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  @JSImport("formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: js.UndefOr[scala.Nothing], context: js.Any): js.Promise[Partial[T]] = js.native
  @JSImport("formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  @JSImport("formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  
  @JSImport("formik", "withFormik")
  @js.native
  def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
  
  @JSImport("formik", "yupToFormErrors")
  @js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
}
