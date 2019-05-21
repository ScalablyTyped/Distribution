package typings
package formikLib.formikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ErrorMessage: reactLib.reactMod.ComponentType[formikLib.distErrorMessageMod.ErrorMessageProps] = js.native
  val FastField: reactLib.reactMod.ComponentType[js.Any] = js.native
  val Field: reactLib.reactMod.ComponentType[js.Any] = js.native
  val FieldArray: reactLib.reactMod.ComponentType[formikLib.distFieldArrayMod.FieldArrayConfig] = js.native
  val Form: reactLib.reactMod.ComponentType[
    stdLib.Pick[
      reactLib.reactMod.FormHTMLAttributes[stdLib.HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(FormikConsumer) */ val FormikProvider: reactLib.reactMod.ProviderExoticComponent[reactLib.reactMod.ProviderProps[formikLib.distTypesMod.FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: reactLib.reactMod.ComponentType[OuterProps with formikLib.Anon_FormikFormikContext[Values]]): reactLib.reactMod.ComponentType[OuterProps] = js.native
  def getActiveElement(): stdLib.Element | scala.Null = js.native
  def getActiveElement(doc: stdLib.Document): stdLib.Element | scala.Null = js.native
  def getIn(obj: js.Any, key: java.lang.String): js.Any = js.native
  def getIn(obj: js.Any, key: java.lang.String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: java.lang.String, `def`: js.Any, p: scala.Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String], `def`: js.Any, p: scala.Double): js.Any = js.native
  def insert(array: js.Array[_], index: scala.Double, value: js.Any): js.Array[_] = js.native
  def isEmptyChildren(children: js.Any): scala.Boolean = js.native
  def isFunction(obj: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, react.Event> */ scala.Boolean = js.native
  def isInteger(obj: js.Any): scala.Boolean = js.native
  def isNaN(obj: js.Any): scala.Boolean = js.native
  def isObject(obj: js.Any): scala.Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def isString(obj: js.Any): /* is string */ scala.Boolean = js.native
  def makeCancelable[T /* <: js.Promise[_] */](promise: T): js.Tuple2[T, js.Function0[scala.Unit]] = js.native
  def move(array: js.Array[_], from: scala.Double, to: scala.Double): js.Array[_] = js.native
  def replace(array: js.Array[_], index: scala.Double, value: js.Any): js.Array[_] = js.native
  def setIn(obj: js.Any, path: java.lang.String, value: js.Any): js.Any = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
  def swap(array: js.Array[_], indexA: scala.Double, indexB: scala.Double): js.Array[_] = js.native
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any): js.Promise[stdLib.Partial[T]] = js.native
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any, sync: scala.Boolean): js.Promise[stdLib.Partial[T]] = js.native
  def validateYupSchema[T /* <: formikLib.distTypesMod.FormikValues */](values: T, schema: js.Any, sync: scala.Boolean, context: js.Any): js.Promise[stdLib.Partial[T]] = js.native
  def withFormik[OuterProps, Values /* <: formikLib.distTypesMod.FormikValues */, Payload](
    hasMapPropsToValuesConfig: formikLib.distWithFormikMod.WithFormikConfig[OuterProps, Values, Payload]
  ): formikLib.distWithFormikMod.ComponentDecorator[OuterProps, OuterProps with formikLib.distTypesMod.FormikProps[Values]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): formikLib.distTypesMod.FormikErrors[Values] = js.native
}

