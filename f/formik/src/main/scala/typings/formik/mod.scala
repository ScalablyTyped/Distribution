package typings.formik

import typings.formik.anon.Dirty
import typings.formik.anon.Formik
import typings.formik.anon.PickDetailedHTMLPropsForm
import typings.formik.distErrorMessageMod.ErrorMessageProps
import typings.formik.distFieldArrayMod.FieldArrayConfig
import typings.formik.distFieldMod.FieldAttributes
import typings.formik.distFieldMod.FieldHookConfig
import typings.formik.distTypesMod.FieldHelperProps
import typings.formik.distTypesMod.FieldInputProps
import typings.formik.distTypesMod.FieldMetaProps
import typings.formik.distTypesMod.FormikConfig
import typings.formik.distTypesMod.FormikContextType
import typings.formik.distTypesMod.FormikErrors
import typings.formik.distTypesMod.FormikProps
import typings.formik.distTypesMod.FormikValues
import typings.formik.distWithFormikMod.ComponentDecorator
import typings.formik.distWithFormikMod.WithFormikConfig
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
  val FastField: ComponentType[Any] = js.native
  
  inline def Field(param0: FieldAttributes[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("formik", "FieldArray")
  @js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  
  @JSImport("formik", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[PickDetailedHTMLPropsForm] = js.native
  
  inline def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] & ExtraProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Formik")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("formik", "FormikConsumer")
  @js.native
  val FormikConsumer: Consumer[FormikContextType[Any]] = js.native
  
  @JSImport("formik", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[Any]] = js.native
  
  @JSImport("formik", "FormikProvider")
  @js.native
  val FormikProvider: Provider[FormikContextType[Any]] = js.native
  
  inline def connect[OuterProps, Values](Comp: ComponentType[OuterProps & Formik[Values]]): ComponentType[OuterProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Comp.asInstanceOf[js.Any]).asInstanceOf[ComponentType[OuterProps]]
  
  inline def getActiveElement(): typings.std.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[typings.std.Element | Null]
  inline def getActiveElement(doc: Document): typings.std.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element | Null]
  
  inline def getIn(obj: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Any, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Unit, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Any, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Unit, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def insert(arrayLike: ArrayLike[Any], index: Double, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def isEmptyArray(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")().asInstanceOf[Boolean]
  inline def isEmptyArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyChildren(children: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInputEvent(value: Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.SyntheticEvent<any, std.Event> */ Boolean]
  
  inline def isInteger(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNaN(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(obj: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isPromise(value: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def isString(obj: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def move(array: js.Array[Any], from: Double, to: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDataForValidation")(values.asInstanceOf[js.Any]).asInstanceOf[FormikValues]
  
  inline def replace(arrayLike: ArrayLike[Any], index: Double, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def setIn(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setNestedObjectValues[T](`object`: Any, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Any, response: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Unit, response: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def swap(arrayLike: ArrayLike[Any], indexA: Double, indexB: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(arrayLike.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  inline def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useField")(propsOrFieldName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]]]
  
  inline def useFormik[Values /* <: FormikValues */](param0: FormikConfig[Values]): Dirty[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormik")(param0.asInstanceOf[js.Any]).asInstanceOf[Dirty[Values]]
  
  inline def useFormikContext[Values](): FormikContextType[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormikContext")().asInstanceOf[FormikContextType[Values]]
  
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Boolean): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Boolean, context: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  inline def validateYupSchema[T /* <: FormikValues */](values: T, schema: Any, sync: Unit, context: Any): js.Promise[Partial[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateYupSchema")(values.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Partial[T]]]
  
  inline def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](param0: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFormik")(param0.asInstanceOf[js.Any]).asInstanceOf[ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]]]
  
  inline def yupToFormErrors[Values](yupError: Any): FormikErrors[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("yupToFormErrors")(yupError.asInstanceOf[js.Any]).asInstanceOf[FormikErrors[Values]]
}
