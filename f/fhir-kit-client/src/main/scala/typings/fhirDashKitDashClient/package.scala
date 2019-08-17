package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fhirDashKitDashClient {
  import typings.std.Exclude

  type CustomResourceType = Exclude[
    ResourceType, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KnownResourceType */ js.Any
  ]
  type ResourceType = String
}
