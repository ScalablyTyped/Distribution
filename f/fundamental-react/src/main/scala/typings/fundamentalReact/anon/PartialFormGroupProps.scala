package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
trait PartialFormGroupProps extends js.Object {
  var disableStyles: js.UndefOr[Boolean] = js.undefined
}

object PartialFormGroupProps {
  @scala.inline
  def apply(disableStyles: js.UndefOr[Boolean] = js.undefined): PartialFormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFormGroupProps]
  }
}

