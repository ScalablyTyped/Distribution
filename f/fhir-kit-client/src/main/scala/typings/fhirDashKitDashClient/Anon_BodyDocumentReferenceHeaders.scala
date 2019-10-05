package typings.fhirDashKitDashClient

import typings.fhir.fhir.DocumentReference
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDocumentReferenceHeaders extends js.Object {
  var body: DocumentReference
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentReference
}

object Anon_BodyDocumentReferenceHeaders {
  @scala.inline
  def apply(
    body: DocumentReference,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DocumentReference,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDocumentReferenceHeaders = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDocumentReferenceHeaders]
  }
}

