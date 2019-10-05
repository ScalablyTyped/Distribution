package typings.formik.distWithFormikMod

import typings.formik.distTypesMod.FormikProps
import typings.formik.distTypesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/withFormik", "withFormik")
@js.native
object withFormik extends js.Object {
  def apply[OuterProps, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
}

