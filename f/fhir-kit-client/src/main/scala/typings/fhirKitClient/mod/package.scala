package typings.fhirKitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomResourceType = typings.std.Exclude[
    typings.fhirKitClient.mod.ResourceType, 
    typings.fhirKitClient.mod.KnownResourceType
  ]
  type FhirResource = typings.fhirKitClient.mod.CustomResource | typings.fhir.fhir.Resource
  type ResourceType = java.lang.String
  type SearchParams = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])
  ]
}
