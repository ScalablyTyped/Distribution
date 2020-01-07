package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The view model of a single quantity, e.g. &quot;800 MiB&quot;. Corresponds
  * to
  * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/generated.proto
  */
@js.native
trait Schema$Quantity extends js.Object {
  /**
    * Stringified version of the quantity, e.g., &quot;800 MiB&quot;.
    */
  var string: js.UndefOr[String] = js.native
}

object Schema$Quantity {
  @scala.inline
  def apply(string: String = null): Schema$Quantity = {
    val __obj = js.Dynamic.literal()
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Quantity]
  }
}

