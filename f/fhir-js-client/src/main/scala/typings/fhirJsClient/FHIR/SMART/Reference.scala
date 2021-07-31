package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference within a resource
  */
trait Reference extends StObject {
  
  var reference: String
}
object Reference {
  
  @scala.inline
  def apply(reference: String): Reference = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
