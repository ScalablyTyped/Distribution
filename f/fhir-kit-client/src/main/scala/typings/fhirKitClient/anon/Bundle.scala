package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[T /* <: String */] extends js.Object {
  var bundle: typings.fhir.fhir.Bundle with Type[T]
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
}

object Bundle {
  @scala.inline
  def apply[T](bundle: typings.fhir.fhir.Bundle with Type[T], options: typings.request.mod.Options = null): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
}

