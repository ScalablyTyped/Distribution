package typings.finalForm

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.finalForm.anon.Notified
import typings.finalForm.finalFormBooleans.`false`
import typings.finalForm.finalFormStrings.`FINAL_FORMSlasharray-error`
import typings.finalForm.finalFormStrings.`FINAL_FORMSlashform-error`
import typings.finalForm.finalFormStrings.debug
import typings.finalForm.finalFormStrings.destroyOnUnregister
import typings.finalForm.finalFormStrings.initialValues
import typings.finalForm.finalFormStrings.keepDirtyOnReinitialize
import typings.finalForm.finalFormStrings.mutators
import typings.finalForm.finalFormStrings.validate
import typings.finalForm.finalFormStrings.validateOnBlur
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("final-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("final-form", "ARRAY_ERROR")
  @js.native
  val ARRAY_ERROR: `FINAL_FORMSlasharray-error` = js.native
  
  @JSImport("final-form", "FORM_ERROR")
  @js.native
  val FORM_ERROR: `FINAL_FORMSlashform-error` = js.native
  
  @JSImport("final-form", "configOptions")
  @js.native
  val configOptions: js.Array[ConfigKey] = js.native
  
  inline def createForm[FormValues, InitialFormValues](config: Config[FormValues, Partial[FormValues]]): FormApi[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormApi[FormValues, InitialFormValues]]
  
  @JSImport("final-form", "fieldSubscriptionItems")
  @js.native
  val fieldSubscriptionItems: js.Array[String] = js.native
  
  @JSImport("final-form", "formSubscriptionItems")
  @js.native
  val formSubscriptionItems: js.Array[String] = js.native
  
  inline def getIn(state: js.Object, complexKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(state.asInstanceOf[js.Any], complexKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setIn(state: js.Object, key: String, value: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("final-form", "version")
  @js.native
  val version: String = js.native
  
  type AnyObject = StringDictionary[Any]
  
  type ChangeValue[FormValues, InitialFormValues] = js.Function3[
    /* state */ MutableState[FormValues, InitialFormValues], 
    /* name */ String, 
    /* mutate */ js.Function1[/* value */ Any, Any], 
    Unit
  ]
  
  @js.native
  trait Config[FormValues, InitialFormValues] extends StObject {
    
    var debug: js.UndefOr[DebugFunction[FormValues, InitialFormValues]] = js.native
    
    var destroyOnUnregister: js.UndefOr[Boolean] = js.native
    
    var initialValues: js.UndefOr[InitialFormValues] = js.native
    
    var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
    
    var mutators: js.UndefOr[StringDictionary[Mutator[FormValues, InitialFormValues]]] = js.native
    
    def onSubmit(values: FormValues, form: FormApi[FormValues, InitialFormValues]): SubmissionErrors | js.Promise[SubmissionErrors] | Unit = js.native
    def onSubmit(
      values: FormValues,
      form: FormApi[FormValues, InitialFormValues],
      callback: js.Function1[/* errors */ js.UndefOr[SubmissionErrors], Unit]
    ): SubmissionErrors | js.Promise[SubmissionErrors] | Unit = js.native
    
    var validate: js.UndefOr[
        js.Function1[/* values */ FormValues, ValidationErrors | js.Promise[ValidationErrors]]
      ] = js.native
    
    var validateOnBlur: js.UndefOr[Boolean] = js.native
  }
  
  /* keyof final-form.final-form.Config<object, std.Partial<object>> */ /* Rewritten from type alias, can be one of: 
    - typings.finalForm.finalFormStrings.debug
    - typings.finalForm.finalFormStrings.destroyOnUnregister
    - typings.finalForm.finalFormStrings.initialValues
    - typings.finalForm.finalFormStrings.keepDirtyOnReinitialize
    - typings.finalForm.finalFormStrings.mutators
    - typings.finalForm.finalFormStrings.onSubmit
    - typings.finalForm.finalFormStrings.validate
    - typings.finalForm.finalFormStrings.validateOnBlur
  */
  trait ConfigKey extends StObject
  
  type DebugFunction[FormValues, InitialFormValues] = js.Function2[
    /* state */ FormState[FormValues, InitialFormValues], 
    /* fieldStates */ StringDictionary[FieldState[Any]], 
    Unit
  ]
  
  type Decorator[FormValues, InitialFormValues] = js.Function1[/* form */ FormApi[FormValues, InitialFormValues], Unsubscribe]
  
  trait FieldConfig[FieldValue] extends StObject {
    
    var afterSubmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeSubmit: js.UndefOr[js.Function0[Unit | `false`]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var getValidator: js.UndefOr[GetFieldValidator[FieldValue]] = js.undefined
    
    var initialValue: js.UndefOr[Any] = js.undefined
    
    var isEqual: js.UndefOr[IsEqual] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var validateFields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FieldConfig {
    
    inline def apply[FieldValue](): FieldConfig[FieldValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldConfig[FieldValue]]
    }
    
    extension [Self <: FieldConfig[?], FieldValue](x: Self & FieldConfig[FieldValue]) {
      
      inline def setAfterSubmit(value: () => Unit): Self = StObject.set(x, "afterSubmit", js.Any.fromFunction0(value))
      
      inline def setAfterSubmitUndefined: Self = StObject.set(x, "afterSubmit", js.undefined)
      
      inline def setBeforeSubmit(value: () => Unit | `false`): Self = StObject.set(x, "beforeSubmit", js.Any.fromFunction0(value))
      
      inline def setBeforeSubmitUndefined: Self = StObject.set(x, "beforeSubmit", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setGetValidator(value: () => js.UndefOr[FieldValidator[FieldValue]]): Self = StObject.set(x, "getValidator", js.Any.fromFunction0(value))
      
      inline def setGetValidatorUndefined: Self = StObject.set(x, "getValidator", js.undefined)
      
      inline def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setIsEqual(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
      
      inline def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setValidateFields(value: js.Array[String]): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
      
      inline def setValidateFieldsUndefined: Self = StObject.set(x, "validateFields", js.undefined)
      
      inline def setValidateFieldsVarargs(value: String*): Self = StObject.set(x, "validateFields", js.Array(value*))
    }
  }
  
  @js.native
  trait FieldState[FieldValue] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    def blur(): Unit = js.native
    
    def change(): Unit = js.native
    def change(value: FieldValue): Unit = js.native
    
    var data: js.UndefOr[AnyObject] = js.native
    
    var dirty: js.UndefOr[Boolean] = js.native
    
    var dirtySinceLastSubmit: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Any] = js.native
    
    def focus(): Unit = js.native
    
    var initial: js.UndefOr[FieldValue] = js.native
    
    var invalid: js.UndefOr[Boolean] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var modified: js.UndefOr[Boolean] = js.native
    
    var modifiedSinceLastSubmit: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var pristine: js.UndefOr[Boolean] = js.native
    
    var submitError: js.UndefOr[Any] = js.native
    
    var submitFailed: js.UndefOr[Boolean] = js.native
    
    var submitSucceeded: js.UndefOr[Boolean] = js.native
    
    var submitting: js.UndefOr[Boolean] = js.native
    
    var touched: js.UndefOr[Boolean] = js.native
    
    var valid: js.UndefOr[Boolean] = js.native
    
    var validating: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[FieldValue] = js.native
    
    var visited: js.UndefOr[Boolean] = js.native
  }
  
  type FieldSubscriber[FieldValue] = Subscriber[FieldState[FieldValue]]
  
  trait FieldSubscription extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    var dirtySinceLastSubmit: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var initial: js.UndefOr[Boolean] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Boolean] = js.undefined
    
    var modified: js.UndefOr[Boolean] = js.undefined
    
    var modifiedSinceLastSubmit: js.UndefOr[`false`] = js.undefined
    
    var pristine: js.UndefOr[Boolean] = js.undefined
    
    var submitError: js.UndefOr[Boolean] = js.undefined
    
    var submitFailed: js.UndefOr[Boolean] = js.undefined
    
    var submitSucceeded: js.UndefOr[Boolean] = js.undefined
    
    var submitting: js.UndefOr[Boolean] = js.undefined
    
    var touched: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
    
    var validating: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Boolean] = js.undefined
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object FieldSubscription {
    
    inline def apply(): FieldSubscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSubscription]
    }
    
    extension [Self <: FieldSubscription](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setDirtySinceLastSubmitUndefined: Self = StObject.set(x, "dirtySinceLastSubmit", js.undefined)
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmit(value: `false`): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmitUndefined: Self = StObject.set(x, "modifiedSinceLastSubmit", js.undefined)
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setPristineUndefined: Self = StObject.set(x, "pristine", js.undefined)
      
      inline def setSubmitError(value: Boolean): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceededUndefined: Self = StObject.set(x, "submitSucceeded", js.undefined)
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      inline def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type FieldValidator[FieldValue] = js.Function3[
    /* value */ FieldValue, 
    /* allValues */ js.UndefOr[js.Object], 
    /* meta */ js.UndefOr[FieldState[FieldValue]], 
    Any | js.Promise[Any]
  ]
  
  @js.native
  trait FormApi[FormValues, InitialFormValues] extends StObject {
    
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
    
    def initialize(data: InitialFormValues): Unit = js.native
    def initialize(data: js.Function1[/* values */ FormValues, InitialFormValues]): Unit = js.native
    
    def isValidationPaused(): Boolean = js.native
    
    var mutators: Record[String, js.Function1[/* repeated */ Any, Any]] = js.native
    
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
    def reset(initialValues: InitialFormValues): Unit = js.native
    
    def resetFieldState(name: /* keyof FormValues */ String): Unit = js.native
    
    def restart(): Unit = js.native
    def restart(initialValues: InitialFormValues): Unit = js.native
    
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
      value: js.Function1[/* values */ FormValues, ValidationErrors | js.Promise[ValidationErrors]]
    ): Unit = js.native
    @JSName("setConfig")
    def setConfig_validateOnBlur(name: validateOnBlur): Unit = js.native
    @JSName("setConfig")
    def setConfig_validateOnBlur(name: validateOnBlur, value: Boolean): Unit = js.native
    
    def submit(): js.UndefOr[js.Promise[js.UndefOr[FormValues]]] = js.native
    
    def subscribe(subscriber: FormSubscriber[FormValues, Partial[FormValues]], subscription: FormSubscription): Unsubscribe = js.native
  }
  
  trait FormState[FormValues, InitialFormValues] extends StObject {
    
    // by default: all values are subscribed. if subscription is specified, some values may be undefined
    var active: js.UndefOr[/* keyof FormValues */ String] = js.undefined
    
    var dirty: Boolean
    
    var dirtyFields: StringDictionary[Boolean]
    
    var dirtyFieldsSinceLastSubmit: StringDictionary[Boolean]
    
    var dirtySinceLastSubmit: Boolean
    
    var error: Any
    
    var errors: ValidationErrors
    
    var hasSubmitErrors: Boolean
    
    var hasValidationErrors: Boolean
    
    var initialValues: InitialFormValues
    
    var invalid: Boolean
    
    var modified: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var modifiedSinceLastSubmit: Boolean
    
    var pristine: Boolean
    
    var submitError: Any
    
    var submitErrors: SubmissionErrors
    
    var submitFailed: Boolean
    
    var submitSucceeded: Boolean
    
    var submitting: Boolean
    
    var touched: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var valid: Boolean
    
    var validating: Boolean
    
    var values: FormValues
    
    var visited: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  }
  object FormState {
    
    inline def apply[FormValues, InitialFormValues](
      dirty: Boolean,
      dirtyFields: StringDictionary[Boolean],
      dirtyFieldsSinceLastSubmit: StringDictionary[Boolean],
      dirtySinceLastSubmit: Boolean,
      error: Any,
      hasSubmitErrors: Boolean,
      hasValidationErrors: Boolean,
      initialValues: InitialFormValues,
      invalid: Boolean,
      modifiedSinceLastSubmit: Boolean,
      pristine: Boolean,
      submitError: Any,
      submitFailed: Boolean,
      submitSucceeded: Boolean,
      submitting: Boolean,
      valid: Boolean,
      validating: Boolean,
      values: FormValues
    ): FormState[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], dirtyFields = dirtyFields.asInstanceOf[js.Any], dirtyFieldsSinceLastSubmit = dirtyFieldsSinceLastSubmit.asInstanceOf[js.Any], dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hasSubmitErrors = hasSubmitErrors.asInstanceOf[js.Any], hasValidationErrors = hasValidationErrors.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitError = submitError.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState[FormValues, InitialFormValues]]
    }
    
    extension [Self <: FormState[?, ?], FormValues, InitialFormValues](x: Self & (FormState[FormValues, InitialFormValues])) {
      
      inline def setActive(value: /* keyof FormValues */ String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyFields(value: StringDictionary[Boolean]): Self = StObject.set(x, "dirtyFields", value.asInstanceOf[js.Any])
      
      inline def setDirtyFieldsSinceLastSubmit(value: StringDictionary[Boolean]): Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: ValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setHasSubmitErrors(value: Boolean): Self = StObject.set(x, "hasSubmitErrors", value.asInstanceOf[js.Any])
      
      inline def setHasValidationErrors(value: Boolean): Self = StObject.set(x, "hasValidationErrors", value.asInstanceOf[js.Any])
      
      inline def setInitialValues(value: InitialFormValues): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setModified(value: StringDictionary[Boolean]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setSubmitError(value: Any): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrors(value: SubmissionErrors): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: StringDictionary[Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      inline def setValues(value: FormValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setVisited(value: StringDictionary[Boolean]): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type FormSubscriber[FormValues, InitialFormValues] = Subscriber[FormState[FormValues, InitialFormValues]]
  
  trait FormSubscription extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    var dirtyFields: js.UndefOr[Boolean] = js.undefined
    
    var dirtyFieldsSinceLastSubmit: js.UndefOr[Boolean] = js.undefined
    
    var dirtySinceLastSubmit: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errors: js.UndefOr[Boolean] = js.undefined
    
    var hasSubmitErrors: js.UndefOr[Boolean] = js.undefined
    
    var hasValidationErrors: js.UndefOr[Boolean] = js.undefined
    
    var initialValues: js.UndefOr[Boolean] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var modified: js.UndefOr[Boolean] = js.undefined
    
    var modifiedSinceLastSubmit: js.UndefOr[Boolean] = js.undefined
    
    var pristine: js.UndefOr[Boolean] = js.undefined
    
    var submitError: js.UndefOr[Boolean] = js.undefined
    
    var submitErrors: js.UndefOr[Boolean] = js.undefined
    
    var submitFailed: js.UndefOr[Boolean] = js.undefined
    
    var submitSucceeded: js.UndefOr[Boolean] = js.undefined
    
    var submitting: js.UndefOr[Boolean] = js.undefined
    
    var touched: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
    
    var validating: js.UndefOr[Boolean] = js.undefined
    
    var values: js.UndefOr[Boolean] = js.undefined
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object FormSubscription {
    
    inline def apply(): FormSubscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSubscription]
    }
    
    extension [Self <: FormSubscription](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyFields(value: Boolean): Self = StObject.set(x, "dirtyFields", value.asInstanceOf[js.Any])
      
      inline def setDirtyFieldsSinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setDirtyFieldsSinceLastSubmitUndefined: Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", js.undefined)
      
      inline def setDirtyFieldsUndefined: Self = StObject.set(x, "dirtyFields", js.undefined)
      
      inline def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setDirtySinceLastSubmitUndefined: Self = StObject.set(x, "dirtySinceLastSubmit", js.undefined)
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setHasSubmitErrors(value: Boolean): Self = StObject.set(x, "hasSubmitErrors", value.asInstanceOf[js.Any])
      
      inline def setHasSubmitErrorsUndefined: Self = StObject.set(x, "hasSubmitErrors", js.undefined)
      
      inline def setHasValidationErrors(value: Boolean): Self = StObject.set(x, "hasValidationErrors", value.asInstanceOf[js.Any])
      
      inline def setHasValidationErrorsUndefined: Self = StObject.set(x, "hasValidationErrors", js.undefined)
      
      inline def setInitialValues(value: Boolean): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmitUndefined: Self = StObject.set(x, "modifiedSinceLastSubmit", js.undefined)
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setPristineUndefined: Self = StObject.set(x, "pristine", js.undefined)
      
      inline def setSubmitError(value: Boolean): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      inline def setSubmitErrors(value: Boolean): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceededUndefined: Self = StObject.set(x, "submitSucceeded", js.undefined)
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      inline def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type GetFieldValidator[FieldValue] = js.Function0[js.UndefOr[FieldValidator[FieldValue]]]
  
  type GetIn_ = js.Function2[/* state */ js.Object, /* complexKey */ String, Any]
  
  trait InternalFieldState[FieldValue] extends StObject {
    
    var active: Boolean
    
    def blur(): Unit
    
    def change(value: Any): Unit
    
    var data: AnyObject
    
    def focus(): Unit
    
    def isEqual(a: Any, b: Any): Boolean
    @JSName("isEqual")
    var isEqual_Original: IsEqual
    
    var lastFieldState: js.UndefOr[FieldState[FieldValue]] = js.undefined
    
    var length: js.UndefOr[Any] = js.undefined
    
    var modified: Boolean
    
    var modifiedSinceLastSubmit: Boolean
    
    var name: String
    
    var touched: Boolean
    
    var valid: Boolean
    
    var validateFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var validating: Boolean
    
    var validators: NumberDictionary[GetFieldValidator[FieldValue]]
    
    var visited: Boolean
  }
  object InternalFieldState {
    
    inline def apply[FieldValue](
      active: Boolean,
      blur: () => Unit,
      change: Any => Unit,
      data: AnyObject,
      focus: () => Unit,
      isEqual: (/* a */ Any, /* b */ Any) => Boolean,
      modified: Boolean,
      modifiedSinceLastSubmit: Boolean,
      name: String,
      touched: Boolean,
      valid: Boolean,
      validating: Boolean,
      validators: NumberDictionary[GetFieldValidator[FieldValue]],
      visited: Boolean
    ): InternalFieldState[FieldValue] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], blur = js.Any.fromFunction0(blur), change = js.Any.fromFunction1(change), data = data.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), isEqual = js.Any.fromFunction2(isEqual), modified = modified.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalFieldState[FieldValue]]
    }
    
    extension [Self <: InternalFieldState[?], FieldValue](x: Self & InternalFieldState[FieldValue]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setChange(value: Any => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setData(value: AnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setIsEqual(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
      
      inline def setLastFieldState(value: FieldState[FieldValue]): Self = StObject.set(x, "lastFieldState", value.asInstanceOf[js.Any])
      
      inline def setLastFieldStateUndefined: Self = StObject.set(x, "lastFieldState", js.undefined)
      
      inline def setLength(value: Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidateFields(value: js.Array[String]): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
      
      inline def setValidateFieldsUndefined: Self = StObject.set(x, "validateFields", js.undefined)
      
      inline def setValidateFieldsVarargs(value: String*): Self = StObject.set(x, "validateFields", js.Array(value*))
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      inline def setValidators(value: NumberDictionary[GetFieldValidator[FieldValue]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalFormState extends StObject {
    
    var active: js.UndefOr[String] = js.undefined
    
    var dirtySinceLastSubmit: Boolean
    
    var error: js.UndefOr[Any] = js.undefined
    
    var errors: ValidationErrors
    
    var initialValues: js.UndefOr[js.Object] = js.undefined
    
    var lastSubmittedValues: js.UndefOr[js.Object] = js.undefined
    
    var modifiedSinceLastSubmit: Boolean
    
    var pristine: Boolean
    
    var resetWhileSubmitting: Boolean
    
    var submitError: js.UndefOr[Any] = js.undefined
    
    var submitErrors: js.UndefOr[js.Object] = js.undefined
    
    var submitFailed: Boolean
    
    var submitSucceeded: Boolean
    
    var submitting: Boolean
    
    var valid: Boolean
    
    var validating: Double
    
    var values: js.Object
  }
  object InternalFormState {
    
    inline def apply(
      dirtySinceLastSubmit: Boolean,
      modifiedSinceLastSubmit: Boolean,
      pristine: Boolean,
      resetWhileSubmitting: Boolean,
      submitFailed: Boolean,
      submitSucceeded: Boolean,
      submitting: Boolean,
      valid: Boolean,
      validating: Double,
      values: js.Object
    ): InternalFormState = {
      val __obj = js.Dynamic.literal(dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], resetWhileSubmitting = resetWhileSubmitting.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalFormState]
    }
    
    extension [Self <: InternalFormState](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrors(value: ValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setInitialValues(value: js.Object): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      inline def setLastSubmittedValues(value: js.Object): Self = StObject.set(x, "lastSubmittedValues", value.asInstanceOf[js.Any])
      
      inline def setLastSubmittedValuesUndefined: Self = StObject.set(x, "lastSubmittedValues", js.undefined)
      
      inline def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setResetWhileSubmitting(value: Boolean): Self = StObject.set(x, "resetWhileSubmitting", value.asInstanceOf[js.Any])
      
      inline def setSubmitError(value: Any): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      inline def setSubmitErrors(value: js.Object): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidating(value: Double): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type IsEqual = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  trait MutableState[FormValues, InitialFormValues] extends StObject {
    
    var fieldSubscribers: StringDictionary[Subscribers[FieldState[Any]]]
    
    var fields: StringDictionary[InternalFieldState[Any]]
    
    var formState: InternalFormState
    
    var lastFormState: js.UndefOr[FormState[FormValues, InitialFormValues]] = js.undefined
  }
  object MutableState {
    
    inline def apply[FormValues, InitialFormValues](
      fieldSubscribers: StringDictionary[Subscribers[FieldState[Any]]],
      fields: StringDictionary[InternalFieldState[Any]],
      formState: InternalFormState
    ): MutableState[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(fieldSubscribers = fieldSubscribers.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableState[FormValues, InitialFormValues]]
    }
    
    extension [Self <: MutableState[?, ?], FormValues, InitialFormValues](x: Self & (MutableState[FormValues, InitialFormValues])) {
      
      inline def setFieldSubscribers(value: StringDictionary[Subscribers[FieldState[Any]]]): Self = StObject.set(x, "fieldSubscribers", value.asInstanceOf[js.Any])
      
      inline def setFields(value: StringDictionary[InternalFieldState[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFormState(value: InternalFormState): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
      
      inline def setLastFormState(value: FormState[FormValues, InitialFormValues]): Self = StObject.set(x, "lastFormState", value.asInstanceOf[js.Any])
      
      inline def setLastFormStateUndefined: Self = StObject.set(x, "lastFormState", js.undefined)
    }
  }
  
  type Mutator[FormValues, InitialFormValues] = js.Function3[
    /* args */ Any, 
    /* state */ MutableState[FormValues, InitialFormValues], 
    /* tools */ Tools[FormValues, InitialFormValues], 
    Any
  ]
  
  type RegisterField[FormValues] = js.Function4[
    /* keyof FormValues */ /* name */ String, 
    /* subscriber */ FieldSubscriber[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
    ], 
    /* subscription */ FieldSubscription, 
    /* config */ js.UndefOr[
      FieldConfig[
        /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
      ]
    ], 
    Unsubscribe
  ]
  
  type RenameField[FormValues, InitialFormValues] = js.Function3[
    /* state */ MutableState[FormValues, InitialFormValues], 
    /* from */ String, 
    /* to */ String, 
    Unit
  ]
  
  type SetIn_ = js.Function3[/* state */ js.Object, /* key */ String, /* value */ Any, js.Object]
  
  type SubmissionErrors = js.UndefOr[AnyObject]
  
  type Subscriber[V] = js.Function1[/* value */ V, Unit]
  
  trait Subscribers[T /* <: js.Object */] extends StObject {
    
    var entries: NumberDictionary[Notified[T]]
    
    var index: Double
  }
  object Subscribers {
    
    inline def apply[T /* <: js.Object */](entries: NumberDictionary[Notified[T]], index: Double): Subscribers[T] = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribers[T]]
    }
    
    extension [Self <: Subscribers[?], T /* <: js.Object */](x: Self & Subscribers[T]) {
      
      inline def setEntries(value: NumberDictionary[Notified[T]]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = StringDictionary[Boolean]
  
  trait Tools[FormValues, InitialFormValues] extends StObject {
    
    def changeValue(
      state: MutableState[FormValues, InitialFormValues],
      name: String,
      mutate: js.Function1[/* value */ Any, Any]
    ): Unit
    @JSName("changeValue")
    var changeValue_Original: ChangeValue[FormValues, InitialFormValues]
    
    def getIn(state: js.Object, complexKey: String): Any
    @JSName("getIn")
    var getIn_Original: GetIn_
    
    def renameField(state: MutableState[FormValues, InitialFormValues], from: String, to: String): Unit
    @JSName("renameField")
    var renameField_Original: RenameField[FormValues, InitialFormValues]
    
    def resetFieldState(name: String): Unit
    
    def setIn(state: js.Object, key: String, value: Any): js.Object
    @JSName("setIn")
    var setIn_Original: SetIn_
    
    def shallowEqual(a: Any, b: Any): Boolean
    @JSName("shallowEqual")
    var shallowEqual_Original: IsEqual
  }
  object Tools {
    
    inline def apply[FormValues, InitialFormValues](
      changeValue: (/* state */ MutableState[FormValues, InitialFormValues], /* name */ String, /* mutate */ js.Function1[/* value */ Any, Any]) => Unit,
      getIn: (/* state */ js.Object, /* complexKey */ String) => Any,
      renameField: (/* state */ MutableState[FormValues, InitialFormValues], /* from */ String, /* to */ String) => Unit,
      resetFieldState: String => Unit,
      setIn: (/* state */ js.Object, /* key */ String, /* value */ Any) => js.Object,
      shallowEqual: (/* a */ Any, /* b */ Any) => Boolean
    ): Tools[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(changeValue = js.Any.fromFunction3(changeValue), getIn = js.Any.fromFunction2(getIn), renameField = js.Any.fromFunction3(renameField), resetFieldState = js.Any.fromFunction1(resetFieldState), setIn = js.Any.fromFunction3(setIn), shallowEqual = js.Any.fromFunction2(shallowEqual))
      __obj.asInstanceOf[Tools[FormValues, InitialFormValues]]
    }
    
    extension [Self <: Tools[?, ?], FormValues, InitialFormValues](x: Self & (Tools[FormValues, InitialFormValues])) {
      
      inline def setChangeValue(
        value: (/* state */ MutableState[FormValues, InitialFormValues], /* name */ String, /* mutate */ js.Function1[/* value */ Any, Any]) => Unit
      ): Self = StObject.set(x, "changeValue", js.Any.fromFunction3(value))
      
      inline def setGetIn(value: (/* state */ js.Object, /* complexKey */ String) => Any): Self = StObject.set(x, "getIn", js.Any.fromFunction2(value))
      
      inline def setRenameField(
        value: (/* state */ MutableState[FormValues, InitialFormValues], /* from */ String, /* to */ String) => Unit
      ): Self = StObject.set(x, "renameField", js.Any.fromFunction3(value))
      
      inline def setResetFieldState(value: String => Unit): Self = StObject.set(x, "resetFieldState", js.Any.fromFunction1(value))
      
      inline def setSetIn(value: (/* state */ js.Object, /* key */ String, /* value */ Any) => js.Object): Self = StObject.set(x, "setIn", js.Any.fromFunction3(value))
      
      inline def setShallowEqual(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "shallowEqual", js.Any.fromFunction2(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
  
  type ValidationErrors = js.UndefOr[AnyObject]
}
