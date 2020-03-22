package typings.formsyReact

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Requireable[Boolean]
  var mapping: Requireable[js.Function1[/* repeated */ _, _]]
  var onChange: Requireable[js.Function1[/* repeated */ _, _]]
  var onInvalid: Requireable[js.Function1[/* repeated */ _, _]]
  var onInvalidSubmit: Requireable[js.Function1[/* repeated */ _, _]]
  var onReset: Requireable[js.Function1[/* repeated */ _, _]]
  var onSubmit: Requireable[js.Function1[/* repeated */ _, _]]
  var onValid: Requireable[js.Function1[/* repeated */ _, _]]
  var onValidSubmit: Requireable[js.Function1[/* repeated */ _, _]]
  var preventDefaultSubmit: Requireable[Boolean]
  var preventExternalInvalidation: Requireable[Boolean]
  var validationErrors: Requireable[js.Object]
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: Requireable[Boolean],
    mapping: Requireable[js.Function1[/* repeated */ _, _]],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    onInvalid: Requireable[js.Function1[/* repeated */ _, _]],
    onInvalidSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    onReset: Requireable[js.Function1[/* repeated */ _, _]],
    onSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    onValid: Requireable[js.Function1[/* repeated */ _, _]],
    onValidSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    preventDefaultSubmit: Requireable[Boolean],
    preventExternalInvalidation: Requireable[Boolean],
    validationErrors: Requireable[js.Object]
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onInvalidSubmit = onInvalidSubmit.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onValid = onValid.asInstanceOf[js.Any], onValidSubmit = onValidSubmit.asInstanceOf[js.Any], preventDefaultSubmit = preventDefaultSubmit.asInstanceOf[js.Any], preventExternalInvalidation = preventExternalInvalidation.asInstanceOf[js.Any], validationErrors = validationErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabled]
  }
}

