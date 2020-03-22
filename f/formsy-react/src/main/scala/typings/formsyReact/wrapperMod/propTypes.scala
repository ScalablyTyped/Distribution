package typings.formsyReact.wrapperMod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react/dist/Wrapper", "propTypes")
@js.native
object propTypes extends js.Object {
  var innerRef: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var name: Validator[String] = js.native
  var required: Requireable[String | Boolean | js.Object] = js.native
  var validations: Requireable[String | js.Object] = js.native
  var value: Requireable[_] = js.native
}

