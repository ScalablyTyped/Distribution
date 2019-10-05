package typings.formik

import typings.formik.formikStrings.onReset
import typings.formik.formikStrings.onSubmit
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FormHTMLAttributes
import typings.std.Exclude
import typings.std.HTMLFormElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Form", JSImport.Namespace)
@js.native
object distFormMod extends js.Object {
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
  
  val Form: ComponentType[
    Pick[
      FormHTMLAttributes[HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.native
  type FormikFormProps = Pick[FormHTMLAttributes[HTMLFormElement], Exclude[String, onReset | onSubmit]]
}

