package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Required capability that is assumed to function correctly on the FHIR server being tested
  */
trait TestScriptMetadata
  extends StObject
     with BackboneElement {
  
  /**
    * Capabilities  that are assumed to function correctly on the FHIR server being tested
    */
  var capability: js.Array[TestScriptMetadataCapability]
  
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.undefined
}
object TestScriptMetadata {
  
  @scala.inline
  def apply(capability: js.Array[TestScriptMetadataCapability]): TestScriptMetadata = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadata]
  }
  
  @scala.inline
  implicit class TestScriptMetadataMutableBuilder[Self <: TestScriptMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapability(value: js.Array[TestScriptMetadataCapability]): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityVarargs(value: TestScriptMetadataCapability*): Self = StObject.set(x, "capability", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[TestScriptMetadataLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: TestScriptMetadataLink*): Self = StObject.set(x, "link", js.Array(value :_*))
  }
}
