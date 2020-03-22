package typings.fhirKitClient

import typings.fhir.fhir.Bundle
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBundle[T /* <: String */] extends js.Object {
  var bundle: Bundle with AnonType[T]
  var options: js.UndefOr[Options] = js.undefined
}

object AnonBundle {
  @scala.inline
  def apply[T /* <: String */](bundle: Bundle with AnonType[T], options: Options = null): AnonBundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBundle[T]]
  }
}

