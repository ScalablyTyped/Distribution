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
  
  @scala.inline
  def createForm[FormValues, InitialFormValues](config: Config[FormValues, Partial[FormValues]]): FormApi[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormApi[FormValues, InitialFormValues]]
  
  @JSImport("final-form", "fieldSubscriptionItems")
  @js.native
  val fieldSubscriptionItems: js.Array[String] = js.native
  
  @JSImport("final-form", "formSubscriptionItems")
  @js.native
  val formSubscriptionItems: js.Array[String] = js.native
  
  @scala.inline
  def getIn(state: js.Object, complexKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(state.asInstanceOf[js.Any], complexKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setIn(state: js.Object, key: String, value: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("final-form", "version")
  @js.native
  val version: String = js.native
  
  type AnyObject = StringDictionary[js.Any]
  
  type ChangeValue[FormValues, InitialFormValues] = js.Function3[
    /* state */ MutableState[FormValues, InitialFormValues], 
    /* name */ String, 
    /* mutate */ js.Function1[/* value */ js.Any, js.Any], 
    Unit
  ]
  
  @js.native
  trait Config[FormValues, InitialFormValues] extends StObject {
    
    var debug: js.UndefOr[DebugFunction[FormValues, InitialFormValues]] = js.native
    
    var destroyOnUnregister: js.UndefOr[Boolean] = js.native
    
    var initialValues: js.UndefOr[InitialFormValues] = js.native
    
    var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
    
    var mutators: js.UndefOr[StringDictionary[Mutator[FormValues, InitialFormValues]]] = js.native
    
    def onSubmit(values: FormValues, form: FormApi[FormValues, InitialFormValues]): js.UndefOr[SubmissionErrors | js.Promise[js.UndefOr[SubmissionErrors]] | Unit] = js.native
    def onSubmit(
      values: FormValues,
      form: FormApi[FormValues, InitialFormValues],
      callback: js.Function1[/* errors */ js.UndefOr[SubmissionErrors], Unit]
    ): js.UndefOr[SubmissionErrors | js.Promise[js.UndefOr[SubmissionErrors]] | Unit] = js.native
    
    var validate: js.UndefOr[
        js.Function1[
          /* values */ FormValues, 
          js.UndefOr[ValidationErrors | js.Promise[ValidationErrors]]
        ]
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
    /* fieldStates */ StringDictionary[FieldState[js.Any]], 
    Unit
  ]
  
  type Decorator[FormValues, InitialFormValues] = js.Function1[/* form */ FormApi[FormValues, InitialFormValues], Unsubscribe]
  
  trait FieldConfig[FieldValue] extends StObject {
    
    var afterSubmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeSubmit: js.UndefOr[js.Function0[Unit | `false`]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var getValidator: js.UndefOr[GetFieldValidator[FieldValue]] = js.undefined
    
    var initialValue: js.UndefOr[js.Any] = js.undefined
    
    var isEqual: js.UndefOr[IsEqual] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var validateFields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FieldConfig {
    
    @scala.inline
    def apply[FieldValue](): FieldConfig[FieldValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldConfig[FieldValue]]
    }
    
    @scala.inline
    implicit class FieldConfigMutableBuilder[Self <: FieldConfig[?], FieldValue] (val x: Self & FieldConfig[FieldValue]) extends AnyVal {
      
      @scala.inline
      def setAfterSubmit(value: () => Unit): Self = StObject.set(x, "afterSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterSubmitUndefined: Self = StObject.set(x, "afterSubmit", js.undefined)
      
      @scala.inline
      def setBeforeSubmit(value: () => Unit | `false`): Self = StObject.set(x, "beforeSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeSubmitUndefined: Self = StObject.set(x, "beforeSubmit", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setGetValidator(value: () => js.UndefOr[FieldValidator[FieldValue]]): Self = StObject.set(x, "getValidator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidatorUndefined: Self = StObject.set(x, "getValidator", js.undefined)
      
      @scala.inline
      def setInitialValue(value: js.Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setIsEqual(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setValidateFields(value: js.Array[String]): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFieldsUndefined: Self = StObject.set(x, "validateFields", js.undefined)
      
      @scala.inline
      def setValidateFieldsVarargs(value: String*): Self = StObject.set(x, "validateFields", js.Array(value :_*))
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
    
    var error: js.UndefOr[js.Any] = js.native
    
    def focus(): Unit = js.native
    
    var initial: js.UndefOr[FieldValue] = js.native
    
    var invalid: js.UndefOr[Boolean] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var modified: js.UndefOr[Boolean] = js.native
    
    var modifiedSinceLastSubmit: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var pristine: js.UndefOr[Boolean] = js.native
    
    var submitError: js.UndefOr[js.Any] = js.native
    
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
    
    @scala.inline
    def apply(): FieldSubscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSubscription]
    }
    
    @scala.inline
    implicit class FieldSubscriptionMutableBuilder[Self <: FieldSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtySinceLastSubmitUndefined: Self = StObject.set(x, "dirtySinceLastSubmit", js.undefined)
      
      @scala.inline
      def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmit(value: `false`): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmitUndefined: Self = StObject.set(x, "modifiedSinceLastSubmit", js.undefined)
      
      @scala.inline
      def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristineUndefined: Self = StObject.set(x, "pristine", js.undefined)
      
      @scala.inline
      def setSubmitError(value: Boolean): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSucceededUndefined: Self = StObject.set(x, "submitSucceeded", js.undefined)
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      @scala.inline
      def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type FieldValidator[FieldValue] = js.Function3[
    /* value */ FieldValue, 
    /* allValues */ js.Object, 
    /* meta */ js.UndefOr[FieldState[FieldValue]], 
    js.Any | js.Promise[js.Any]
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
    
    def initialize(data: FormValues): Unit = js.native
    def initialize(data: js.Function1[/* values */ FormValues, FormValues]): Unit = js.native
    
    def isValidationPaused(): Boolean = js.native
    
    var mutators: Record[String, js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    
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
  
  trait FormState[FormValues, InitialFormValues] extends StObject {
    
    // by default: all values are subscribed. if subscription is specified, some values may be undefined
    var active: js.UndefOr[/* keyof FormValues */ String] = js.undefined
    
    var dirty: Boolean
    
    var dirtyFields: StringDictionary[Boolean]
    
    var dirtyFieldsSinceLastSubmit: StringDictionary[Boolean]
    
    var dirtySinceLastSubmit: Boolean
    
    var error: js.Any
    
    var errors: ValidationErrors
    
    var hasSubmitErrors: Boolean
    
    var hasValidationErrors: Boolean
    
    var initialValues: InitialFormValues
    
    var invalid: Boolean
    
    var modified: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var modifiedSinceLastSubmit: Boolean
    
    var pristine: Boolean
    
    var submitError: js.Any
    
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
    
    @scala.inline
    def apply[FormValues, InitialFormValues](
      dirty: Boolean,
      dirtyFields: StringDictionary[Boolean],
      dirtyFieldsSinceLastSubmit: StringDictionary[Boolean],
      dirtySinceLastSubmit: Boolean,
      error: js.Any,
      errors: ValidationErrors,
      hasSubmitErrors: Boolean,
      hasValidationErrors: Boolean,
      initialValues: InitialFormValues,
      invalid: Boolean,
      modifiedSinceLastSubmit: Boolean,
      pristine: Boolean,
      submitError: js.Any,
      submitErrors: SubmissionErrors,
      submitFailed: Boolean,
      submitSucceeded: Boolean,
      submitting: Boolean,
      valid: Boolean,
      validating: Boolean,
      values: FormValues
    ): FormState[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], dirtyFields = dirtyFields.asInstanceOf[js.Any], dirtyFieldsSinceLastSubmit = dirtyFieldsSinceLastSubmit.asInstanceOf[js.Any], dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasSubmitErrors = hasSubmitErrors.asInstanceOf[js.Any], hasValidationErrors = hasValidationErrors.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitError = submitError.asInstanceOf[js.Any], submitErrors = submitErrors.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState[FormValues, InitialFormValues]]
    }
    
    @scala.inline
    implicit class FormStateMutableBuilder[Self <: FormState[?, ?], FormValues, InitialFormValues] (val x: Self & (FormState[FormValues, InitialFormValues])) extends AnyVal {
      
      @scala.inline
      def setActive(value: /* keyof FormValues */ String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFields(value: StringDictionary[Boolean]): Self = StObject.set(x, "dirtyFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFieldsSinceLastSubmit(value: StringDictionary[Boolean]): Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: ValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSubmitErrors(value: Boolean): Self = StObject.set(x, "hasSubmitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasValidationErrors(value: Boolean): Self = StObject.set(x, "hasValidationErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValues(value: InitialFormValues): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: StringDictionary[Boolean]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitError(value: js.Any): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrors(value: SubmissionErrors): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouched(value: StringDictionary[Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: FormValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisited(value: StringDictionary[Boolean]): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
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
    
    @scala.inline
    def apply(): FormSubscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSubscription]
    }
    
    @scala.inline
    implicit class FormSubscriptionMutableBuilder[Self <: FormSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFields(value: Boolean): Self = StObject.set(x, "dirtyFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFieldsSinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFieldsSinceLastSubmitUndefined: Self = StObject.set(x, "dirtyFieldsSinceLastSubmit", js.undefined)
      
      @scala.inline
      def setDirtyFieldsUndefined: Self = StObject.set(x, "dirtyFields", js.undefined)
      
      @scala.inline
      def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtySinceLastSubmitUndefined: Self = StObject.set(x, "dirtySinceLastSubmit", js.undefined)
      
      @scala.inline
      def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setHasSubmitErrors(value: Boolean): Self = StObject.set(x, "hasSubmitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSubmitErrorsUndefined: Self = StObject.set(x, "hasSubmitErrors", js.undefined)
      
      @scala.inline
      def setHasValidationErrors(value: Boolean): Self = StObject.set(x, "hasValidationErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasValidationErrorsUndefined: Self = StObject.set(x, "hasValidationErrors", js.undefined)
      
      @scala.inline
      def setInitialValues(value: Boolean): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmitUndefined: Self = StObject.set(x, "modifiedSinceLastSubmit", js.undefined)
      
      @scala.inline
      def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristineUndefined: Self = StObject.set(x, "pristine", js.undefined)
      
      @scala.inline
      def setSubmitError(value: Boolean): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      @scala.inline
      def setSubmitErrors(value: Boolean): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSucceededUndefined: Self = StObject.set(x, "submitSucceeded", js.undefined)
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      @scala.inline
      def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
      
      @scala.inline
      def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type GetFieldValidator[FieldValue] = js.Function0[js.UndefOr[FieldValidator[FieldValue]]]
  
  type GetIn_ = js.Function2[/* state */ js.Object, /* complexKey */ String, js.Any]
  
  trait InternalFieldState[FieldValue] extends StObject {
    
    var active: Boolean
    
    def blur(): Unit
    
    def change(value: js.Any): Unit
    
    var data: AnyObject
    
    def focus(): Unit
    
    def isEqual(a: js.Any, b: js.Any): Boolean
    @JSName("isEqual")
    var isEqual_Original: IsEqual
    
    var lastFieldState: js.UndefOr[FieldState[FieldValue]] = js.undefined
    
    var length: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply[FieldValue](
      active: Boolean,
      blur: () => Unit,
      change: js.Any => Unit,
      data: AnyObject,
      focus: () => Unit,
      isEqual: (/* a */ js.Any, /* b */ js.Any) => Boolean,
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
    
    @scala.inline
    implicit class InternalFieldStateMutableBuilder[Self <: InternalFieldState[?], FieldValue] (val x: Self & InternalFieldState[FieldValue]) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChange(value: js.Any => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: AnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEqual(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLastFieldState(value: FieldState[FieldValue]): Self = StObject.set(x, "lastFieldState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFieldStateUndefined: Self = StObject.set(x, "lastFieldState", js.undefined)
      
      @scala.inline
      def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFields(value: js.Array[String]): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFieldsUndefined: Self = StObject.set(x, "validateFields", js.undefined)
      
      @scala.inline
      def setValidateFieldsVarargs(value: String*): Self = StObject.set(x, "validateFields", js.Array(value :_*))
      
      @scala.inline
      def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidators(value: NumberDictionary[GetFieldValidator[FieldValue]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalFormState extends StObject {
    
    var active: js.UndefOr[String] = js.undefined
    
    var dirtySinceLastSubmit: Boolean
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var errors: ValidationErrors
    
    var initialValues: js.UndefOr[js.Object] = js.undefined
    
    var lastSubmittedValues: js.UndefOr[js.Object] = js.undefined
    
    var modifiedSinceLastSubmit: Boolean
    
    var pristine: Boolean
    
    var submitError: js.UndefOr[js.Any] = js.undefined
    
    var submitErrors: js.UndefOr[js.Object] = js.undefined
    
    var submitFailed: Boolean
    
    var submitSucceeded: Boolean
    
    var submitting: Boolean
    
    var valid: Boolean
    
    var validating: Double
    
    var values: js.Object
  }
  object InternalFormState {
    
    @scala.inline
    def apply(
      dirtySinceLastSubmit: Boolean,
      errors: ValidationErrors,
      modifiedSinceLastSubmit: Boolean,
      pristine: Boolean,
      submitFailed: Boolean,
      submitSucceeded: Boolean,
      submitting: Boolean,
      valid: Boolean,
      validating: Double,
      values: js.Object
    ): InternalFormState = {
      val __obj = js.Dynamic.literal(dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalFormState]
    }
    
    @scala.inline
    implicit class InternalFormStateMutableBuilder[Self <: InternalFormState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDirtySinceLastSubmit(value: Boolean): Self = StObject.set(x, "dirtySinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrors(value: ValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValues(value: js.Object): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
      
      @scala.inline
      def setLastSubmittedValues(value: js.Object): Self = StObject.set(x, "lastSubmittedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSubmittedValuesUndefined: Self = StObject.set(x, "lastSubmittedValues", js.undefined)
      
      @scala.inline
      def setModifiedSinceLastSubmit(value: Boolean): Self = StObject.set(x, "modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitError(value: js.Any): Self = StObject.set(x, "submitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorUndefined: Self = StObject.set(x, "submitError", js.undefined)
      
      @scala.inline
      def setSubmitErrors(value: js.Object): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitSucceeded(value: Boolean): Self = StObject.set(x, "submitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidating(value: Double): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type IsEqual = js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  
  trait MutableState[FormValues, InitialFormValues] extends StObject {
    
    var fieldSubscribers: StringDictionary[Subscribers[FieldState[js.Any]]]
    
    var fields: StringDictionary[InternalFieldState[js.Any]]
    
    var formState: InternalFormState
    
    var lastFormState: js.UndefOr[FormState[FormValues, InitialFormValues]] = js.undefined
  }
  object MutableState {
    
    @scala.inline
    def apply[FormValues, InitialFormValues](
      fieldSubscribers: StringDictionary[Subscribers[FieldState[js.Any]]],
      fields: StringDictionary[InternalFieldState[js.Any]],
      formState: InternalFormState
    ): MutableState[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(fieldSubscribers = fieldSubscribers.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableState[FormValues, InitialFormValues]]
    }
    
    @scala.inline
    implicit class MutableStateMutableBuilder[Self <: MutableState[?, ?], FormValues, InitialFormValues] (val x: Self & (MutableState[FormValues, InitialFormValues])) extends AnyVal {
      
      @scala.inline
      def setFieldSubscribers(value: StringDictionary[Subscribers[FieldState[js.Any]]]): Self = StObject.set(x, "fieldSubscribers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: StringDictionary[InternalFieldState[js.Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormState(value: InternalFormState): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFormState(value: FormState[FormValues, InitialFormValues]): Self = StObject.set(x, "lastFormState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFormStateUndefined: Self = StObject.set(x, "lastFormState", js.undefined)
    }
  }
  
  type Mutator[FormValues, InitialFormValues] = js.Function3[
    /* args */ js.Any, 
    /* state */ MutableState[FormValues, InitialFormValues], 
    /* tools */ Tools[FormValues, InitialFormValues], 
    js.Any
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
  
  type SetIn_ = js.Function3[/* state */ js.Object, /* key */ String, /* value */ js.Any, js.Object]
  
  type SubmissionErrors = AnyObject
  
  type Subscriber[V] = js.Function1[/* value */ V, Unit]
  
  trait Subscribers[T /* <: js.Object */] extends StObject {
    
    var entries: NumberDictionary[Notified[T]]
    
    var index: Double
  }
  object Subscribers {
    
    @scala.inline
    def apply[T /* <: js.Object */](entries: NumberDictionary[Notified[T]], index: Double): Subscribers[T] = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribers[T]]
    }
    
    @scala.inline
    implicit class SubscribersMutableBuilder[Self <: Subscribers[?], T /* <: js.Object */] (val x: Self & Subscribers[T]) extends AnyVal {
      
      @scala.inline
      def setEntries(value: NumberDictionary[Notified[T]]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = StringDictionary[Boolean]
  
  trait Tools[FormValues, InitialFormValues] extends StObject {
    
    def changeValue(
      state: MutableState[FormValues, InitialFormValues],
      name: String,
      mutate: js.Function1[/* value */ js.Any, js.Any]
    ): Unit
    @JSName("changeValue")
    var changeValue_Original: ChangeValue[FormValues, InitialFormValues]
    
    def getIn(state: js.Object, complexKey: String): js.Any
    @JSName("getIn")
    var getIn_Original: GetIn_
    
    def renameField(state: MutableState[FormValues, InitialFormValues], from: String, to: String): Unit
    @JSName("renameField")
    var renameField_Original: RenameField[FormValues, InitialFormValues]
    
    def resetFieldState(name: String): Unit
    
    def setIn(state: js.Object, key: String, value: js.Any): js.Object
    @JSName("setIn")
    var setIn_Original: SetIn_
    
    def shallowEqual(a: js.Any, b: js.Any): Boolean
    @JSName("shallowEqual")
    var shallowEqual_Original: IsEqual
  }
  object Tools {
    
    @scala.inline
    def apply[FormValues, InitialFormValues](
      changeValue: (/* state */ MutableState[FormValues, InitialFormValues], /* name */ String, /* mutate */ js.Function1[/* value */ js.Any, js.Any]) => Unit,
      getIn: (/* state */ js.Object, /* complexKey */ String) => js.Any,
      renameField: (/* state */ MutableState[FormValues, InitialFormValues], /* from */ String, /* to */ String) => Unit,
      resetFieldState: String => Unit,
      setIn: (/* state */ js.Object, /* key */ String, /* value */ js.Any) => js.Object,
      shallowEqual: (/* a */ js.Any, /* b */ js.Any) => Boolean
    ): Tools[FormValues, InitialFormValues] = {
      val __obj = js.Dynamic.literal(changeValue = js.Any.fromFunction3(changeValue), getIn = js.Any.fromFunction2(getIn), renameField = js.Any.fromFunction3(renameField), resetFieldState = js.Any.fromFunction1(resetFieldState), setIn = js.Any.fromFunction3(setIn), shallowEqual = js.Any.fromFunction2(shallowEqual))
      __obj.asInstanceOf[Tools[FormValues, InitialFormValues]]
    }
    
    @scala.inline
    implicit class ToolsMutableBuilder[Self <: Tools[?, ?], FormValues, InitialFormValues] (val x: Self & (Tools[FormValues, InitialFormValues])) extends AnyVal {
      
      @scala.inline
      def setChangeValue(
        value: (/* state */ MutableState[FormValues, InitialFormValues], /* name */ String, /* mutate */ js.Function1[/* value */ js.Any, js.Any]) => Unit
      ): Self = StObject.set(x, "changeValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetIn(value: (/* state */ js.Object, /* complexKey */ String) => js.Any): Self = StObject.set(x, "getIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenameField(
        value: (/* state */ MutableState[FormValues, InitialFormValues], /* from */ String, /* to */ String) => Unit
      ): Self = StObject.set(x, "renameField", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResetFieldState(value: String => Unit): Self = StObject.set(x, "resetFieldState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIn(value: (/* state */ js.Object, /* key */ String, /* value */ js.Any) => js.Object): Self = StObject.set(x, "setIn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShallowEqual(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "shallowEqual", js.Any.fromFunction2(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
  
  type ValidationErrors = AnyObject
}
