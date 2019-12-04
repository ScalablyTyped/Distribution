package typings.fhirDashKitDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fhirDashKitDashClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.fhir.fhir.Resource
  import typings.std.Exclude

  type CustomResourceType = Exclude[ResourceType, KnownResourceType]
  type FhirResource = CustomResource | Resource
  type ResourceType = String
  type SearchParams = StringDictionary[String | Double | Boolean]
}
