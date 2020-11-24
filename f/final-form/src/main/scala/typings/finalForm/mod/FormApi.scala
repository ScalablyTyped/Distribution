package typings.finalForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.finalForm.finalFormStrings.debug
import typings.finalForm.finalFormStrings.destroyOnUnregister
import typings.finalForm.finalFormStrings.initialValues
import typings.finalForm.finalFormStrings.keepDirtyOnReinitialize
import typings.finalForm.finalFormStrings.mutators
import typings.finalForm.finalFormStrings.validate
import typings.finalForm.finalFormStrings.validateOnBlur
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormApi[FormValues, InitialFormValues] extends js.Object {
  
  def batch(fn: js.Function0[Unit]): Unit = js.native
  
  def blur(name: /* keyof FormValues */ String): Unit = js.native
  
  def change[F /* <: /* keyof FormValues */ String */](name: F): Unit = js.native
  def change[F /* <: /* keyof FormValues */ String */](
    name: F,
    value: /* import warning: importer.ImportType#apply Failed type conversion: FormValues[F] */ js.Any
  ): Unit = js.native
  
  var destroyOnUnregister: Boolean = js.native
  
  def focus(name: /* keyof FormValues */ String): Unit = js.native
  
  def getFieldState[F /* <: /* keyof FormValues */ String */](field: F): js.UndefOr[
    FieldState[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[F] */ js.Any
    ]
  ] = js.native
  
  def getRegisteredFields(): js.Array[String] = js.native
  
  def getState(): FormState[FormValues, InitialFormValues] = js.native
  
  def initialize(data: FormValues): Unit = js.native
  def initialize(data: js.Function1[/* values */ FormValues, FormValues]): Unit = js.native
  
  def isValidationPaused(): Boolean = js.native
  
  var mutators: Record[String, js.Function1[/* repeated */ _, _]] = js.native
  
  def pauseValidation(): Unit = js.native
  
  def registerField[F /* <: /* keyof FormValues */ String */](
    name: F,
    subscriber: FieldSubscriber[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[F] */ js.Any
    ],
    subscription: FieldSubscription
  ): Unsubscribe = js.native
  def registerField[F /* <: /* keyof FormValues */ String */](
    name: F,
    subscriber: FieldSubscriber[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[F] */ js.Any
    ],
    subscription: FieldSubscription,
    config: FieldConfig[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[F] */ js.Any
    ]
  ): Unsubscribe = js.native
  @JSName("registerField")
  var registerField_Original: RegisterField[FormValues] = js.native
  
  def reset(): Unit = js.native
  def reset(initialValues: FormValues): Unit = js.native
  
  def resetFieldState(name: /* keyof FormValues */ String): Unit = js.native
  
  def resumeValidation(): Unit = js.native
  
  @JSName("setConfig")
  def setConfig_debug(name: debug): Unit = js.native
  @JSName("setConfig")
  def setConfig_debug(name: debug, value: DebugFunction[FormValues, Partial[FormValues]]): Unit = js.native
  @JSName("setConfig")
  def setConfig_destroyOnUnregister(name: destroyOnUnregister): Unit = js.native
  @JSName("setConfig")
  def setConfig_destroyOnUnregister(name: destroyOnUnregister, value: Boolean): Unit = js.native
  @JSName("setConfig")
  def setConfig_initialValues(name: initialValues): Unit = js.native
  @JSName("setConfig")
  def setConfig_initialValues(name: initialValues, value: Partial[FormValues]): Unit = js.native
  @JSName("setConfig")
  def setConfig_keepDirtyOnReinitialize(name: keepDirtyOnReinitialize): Unit = js.native
  @JSName("setConfig")
  def setConfig_keepDirtyOnReinitialize(name: keepDirtyOnReinitialize, value: Boolean): Unit = js.native
  @JSName("setConfig")
  def setConfig_mutators(name: mutators): Unit = js.native
  @JSName("setConfig")
  def setConfig_mutators(name: mutators, value: StringDictionary[Mutator[FormValues, Partial[FormValues]]]): Unit = js.native
  @JSName("setConfig")
  def setConfig_validate(name: validate): Unit = js.native
  @JSName("setConfig")
  def setConfig_validate(
    name: validate,
    value: js.Function1[
      /* values */ FormValues, 
      js.UndefOr[ValidationErrors | js.Promise[ValidationErrors]]
    ]
  ): Unit = js.native
  @JSName("setConfig")
  def setConfig_validateOnBlur(name: validateOnBlur): Unit = js.native
  @JSName("setConfig")
  def setConfig_validateOnBlur(name: validateOnBlur, value: Boolean): Unit = js.native
  
  def submit(): js.UndefOr[js.Promise[js.UndefOr[FormValues]]] = js.native
  
  def subscribe(subscriber: FormSubscriber[FormValues, Partial[FormValues]], subscription: FormSubscription): Unsubscribe = js.native
}
