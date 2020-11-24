package typings.formik.withFormikMod

import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikSharedConfig
import typings.formik.typesMod.FormikTouched
import typings.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class WithFormikConfigOps[Self <: WithFormikConfig[_, _, _], Props, Values /* <: FormikValues */, DeprecatedPayload] (val x: Self with (WithFormikConfig[Props, Values, DeprecatedPayload])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandleSubmit(value: (Values, FormikBag[Props, Values]) => Unit): Self = this.set("handleSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMapPropsToErrors(value: /* props */ Props => FormikErrors[Values]): Self = this.set("mapPropsToErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapPropsToErrors: Self = this.set("mapPropsToErrors", js.undefined)
    
    @scala.inline
    def setMapPropsToStatus(value: /* props */ Props => _): Self = this.set("mapPropsToStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapPropsToStatus: Self = this.set("mapPropsToStatus", js.undefined)
    
    @scala.inline
    def setMapPropsToTouched(value: /* props */ Props => FormikTouched[Values]): Self = this.set("mapPropsToTouched", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapPropsToTouched: Self = this.set("mapPropsToTouched", js.undefined)
    
    @scala.inline
    def setMapPropsToValues(value: /* props */ Props => Values): Self = this.set("mapPropsToValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapPropsToValues: Self = this.set("mapPropsToValues", js.undefined)
    
    @scala.inline
    def setMapValuesToPayload(value: /* values */ Values => DeprecatedPayload): Self = this.set("mapValuesToPayload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapValuesToPayload: Self = this.set("mapValuesToPayload", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[_]): Self = this.set("validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidationSchemaFunction1(value: /* props */ Props => _): Self = this.set("validationSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidationSchema(value: js.Any | (js.Function1[/* props */ Props, _])): Self = this.set("validationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationSchema: Self = this.set("validationSchema", js.undefined)
  }
}
