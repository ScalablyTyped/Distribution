package typings.formik

import typings.formik.distTypesMod.FormikErrors
import typings.formik.distTypesMod.FormikHelpers
import typings.formik.distTypesMod.FormikProps
import typings.formik.distTypesMod.FormikSharedConfig
import typings.formik.distTypesMod.FormikTouched
import typings.formik.distTypesMod.FormikValues
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWithFormikMod {
  
  @JSImport("formik/dist/withFormik", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](param0: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFormik")(param0.asInstanceOf[js.Any]).asInstanceOf[ComponentDecorator[OuterProps, OuterProps & FormikProps[Values]]]
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ComponentType[TOwnProps]]
  
  type CompositeComponent[P] = (ComponentClass[P, ComponentState]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any)
  
  @js.native
  trait FormikBag[P, V]
    extends StObject
       with FormikHelpers[V] {
    
    var props: P = js.native
  }
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  
  type InjectedFormikProps[Props, Values] = Props & FormikProps[Values]
  
  trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload]
    extends StObject
       with FormikSharedConfig[Props] {
    
    /**
      * Set the display name of the component. Useful for React DevTools.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Submission handler
      */
    def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit
    
    /**
      * Map props to the form errors state
      */
    var mapPropsToErrors: js.UndefOr[js.Function1[/* props */ Props, FormikErrors[Values]]] = js.undefined
    
    /**
      * Map props to the form status
      */
    var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, Any]] = js.undefined
    
    /**
      * Map props to the form touched state
      */
    var mapPropsToTouched: js.UndefOr[js.Function1[/* props */ Props, FormikTouched[Values]]] = js.undefined
    
    /**
      * Map props to the form values
      */
    var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.undefined
    
    /**
      * @deprecated in 0.9.0 (but needed to break TS types)
      */
    var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.undefined
    
    /**
      * Validation function. Must return an error object or promise that
      * throws an error object where that object keys map to corresponding value.
      */
    var validate: js.UndefOr[
        js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[Any]]
      ] = js.undefined
    
    /**
      * A Yup Schema or a function that returns a Yup schema
      */
    var validationSchema: js.UndefOr[Any | (js.Function1[/* props */ Props, Any])] = js.undefined
  }
  object WithFormikConfig {
    
    inline def apply[Props, Values /* <: FormikValues */, DeprecatedPayload](handleSubmit: (Values, FormikBag[Props, Values]) => Unit): WithFormikConfig[Props, Values, DeprecatedPayload] = {
      val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
      __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
    }
    
    extension [Self <: WithFormikConfig[?, ?, ?], Props, Values /* <: FormikValues */, DeprecatedPayload](x: Self & (WithFormikConfig[Props, Values, DeprecatedPayload])) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setHandleSubmit(value: (Values, FormikBag[Props, Values]) => Unit): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction2(value))
      
      inline def setMapPropsToErrors(value: /* props */ Props => FormikErrors[Values]): Self = StObject.set(x, "mapPropsToErrors", js.Any.fromFunction1(value))
      
      inline def setMapPropsToErrorsUndefined: Self = StObject.set(x, "mapPropsToErrors", js.undefined)
      
      inline def setMapPropsToStatus(value: /* props */ Props => Any): Self = StObject.set(x, "mapPropsToStatus", js.Any.fromFunction1(value))
      
      inline def setMapPropsToStatusUndefined: Self = StObject.set(x, "mapPropsToStatus", js.undefined)
      
      inline def setMapPropsToTouched(value: /* props */ Props => FormikTouched[Values]): Self = StObject.set(x, "mapPropsToTouched", js.Any.fromFunction1(value))
      
      inline def setMapPropsToTouchedUndefined: Self = StObject.set(x, "mapPropsToTouched", js.undefined)
      
      inline def setMapPropsToValues(value: /* props */ Props => Values): Self = StObject.set(x, "mapPropsToValues", js.Any.fromFunction1(value))
      
      inline def setMapPropsToValuesUndefined: Self = StObject.set(x, "mapPropsToValues", js.undefined)
      
      inline def setMapValuesToPayload(value: /* values */ Values => DeprecatedPayload): Self = StObject.set(x, "mapValuesToPayload", js.Any.fromFunction1(value))
      
      inline def setMapValuesToPayloadUndefined: Self = StObject.set(x, "mapValuesToPayload", js.undefined)
      
      inline def setValidate(value: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[Any]): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidationSchema(value: Any | (js.Function1[/* props */ Props, Any])): Self = StObject.set(x, "validationSchema", value.asInstanceOf[js.Any])
      
      inline def setValidationSchemaFunction1(value: /* props */ Props => Any): Self = StObject.set(x, "validationSchema", js.Any.fromFunction1(value))
      
      inline def setValidationSchemaUndefined: Self = StObject.set(x, "validationSchema", js.undefined)
    }
  }
}
