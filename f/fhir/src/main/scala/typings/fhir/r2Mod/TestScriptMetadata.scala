package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptMetadata
  extends StObject
     with BackboneElement {
  
  /**
    * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
    */
  var capability: js.Array[TestScriptMetadataCapability]
  
  /**
    * A link to the FHIR specification that this test is covering.
    */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.undefined
}
object TestScriptMetadata {
  
  inline def apply(capability: js.Array[TestScriptMetadataCapability]): TestScriptMetadata = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptMetadata] (val x: Self) extends AnyVal {
    
    inline def setCapability(value: js.Array[TestScriptMetadataCapability]): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    inline def setCapabilityVarargs(value: TestScriptMetadataCapability*): Self = StObject.set(x, "capability", js.Array(value*))
    
    inline def setLink(value: js.Array[TestScriptMetadataLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: TestScriptMetadataLink*): Self = StObject.set(x, "link", js.Array(value*))
  }
}
