package typings.formik

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.formik.anon.FnCall
import typings.formik.anon.FnCallE
import typings.formik.anon.Validate
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SelectHTMLAttributes
import typings.react.mod.SetStateAction
import typings.react.mod.SyntheticEvent
import typings.react.mod.TextareaHTMLAttributes
import typings.std.Event
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait FieldHelperProps[Value] extends StObject {
    
    /** Set the field's error value */
    def setError(value: Value): Unit = js.native
    
    /** Set the field's touched value */
    def setTouched(value: Boolean): Unit = js.native
    def setTouched(value: Boolean, shouldValidate: Boolean): Unit = js.native
    
    /** Set the field's value */
    def setValue(value: Value): Unit = js.native
    def setValue(value: Value, shouldValidate: Boolean): Unit = js.native
  }
  
  trait FieldInputProps[Value] extends StObject {
    
    /** Is the field checked? */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Multiple select? */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the field */
    var name: String
    
    /** Blur event handler */
    var onBlur: FnCallE
    
    /** Change event handler */
    var onChange: FnCall
    
    /** Value of the field */
    var value: Value
  }
  object FieldInputProps {
    
    inline def apply[Value](name: String, onBlur: FnCallE, onChange: FnCall, value: Value): FieldInputProps[Value] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInputProps[Value]]
    }
    
    extension [Self <: FieldInputProps[?], Value](x: Self & FieldInputProps[Value]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: FnCallE): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: FnCall): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldMetaProps[Value] extends StObject {
    
    /** Error message of the field */
    var error: js.UndefOr[String] = js.undefined
    
    /** Initial error message of the field */
    var initialError: js.UndefOr[String] = js.undefined
    
    /** Initial touched state of the field */
    var initialTouched: Boolean
    
    /** Initial value of the field */
    var initialValue: js.UndefOr[Value] = js.undefined
    
    /** Has the field been visited? */
    var touched: Boolean
    
    /** Value of the field */
    var value: Value
  }
  object FieldMetaProps {
    
    inline def apply[Value](initialTouched: Boolean, touched: Boolean, value: Value): FieldMetaProps[Value] = {
      val __obj = js.Dynamic.literal(initialTouched = initialTouched.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldMetaProps[Value]]
    }
    
    extension [Self <: FieldMetaProps[?], Value](x: Self & FieldMetaProps[Value]) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInitialError(value: String): Self = StObject.set(x, "initialError", value.asInstanceOf[js.Any])
      
      inline def setInitialErrorUndefined: Self = StObject.set(x, "initialError", js.undefined)
      
      inline def setInitialTouched(value: Boolean): Self = StObject.set(x, "initialTouched", value.asInstanceOf[js.Any])
      
      inline def setInitialValue(value: Value): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldValidator = js.Function1[/* value */ js.Any, String | Unit | (js.Promise[String | Unit])]
  
  trait FormikComputedProps[Values] extends StObject {
    
    /** True if any input has been touched. False otherwise. */
    val dirty: Boolean
    
    /** The initial errors of the form */
    val initialErrors: FormikErrors[Values]
    
    /** The initial status of the form */
    val initialStatus: js.UndefOr[js.Any] = js.undefined
    
    /** The initial visited fields of the form */
    val initialTouched: FormikTouched[Values]
    
    /** The initial values of the form */
    val initialValues: Values
    
    /** True if state.errors is empty */
    val isValid: Boolean
  }
  object FormikComputedProps {
    
    inline def apply[Values](
      dirty: Boolean,
      initialErrors: FormikErrors[Values],
      initialTouched: FormikTouched[Values],
      initialValues: Values,
      isValid: Boolean
    ): FormikComputedProps[Values] = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], initialErrors = initialErrors.asInstanceOf[js.Any], initialTouched = initialTouched.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormikComputedProps[Values]]
    }
    
    extension [Self <: FormikComputedProps[?], Values](x: Self & FormikComputedProps[Values]) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setInitialErrors(value: FormikErrors[Values]): Self = StObject.set(x, "initialErrors", value.asInstanceOf[js.Any])
      
      inline def setInitialStatus(value: js.Any): Self = StObject.set(x, "initialStatus", value.asInstanceOf[js.Any])
      
      inline def setInitialStatusUndefined: Self = StObject.set(x, "initialStatus", js.undefined)
      
      inline def setInitialTouched(value: FormikTouched[Values]): Self = StObject.set(x, "initialTouched", value.asInstanceOf[js.Any])
      
      inline def setInitialValues(value: Values): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormikConfig[Values]
    extends StObject
       with FormikSharedConfig[js.Object] {
    
    /**
      * React children or child render callback
      */
    var children: js.UndefOr[(js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode] = js.undefined
    
    /**
      * Form component to render
      */
    var component: js.UndefOr[ComponentType[FormikProps[Values]] | ReactNode] = js.undefined
    
    /** Initial object map of field names to specific error for that field */
    var initialErrors: js.UndefOr[FormikErrors[Values]] = js.undefined
    
    /**
      * Initial status
      */
    var initialStatus: js.UndefOr[js.Any] = js.undefined
    
    /** Initial object map of field names to whether the field has been touched */
    var initialTouched: js.UndefOr[FormikTouched[Values]] = js.undefined
    
    /**
      * Initial values of the form
      */
    var initialValues: Values
    
    /** Inner ref */
    var innerRef: js.UndefOr[Ref[FormikProps[Values]]] = js.undefined
    
    /**
      * Reset handler
      */
    var onReset: js.UndefOr[
        js.Function2[/* values */ Values, /* formikHelpers */ FormikHelpers[Values], Unit]
      ] = js.undefined
    
    /**
      * Submission handler
      */
    def onSubmit(values: Values, formikHelpers: FormikHelpers[Values]): Unit | js.Promise[js.Any]
    
    /**
      * Render prop (works like React router's <Route render={props =>} />)
      * @deprecated
      */
    var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], ReactNode]] = js.undefined
    
    /**
      * Validation function. Must return an error object or promise that
      * throws an error object where that object keys map to corresponding value.
      */
    var validate: js.UndefOr[
        js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
      ] = js.undefined
    
    /**
      * A Yup Schema or a function that returns a Yup schema
      */
    var validationSchema: js.UndefOr[js.Any | js.Function0[js.Any]] = js.undefined
  }
  object FormikConfig {
    
    inline def apply[Values](initialValues: Values, onSubmit: (Values, FormikHelpers[Values]) => Unit | js.Promise[js.Any]): FormikConfig[Values] = {
      val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
      __obj.asInstanceOf[FormikConfig[Values]]
    }
    
    extension [Self <: FormikConfig[?], Values](x: Self & FormikConfig[Values]) {
      
      inline def setChildren(value: (js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ FormikProps[Values] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ComponentType[FormikProps[Values]] | ReactNode): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setInitialErrors(value: FormikErrors[Values]): Self = StObject.set(x, "initialErrors", value.asInstanceOf[js.Any])
      
      inline def setInitialErrorsUndefined: Self = StObject.set(x, "initialErrors", js.undefined)
      
      inline def setInitialStatus(value: js.Any): Self = StObject.set(x, "initialStatus", value.asInstanceOf[js.Any])
      
      inline def setInitialStatusUndefined: Self = StObject.set(x, "initialStatus", js.undefined)
      
      inline def setInitialTouched(value: FormikTouched[Values]): Self = StObject.set(x, "initialTouched", value.asInstanceOf[js.Any])
      
      inline def setInitialTouchedUndefined: Self = StObject.set(x, "initialTouched", js.undefined)
      
      inline def setInitialValues(value: Values): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[FormikProps[Values]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ FormikProps[Values] | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnReset(value: (/* values */ Values, /* formikHelpers */ FormikHelpers[Values]) => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction2(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(value: (Values, FormikHelpers[Values]) => Unit | js.Promise[js.Any]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      inline def setRender(value: /* props */ FormikProps[Values] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setValidate(value: /* values */ Values => Unit | js.Object | js.Promise[FormikErrors[Values]]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidationSchema(value: js.Any | js.Function0[js.Any]): Self = StObject.set(x, "validationSchema", value.asInstanceOf[js.Any])
      
      inline def setValidationSchemaFunction0(value: () => js.Any): Self = StObject.set(x, "validationSchema", js.Any.fromFunction0(value))
      
      inline def setValidationSchemaUndefined: Self = StObject.set(x, "validationSchema", js.undefined)
    }
  }
  
  /* Inlined formik.formik/dist/types.FormikProps<Values> & std.Pick<formik.formik/dist/types.FormikConfig<Values>, 'validate' | 'validationSchema'> */
  @js.native
  trait FormikContextType[Values] extends StObject {
    
    /** True if any input has been touched. False otherwise. */
    val dirty: Boolean = js.native
    
    /** Should Formik reset the form when new initialValues change */
    var enableReinitialize: js.UndefOr[Boolean] = js.native
    
    /** map of field names to specific error for that field */
    var errors: FormikErrors[Values] = js.native
    
    def getFieldHelpers[Value](name: String): FieldHelperProps[Value] = js.native
    
    def getFieldMeta[Value](name: String): FieldMetaProps[Value] = js.native
    
    def getFieldProps[Value](props: js.Any): FieldInputProps[Value] = js.native
    
    def handleBlur(e: FocusEvent[js.Any]): Unit = js.native
    def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
    
    def handleChange(e: ChangeEvent[js.Any]): Unit = js.native
    def handleChange[T](field: T): (js.Function1[/* e */ String | ChangeEvent[js.Any], Unit]) | Unit = js.native
    
    /** Reset form event handler  */
    def handleReset(): Unit = js.native
    def handleReset(e: SyntheticEvent[js.Any, Event]): Unit = js.native
    
    /** Form submit handler */
    def handleSubmit(): Unit = js.native
    def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
    
    /** The initial errors of the form */
    val initialErrors: FormikErrors[Values] = js.native
    
    /** The initial status of the form */
    val initialStatus: js.UndefOr[js.Any] = js.native
    
    /** The initial visited fields of the form */
    val initialTouched: FormikTouched[Values] = js.native
    
    /** The initial values of the form */
    val initialValues: Values = js.native
    
    /** Tell Formik if initial form values are valid or not on first render */
    var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ js.Object, Boolean])] = js.native
    
    /** whether the form is currently submitting */
    var isSubmitting: Boolean = js.native
    
    /** True if state.errors is empty */
    val isValid: Boolean = js.native
    
    /** whether the form is currently validating (prior to submission) */
    var isValidating: Boolean = js.native
    
    def registerField(name: String, fns: Validate): Unit = js.native
    
    /** Reset form */
    def resetForm(): Unit = js.native
    def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
    
    /** Manually set errors object */
    def setErrors(errors: FormikErrors[Values]): Unit = js.native
    
    /** Set error message of a form field directly */
    def setFieldError(field: String, message: String): Unit = js.native
    
    /** Set whether field has been touched directly */
    def setFieldTouched(field: String): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Unit, shouldValidate: Boolean): Unit = js.native
    
    /** Set value of form field directly */
    def setFieldValue(field: String, value: js.Any): Unit = js.native
    def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
    
    def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]]): Unit = js.native
    def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]], cb: js.Function0[Unit]): Unit = js.native
    /** Set Formik state, careful! */
    def setFormikState(f: FormikState[Values]): Unit = js.native
    def setFormikState(f: FormikState[Values], cb: js.Function0[Unit]): Unit = js.native
    
    /** Manually set top level status. */
    def setStatus(): Unit = js.native
    def setStatus(status: js.Any): Unit = js.native
    
    /** Manually set isSubmitting */
    def setSubmitting(isSubmitting: Boolean): Unit = js.native
    
    /** Manually set touched object */
    def setTouched(touched: FormikTouched[Values]): Unit = js.native
    def setTouched(touched: FormikTouched[Values], shouldValidate: Boolean): Unit = js.native
    
    /** Manually set values object  */
    def setValues(values: SetStateAction[Values]): Unit = js.native
    def setValues(values: SetStateAction[Values], shouldValidate: Boolean): Unit = js.native
    
    /** Top level status state, in case you need it */
    var status: js.UndefOr[js.Any] = js.native
    
    /** Number of times user tried to submit the form */
    var submitCount: Double = js.native
    
    /** Submit the form imperatively */
    def submitForm(): js.Promise[js.Any] = js.native
    
    /** map of field names to whether the field has been touched */
    var touched: FormikTouched[Values] = js.native
    
    def unregisterField(name: String): Unit = js.native
    
    var validate: js.UndefOr[
        js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
      ] = js.native
    
    /** Validate field value */
    def validateField(field: String): Unit = js.native
    
    /** Validate form values */
    def validateForm(): js.Promise[FormikErrors[Values]] = js.native
    def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
    
    /** Tells Formik to validate the form on each input's onBlur event */
    var validateOnBlur: js.UndefOr[Boolean] = js.native
    
    /** Tells Formik to validate the form on each input's onChange event */
    var validateOnChange: js.UndefOr[Boolean] = js.native
    
    /** Tells Formik to validate upon mount */
    var validateOnMount: js.UndefOr[Boolean] = js.native
    
    var validationSchema: js.UndefOr[js.Any | js.Function0[js.Any]] = js.native
    
    /** Form values */
    var values: Values = js.native
  }
  
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K][number]> * / object> | string | std.Array<string> : string | std.Array<string> : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typings.formik.formikStrings.FormikErrors & TopLevel[js.Any]
  
  @js.native
  trait FormikHandlers extends StObject {
    
    def getFieldHelpers[Value](name: String): FieldHelperProps[Value] = js.native
    
    def getFieldMeta[Value](name: String): FieldMetaProps[Value] = js.native
    
    def getFieldProps[Value](props: js.Any): FieldInputProps[Value] = js.native
    
    def handleBlur(e: FocusEvent[js.Any]): Unit = js.native
    def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
    
    def handleChange(e: ChangeEvent[js.Any]): Unit = js.native
    def handleChange[T](field: T): (js.Function1[/* e */ String | ChangeEvent[js.Any], Unit]) | Unit = js.native
    
    /** Reset form event handler  */
    def handleReset(): Unit = js.native
    def handleReset(e: SyntheticEvent[js.Any, Event]): Unit = js.native
    
    /** Form submit handler */
    def handleSubmit(): Unit = js.native
    def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
  }
  
  @js.native
  trait FormikHelpers[Values] extends StObject {
    
    /** Reset form */
    def resetForm(): Unit = js.native
    def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
    
    /** Manually set errors object */
    def setErrors(errors: FormikErrors[Values]): Unit = js.native
    
    /** Set error message of a form field directly */
    def setFieldError(field: String, message: String): Unit = js.native
    
    /** Set whether field has been touched directly */
    def setFieldTouched(field: String): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Unit, shouldValidate: Boolean): Unit = js.native
    
    /** Set value of form field directly */
    def setFieldValue(field: String, value: js.Any): Unit = js.native
    def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
    
    def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]]): Unit = js.native
    def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]], cb: js.Function0[Unit]): Unit = js.native
    /** Set Formik state, careful! */
    def setFormikState(f: FormikState[Values]): Unit = js.native
    def setFormikState(f: FormikState[Values], cb: js.Function0[Unit]): Unit = js.native
    
    /** Manually set top level status. */
    def setStatus(): Unit = js.native
    def setStatus(status: js.Any): Unit = js.native
    
    /** Manually set isSubmitting */
    def setSubmitting(isSubmitting: Boolean): Unit = js.native
    
    /** Manually set touched object */
    def setTouched(touched: FormikTouched[Values]): Unit = js.native
    def setTouched(touched: FormikTouched[Values], shouldValidate: Boolean): Unit = js.native
    
    /** Manually set values object  */
    def setValues(values: SetStateAction[Values]): Unit = js.native
    def setValues(values: SetStateAction[Values], shouldValidate: Boolean): Unit = js.native
    
    /** Submit the form imperatively */
    def submitForm(): js.Promise[Unit] = js.native
    
    /** Validate field value */
    def validateField(field: String): Unit = js.native
    
    /** Validate form values */
    def validateForm(): js.Promise[FormikErrors[Values]] = js.native
    def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
  }
  
  @js.native
  trait FormikProps[Values]
    extends StObject
       with FormikSharedConfig[js.Object]
       with FormikState[Values]
       with FormikHelpers[Values]
       with FormikHandlers
       with FormikComputedProps[Values]
       with FormikRegistration
  
  trait FormikRegistration extends StObject {
    
    def registerField(name: String, fns: Validate): Unit
    
    def unregisterField(name: String): Unit
  }
  object FormikRegistration {
    
    inline def apply(registerField: (String, Validate) => Unit, unregisterField: String => Unit): FormikRegistration = {
      val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
      __obj.asInstanceOf[FormikRegistration]
    }
    
    extension [Self <: FormikRegistration](x: Self) {
      
      inline def setRegisterField(value: (String, Validate) => Unit): Self = StObject.set(x, "registerField", js.Any.fromFunction2(value))
      
      inline def setUnregisterField(value: String => Unit): Self = StObject.set(x, "unregisterField", js.Any.fromFunction1(value))
    }
  }
  
  trait FormikSharedConfig[Props] extends StObject {
    
    /** Should Formik reset the form when new initialValues change */
    var enableReinitialize: js.UndefOr[Boolean] = js.undefined
    
    /** Tell Formik if initial form values are valid or not on first render */
    var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ Props, Boolean])] = js.undefined
    
    /** Tells Formik to validate the form on each input's onBlur event */
    var validateOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Tells Formik to validate the form on each input's onChange event */
    var validateOnChange: js.UndefOr[Boolean] = js.undefined
    
    /** Tells Formik to validate upon mount */
    var validateOnMount: js.UndefOr[Boolean] = js.undefined
  }
  object FormikSharedConfig {
    
    inline def apply[Props](): FormikSharedConfig[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormikSharedConfig[Props]]
    }
    
    extension [Self <: FormikSharedConfig[?], Props](x: Self & FormikSharedConfig[Props]) {
      
      inline def setEnableReinitialize(value: Boolean): Self = StObject.set(x, "enableReinitialize", value.asInstanceOf[js.Any])
      
      inline def setEnableReinitializeUndefined: Self = StObject.set(x, "enableReinitialize", js.undefined)
      
      inline def setIsInitialValid(value: Boolean | (js.Function1[/* props */ Props, Boolean])): Self = StObject.set(x, "isInitialValid", value.asInstanceOf[js.Any])
      
      inline def setIsInitialValidFunction1(value: /* props */ Props => Boolean): Self = StObject.set(x, "isInitialValid", js.Any.fromFunction1(value))
      
      inline def setIsInitialValidUndefined: Self = StObject.set(x, "isInitialValid", js.undefined)
      
      inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
      
      inline def setValidateOnBlurUndefined: Self = StObject.set(x, "validateOnBlur", js.undefined)
      
      inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
      
      inline def setValidateOnMount(value: Boolean): Self = StObject.set(x, "validateOnMount", value.asInstanceOf[js.Any])
      
      inline def setValidateOnMountUndefined: Self = StObject.set(x, "validateOnMount", js.undefined)
    }
  }
  
  trait FormikState[Values] extends StObject {
    
    /** map of field names to specific error for that field */
    var errors: FormikErrors[Values]
    
    /** whether the form is currently submitting */
    var isSubmitting: Boolean
    
    /** whether the form is currently validating (prior to submission) */
    var isValidating: Boolean
    
    /** Top level status state, in case you need it */
    var status: js.UndefOr[js.Any] = js.undefined
    
    /** Number of times user tried to submit the form */
    var submitCount: Double
    
    /** map of field names to whether the field has been touched */
    var touched: FormikTouched[Values]
    
    /** Form values */
    var values: Values
  }
  object FormikState {
    
    inline def apply[Values](
      errors: FormikErrors[Values],
      isSubmitting: Boolean,
      isValidating: Boolean,
      submitCount: Double,
      touched: FormikTouched[Values],
      values: Values
    ): FormikState[Values] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], submitCount = submitCount.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormikState[Values]]
    }
    
    extension [Self <: FormikState[?], Values](x: Self & FormikState[Values]) {
      
      inline def setErrors(value: FormikErrors[Values]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setIsSubmitting(value: Boolean): Self = StObject.set(x, "isSubmitting", value.asInstanceOf[js.Any])
      
      inline def setIsValidating(value: Boolean): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubmitCount(value: Double): Self = StObject.set(x, "submitCount", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: FormikTouched[Values]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Values): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K][number]> * / object> : boolean : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typings.formik.formikStrings.FormikTouched & TopLevel[js.Any]
  
  type FormikValues = StringDictionary[js.Any]
  
  type GenericFieldHTMLAttributes = DetailedHTMLProps[
    InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement], 
    HTMLInputElement | HTMLSelectElement | HTMLTextAreaElement
  ]
  
  trait SharedRenderProps[T] extends StObject {
    
    /**
      * Children render function <Field name>{props => ...}</Field>)
      */
    var children: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.undefined
    
    /**
      * Field component to render. Can either be a string like 'select' or a component.
      */
    var component: js.UndefOr[String | (ComponentType[T | Unit])] = js.undefined
    
    /**
      * Render prop (works like React router's <Route render={props =>} />)
      */
    var render: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.undefined
  }
  object SharedRenderProps {
    
    inline def apply[T](): SharedRenderProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedRenderProps[T]]
    }
    
    extension [Self <: SharedRenderProps[?], T](x: Self & SharedRenderProps[T]) {
      
      inline def setChildren(value: /* props */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: String | (ComponentType[T | Unit])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setRender(value: /* props */ T => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
