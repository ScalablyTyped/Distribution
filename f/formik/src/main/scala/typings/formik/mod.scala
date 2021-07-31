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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formik", "ErrorMessage")
  @js.native
  val ErrorMessage: ComponentType[ErrorMessageProps] = js.native
  
  @JSImport("formik", "FastField")
  @js.native
  val FastField: ComponentType[js.Any] = js.native
  
  @scala.inline
  def Field(hasValidateNameRenderChildrenIsComponentProps: FieldAttributes[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(hasValidateNameRenderChildrenIsComponentProps.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("formik", "FieldArray")
  @js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  
  @JSImport("formik", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[PickDetailedHTMLPropsForm] = js.native
  
  @scala.inline
  def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] & ExtraProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Formik")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("formik", "FormikConsumer")
  @js.native
  val FormikConsumer: Consumer[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik", "FormikProvider")
  @js.native
  val FormikProvider: Provider[FormikContextType[js.Any]] = js.native
  
  @scala.inline
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps & Formik[Values]]): ComponentType[OuterProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Comp.asInstanceOf[js.Any]).asInstanceOf[ComponentType[OuterProps]]
  
  @scala.inline
  def getActiveElement(): typings.std.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[typings.std.Element | Null]
  @scala.inline
  def getActiveElement(doc: Document): typings.std.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element | Null]
  
  @scala.inline
  def getIn(obj: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def insert(arrayLike: ArrayLike[js.Any], index: Double, value: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def isEmptyArray(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")().asInstanceOf[Boolean]
  @scala.inline
  def isEmptyArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmptyChildren(children: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.SyntheticEvent<any, std.Event> */ Boolean]
  
  @scala.inline
  def isInteger(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNaN(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(obj: js.Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  @scala.inline
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  @scala.inline
  def isString(obj: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def move(array: js.Array[js.Any], from: Double, to: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDataForValidation")(values.asInstanceOf[js.Any]).asInstanceOf[FormikValues]
  
  @scala.inline
  def replace(arrayLike: ArrayLike[js.Any], index: Double, value: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: Unit, response: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def swap(arrayLike: ArrayLike[js.Any], indexA: Double, indexB: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(arrayLike.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  @scala.inline
  def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  
  @scala.inline
  def useFormik[Values /* <: FormikValues */](
    hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest: FormikConfig[Values]
  ): Dirty[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormik")(hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest.asInstanceOf[js.Any]).asInstanceOf[Dirty[Values]]
  
  @scala.inline
  def useFormikContext[Values](): FormikContextType[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormikContext")().asInstanceOf[FormikContextType[Values]]
  
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  @scala.inline
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Unit, context: js.Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  
  @scala.inline
  def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFormik")(hasMapPropsToValuesConfig.asInstanceOf[js.Any]).asInstanceOf[ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]]]
  
  @scala.inline
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("yupToFormErrors")(yupError.asInstanceOf[js.Any]).asInstanceOf[FormikErrors[Values]]
}
