package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Required capability that is assumed to function correctly on the FHIR server being tested
  */
@js.native
trait TestScriptMetadata extends BackboneElement {
  
  /**
    * Capabilities  that are assumed to function correctly on the FHIR server being tested
    */
  var capability: js.Array[TestScriptMetadataCapability] = js.native
  
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.native
}
object TestScriptMetadata {
  
  @scala.inline
  def apply(capability: js.Array[TestScriptMetadataCapability]): TestScriptMetadata = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadata]
  }
  
  @scala.inline
  implicit class TestScriptMetadataOps[Self <: TestScriptMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapabilityVarargs(value: TestScriptMetadataCapability*): Self = this.set("capability", js.Array(value :_*))
    
    @scala.inline
    def setCapability(value: js.Array[TestScriptMetadataCapability]): Self = this.set("capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkVarargs(value: TestScriptMetadataLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[TestScriptMetadataLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
