package typings.formik

import org.scalablytyped.runtime.TopLevel
import typings.formik.formikStrings.onReset
import typings.formik.formikStrings.onSubmit
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FormHTMLAttributes
import typings.std.Exclude
import typings.std.HTMLFormElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
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
  object Form
    extends TopLevel[
          ComponentType[
            Pick[
              FormHTMLAttributes[HTMLFormElement], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
            ]
          ]
        ]
  
  type FormikFormProps = Pick[FormHTMLAttributes[HTMLFormElement], Exclude[String, onReset | onSubmit]]
}

