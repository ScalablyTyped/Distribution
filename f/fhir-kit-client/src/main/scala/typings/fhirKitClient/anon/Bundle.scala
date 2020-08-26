package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle[T /* <: String */] extends js.Object {
  var bundle: typings.fhir.fhir.Bundle with Type[T] = js.native
  var options: js.UndefOr[typings.request.mod.Options] = js.native
}

object Bundle {
  @scala.inline
  def apply[/* <: java.lang.String */ T](bundle: typings.fhir.fhir.Bundle with Type[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle[_], /* <: java.lang.String */ T] (val x: Self with Bundle[T]) extends AnyVal {
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
    def setBundle(value: typings.fhir.fhir.Bundle with Type[T]): Self = this.set("bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

