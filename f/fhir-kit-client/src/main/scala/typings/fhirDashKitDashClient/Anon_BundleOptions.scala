package typings.fhirDashKitDashClient

import typings.fhir.fhir.Bundle
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BundleOptions[T /* <: String */] extends js.Object {
  var bundle: Bundle with Anon_Type[T]
  var options: js.UndefOr[Options] = js.undefined
}

object Anon_BundleOptions {
  @scala.inline
  def apply[T /* <: String */](bundle: Bundle with Anon_Type[T], options: Options = null): Anon_BundleOptions[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BundleOptions[T]]
  }
}

