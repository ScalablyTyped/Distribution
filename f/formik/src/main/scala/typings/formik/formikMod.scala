package typings.formik

import typings.formik.distErrorMessageMod.ErrorMessageProps
import typings.formik.distFieldArrayMod.FieldArrayConfig
import typings.formik.distTypesMod.FormikConfig
import typings.formik.distTypesMod.FormikContext
import typings.formik.distTypesMod.FormikErrors
import typings.formik.distTypesMod.FormikProps
import typings.formik.distTypesMod.FormikValues
import typings.formik.distWithFormikMod.ComponentDecorator
import typings.formik.distWithFormikMod.WithFormikConfig
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.std.Document
import typings.std.Element
import typings.std.HTMLFormElement
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", JSImport.Namespace)
@js.native
object formikMod extends js.Object {
  @js.native
  class ErrorMessage protected ()
    extends Component[ErrorMessageProps, ComponentState, js.Any] {
    def this(props: ErrorMessageProps) = this()
    def this(props: ErrorMessageProps, context: js.Any) = this()
  }
  
  @js.native
  class FastField protected ()
    extends Component[js.Any, ComponentState, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class Field protected ()
    extends Component[js.Any, ComponentState, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class FieldArray protected ()
    extends Component[FieldArrayConfig, ComponentState, js.Any] {
    def this(props: FieldArrayConfig) = this()
    def this(props: FieldArrayConfig, context: js.Any) = this()
  }
  
  @js.native
  class Form protected ()
    extends Component[
          Pick[
            FormHTMLAttributes[HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ], 
          ComponentState, 
          js.Any
        ] {
    def this(props: Pick[
            FormHTMLAttributes[HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ]) = this()
    def this(
      props: Pick[
            FormHTMLAttributes[HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ],
      context: js.Any
    ) = this()
  }
  
  @js.native
  class Formik[Values] protected ()
    extends typings.formik.distFormikMod.Formik[Values] {
    def this(props: FormikConfig[Values]) = this()
  }
  
  val ErrorMessage: ComponentType[ErrorMessageProps] = js.native
  val FastField: ComponentType[js.Any] = js.native
  val Field: ComponentType[js.Any] = js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  val Form: ComponentType[
    Pick[
      FormHTMLAttributes[HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(FormikConsumer) */ val FormikProvider: ProviderExoticComponent[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ComponentType[OuterProps with Anon_FormikFormikContext[Values]]): ComponentType[OuterProps] = js.native
  def getActiveElement(): Element | Null = js.native
  def getActiveElement(doc: Document): Element | Null = js.native
  def getIn(obj: js.Any, key: String): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = js.native
  def insert(array: js.Array[_], index: Double, value: js.Any): js.Array[_] = js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, react.Event> */ Boolean = js.native
  def isInteger(obj: js.Any): Boolean = js.native
  def isNaN(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  def makeCancelable[T /* <: js.Promise[_] */](promise: T): js.Tuple2[T, js.Function0[Unit]] = js.native
  def move(array: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
  def replace(array: js.Array[_], index: Double, value: js.Any): js.Array[_] = js.native
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
  def swap(array: js.Array[_], indexA: Double, indexB: Double): js.Array[_] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  def withFormik[OuterProps, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
  /* static members */
  @js.native
  object Formik extends js.Object {
    var defaultProps: Anon_EnableReinitialize = js.native
  }
  
}

