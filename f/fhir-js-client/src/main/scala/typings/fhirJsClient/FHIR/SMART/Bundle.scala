package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR bundle
  */
@js.native
trait Bundle extends js.Object {
  /**
    * The actual FHIR bundle, which is a FHIR resource itself with resourceType: 'Bundle'
    */
  var bundle: Resource = js.native
}

object Bundle {
  @scala.inline
  def apply(bundle: Resource): Bundle = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundle(value: Resource): Self = this.set("bundle", value.asInstanceOf[js.Any])
  }
  
}

