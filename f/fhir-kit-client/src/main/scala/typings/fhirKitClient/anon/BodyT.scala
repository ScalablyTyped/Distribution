package typings.fhirKitClient.anon

import typings.fhirKitClient.mod.CustomResource
import typings.fhirKitClient.mod.CustomResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyT[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: CustomResourceType
}

object BodyT {
  @scala.inline
  def apply[/* <: typings.fhirKitClient.mod.CustomResource */ T](
    body: T,
    resourceType: CustomResourceType,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyT[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyT[T]]
  }
}

