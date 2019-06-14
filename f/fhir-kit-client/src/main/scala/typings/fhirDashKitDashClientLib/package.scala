package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fhirDashKitDashClientLib {
  type CustomResourceType = stdLib.Exclude[
    ResourceType, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KnownResourceType */ js.Any
  ]
  type ResourceType = java.lang.String
}
