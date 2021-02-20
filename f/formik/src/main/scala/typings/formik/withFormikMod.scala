package typings.formik

import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikProps
import typings.formik.typesMod.FormikSharedConfig
import typings.formik.typesMod.FormikState
import typings.formik.typesMod.FormikTouched
import typings.formik.typesMod.FormikValues
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SetStateAction
import typings.react.mod.StatelessComponent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFormikMod {
  
  @JSImport("formik/dist/withFormik", "withFormik")
  @js.native
  def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ComponentType[TOwnProps]]
  
  type CompositeComponent[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
  
  /* Inlined {  props :P} & formik.formik/dist/types.FormikHelpers<V> */
  @js.native
  trait FormikBag[P, V] extends StObject {
    
    var props: P = js.native
    
    /** Reset form */
    def resetForm(): Unit = js.native
    def resetForm(nextState: Partial[FormikState[V]]): Unit = js.native
    
    /** Manually set errors object */
    def setErrors(errors: FormikErrors[V]): Unit = js.native
    
    /** Set error message of a form field directly */
    def setFieldError(field: String, message: String): Unit = js.native
    
    /** Set whether field has been touched directly */
    def setFieldTouched(field: String): Unit = js.native
    def setFieldTouched(field: String, isTouched: js.UndefOr[scala.Nothing], shouldValidate: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
    def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
    
    /** Set value of form field directly */
    def setFieldValue(field: String, value: js.Any): Unit = js.native
    def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
    
    def setFormikState(f: js.Function1[/* prevState */ FormikState[V], FormikState[V]]): Unit = js.native
    def setFormikState(f: js.Function1[/* prevState */ FormikState[V], FormikState[V]], cb: js.Function0[Unit]): Unit = js.native
    /** Set Formik state, careful! */
    def setFormikState(f: FormikState[V]): Unit = js.native
    def setFormikState(f: FormikState[V], cb: js.Function0[Unit]): Unit = js.native
    
    /** Manually set top level status. */
    def setStatus(): Unit = js.native
    def setStatus(status: js.Any): Unit = js.native
    
    /** Manually set isSubmitting */
    def setSubmitting(isSubmitting: Boolean): Unit = js.native
    
    /** Manually set touched object */
    def setTouched(touched: FormikTouched[V]): Unit = js.native
    def setTouched(touched: FormikTouched[V], shouldValidate: Boolean): Unit = js.native
    
    /** Manually set values object  */
    def setValues(values: SetStateAction[V]): Unit = js.native
    def setValues(values: SetStateAction[V], shouldValidate: Boolean): Unit = js.native
    
    /** Submit the form imperatively */
    def submitForm(): js.Promise[Unit] = js.native
    
    /** Validate field value */
    def validateField(field: String): Unit = js.native
    
    /** Validate form values */
    def validateForm(): js.Promise[FormikErrors[V]] = js.native
    def validateForm(values: js.Any): js.Promise[FormikErrors[V]] = js.native
  }
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  
  type InjectedFormikProps[Props, Values] = Props with FormikProps[Values]
  
  @js.native
  trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload] extends FormikSharedConfig[Props] {
    
    /**
      * Set the display name of the component. Useful for React DevTools.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * Submission handler
      */
    def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit = js.native
    
    /**
      * Map props to the form errors state
      */
    var mapPropsToErrors: js.UndefOr[js.Function1[/* props */ Props, FormikErrors[Values]]] = js.native
    
    /**
      * Map props to the form status
      */
    var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    
    /**
      * Map props to the form touched state
      */
    var mapPropsToTouched: js.UndefOr[js.Function1[/* props */ Props, FormikTouched[Values]]] = js.native
    
    /**
      * Map props to the form values
      */
    var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.native
    
    /**
      * @deprecated in 0.9.0 (but needed to break TS types)
      */
    var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.native
    
    /**
      * Validation function. Must return an error object or promise that
      * throws an error object where that object keys map to corresponding value.
      */
    var validate: js.UndefOr[
        js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[_]]
      ] = js.native
    
    /**
      * A Yup Schema or a function that returns a Yup schema
      */
    var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.native
  }
  object WithFormikConfig {
    
    @scala.inline
    def apply[Props, Values /* <: FormikValues */, DeprecatedPayload](handleSubmit: (Values, FormikBag[Props, Values]) => Unit): WithFormikConfig[Props, Values, DeprecatedPayload] = {
      val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
      __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
    }
    
    @scala.inline
    implicit class WithFormikConfigMutableBuilder[Self <: WithFormikConfig[_, _, _], Props, Values /* <: FormikValues */, DeprecatedPayload] (val x: Self with (WithFormikConfig[Props, Values, DeprecatedPayload])) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setHandleSubmit(value: (Values, FormikBag[Props, Values]) => Unit): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMapPropsToErrors(value: /* props */ Props => FormikErrors[Values]): Self = StObject.set(x, "mapPropsToErrors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapPropsToErrorsUndefined: Self = StObject.set(x, "mapPropsToErrors", js.undefined)
      
      @scala.inline
      def setMapPropsToStatus(value: /* props */ Props => _): Self = StObject.set(x, "mapPropsToStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapPropsToStatusUndefined: Self = StObject.set(x, "mapPropsToStatus", js.undefined)
      
      @scala.inline
      def setMapPropsToTouched(value: /* props */ Props => FormikTouched[Values]): Self = StObject.set(x, "mapPropsToTouched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapPropsToTouchedUndefined: Self = StObject.set(x, "mapPropsToTouched", js.undefined)
      
      @scala.inline
      def setMapPropsToValues(value: /* props */ Props => Values): Self = StObject.set(x, "mapPropsToValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapPropsToValuesUndefined: Self = StObject.set(x, "mapPropsToValues", js.undefined)
      
      @scala.inline
      def setMapValuesToPayload(value: /* values */ Values => DeprecatedPayload): Self = StObject.set(x, "mapValuesToPayload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapValuesToPayloadUndefined: Self = StObject.set(x, "mapValuesToPayload", js.undefined)
      
      @scala.inline
      def setValidate(value: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[_]): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidationSchema(value: js.Any | (js.Function1[/* props */ Props, _])): Self = StObject.set(x, "validationSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationSchemaFunction1(value: /* props */ Props => _): Self = StObject.set(x, "validationSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidationSchemaUndefined: Self = StObject.set(x, "validationSchema", js.undefined)
    }
  }
}
