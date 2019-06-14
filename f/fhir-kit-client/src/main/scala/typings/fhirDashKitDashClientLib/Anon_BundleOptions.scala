package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BundleOptions[T /* <: java.lang.String */] extends js.Object {
  var bundle: fhirLib.fhirNs.Bundle with Anon_Type[T]
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
}

object Anon_BundleOptions {
  @scala.inline
  def apply[T /* <: java.lang.String */](bundle: fhirLib.fhirNs.Bundle with Anon_Type[T], options: requestLib.requestMod.Options = null): Anon_BundleOptions[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BundleOptions[T]]
  }
}

