package typings.fhirDashKitDashClient.fhirDashKitDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.fhir.fhir.Element
import typings.fhir.fhir.Meta
import typings.fhir.fhir.ResourceBase
import typings.fhir.fhir.code
import typings.fhir.fhir.id
import typings.fhir.fhir.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResource
  extends ResourceBase
     with /* key */ StringDictionary[js.Any]

object CustomResource {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    resourceType: code = null
  ): CustomResource = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[CustomResource]
  }
}

