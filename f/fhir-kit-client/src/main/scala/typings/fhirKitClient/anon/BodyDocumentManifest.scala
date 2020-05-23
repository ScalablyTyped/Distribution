package typings.fhirKitClient.anon

import typings.fhir.fhir.DocumentManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyDocumentManifest extends js.Object {
  var body: DocumentManifest
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DocumentManifest
}

object BodyDocumentManifest {
  @scala.inline
  def apply(
    body: DocumentManifest,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DocumentManifest,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyDocumentManifest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDocumentManifest]
  }
}

