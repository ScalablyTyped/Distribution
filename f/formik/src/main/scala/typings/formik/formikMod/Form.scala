package typings.formik.formikMod

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FormHTMLAttributes
import typings.std.HTMLFormElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", "Form")
@js.native
class Form protected ()
  extends Component[
      Pick[
        FormHTMLAttributes[HTMLFormElement], 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
      ], 
      ComponentState, 
      js.Any
    ] {
  def this(props: Pick[
        FormHTMLAttributes[HTMLFormElement], 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
      ]) = this()
  def this(
    props: Pick[
        FormHTMLAttributes[HTMLFormElement], 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
      ],
    context: js.Any
  ) = this()
}

