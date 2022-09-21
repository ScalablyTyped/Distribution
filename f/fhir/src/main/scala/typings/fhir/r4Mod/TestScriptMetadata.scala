package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptMetadata
  extends StObject
     with BackboneElement {
  
  /**
    * When the metadata capabilities section is defined at TestScript.metadata or at TestScript.setup.metadata, and the server's conformance statement does not contain the elements defined in the minimal conformance statement, then all the tests in the TestScript are skipped.  When the metadata capabilities section is defined at TestScript.test.metadata and the server's conformance statement does not contain the elements defined in the minimal conformance statement, then only that test is skipped.  The "metadata.capabilities.required" and "metadata.capabilities.validated" elements only indicate whether the capabilities are the primary focus of the test script or not.  They do not impact the skipping logic.  Capabilities whose "metadata.capabilities.validated" flag is true are the primary focus of the test script.
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
  
  extension [Self <: TestScriptMetadata](x: Self) {
    
    inline def setCapability(value: js.Array[TestScriptMetadataCapability]): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    inline def setCapabilityVarargs(value: TestScriptMetadataCapability*): Self = StObject.set(x, "capability", js.Array(value*))
    
    inline def setLink(value: js.Array[TestScriptMetadataLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: TestScriptMetadataLink*): Self = StObject.set(x, "link", js.Array(value*))
  }
}
