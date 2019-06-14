package typings
package fhirDashKitDashClientLib.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResource
  extends fhirLib.fhirNs.ResourceBase
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object CustomResource {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _id: fhirLib.fhirNs.Element = null,
    _implicitRules: fhirLib.fhirNs.Element = null,
    _language: fhirLib.fhirNs.Element = null,
    _resourceType: fhirLib.fhirNs.Element = null,
    id: fhirLib.fhirNs.id = null,
    implicitRules: fhirLib.fhirNs.uri = null,
    language: fhirLib.fhirNs.code = null,
    meta: fhirLib.fhirNs.Meta = null,
    resourceType: fhirLib.fhirNs.code = null
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

