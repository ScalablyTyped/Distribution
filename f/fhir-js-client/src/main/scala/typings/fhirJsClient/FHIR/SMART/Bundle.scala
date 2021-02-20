package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a FHIR bundle
  */
@js.native
trait Bundle extends StObject {
  
  /**
    * The actual FHIR bundle, which is a FHIR resource itself with resourceType: 'Bundle'
    */
  var bundle: Resource = js.native
}
object Bundle {
  
  @scala.inline
  def apply(bundle: Resource): Bundle = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundle(value: Resource): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
  }
}
