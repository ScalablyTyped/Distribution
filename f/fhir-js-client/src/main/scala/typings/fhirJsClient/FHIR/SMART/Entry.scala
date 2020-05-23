package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR entry
  */
trait Entry
  extends /**
  * Making this interface extendable since this is not a complete type definition of FHIR Resource
  */
/* propName */ StringDictionary[js.Any] {
  /**
    * FHIR Resource
    */
  var resource: Resource
  /**
    * FHIR Resource type name
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Version Stamp of resource
    */
  var versionId: js.UndefOr[String] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    resource: Resource,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `type`: String = null,
    versionId: String = null
  ): Entry = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

