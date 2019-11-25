package typings.fhirDashKitDashClient

import typings.fhir.fhir.DocumentReference
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDocumentReference extends js.Object {
  var body: DocumentReference
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentReference
}

object Anon_BodyDocumentReference {
  @scala.inline
  def apply(
    body: DocumentReference,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentReference,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDocumentReference = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDocumentReference]
  }
}

