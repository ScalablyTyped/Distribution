package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptScope
  extends StObject
     with BackboneElement {
  
  var _artifact: js.UndefOr[Element] = js.undefined
  
  /**
    * The specific conformance artifact being tested. The canonical reference can be version-specific.
    */
  var artifact: String
  
  /**
    * The expectation of whether the test must pass for the system to be considered conformant with the artifact: required - all tests must pass, optional - all test are expected to pass but non-pass status may be allowed.
    */
  var conformance: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The phase of testing for this artifact: unit - development / implementation phase, integration - internal system to system phase, production - live system to system phase (Note, this may involve pii/phi data).
    */
  var phase: js.UndefOr[CodeableConcept] = js.undefined
}
object TestScriptScope {
  
  inline def apply(artifact: String): TestScriptScope = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptScope] (val x: Self) extends AnyVal {
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setConformance(value: CodeableConcept): Self = StObject.set(x, "conformance", value.asInstanceOf[js.Any])
    
    inline def setConformanceUndefined: Self = StObject.set(x, "conformance", js.undefined)
    
    inline def setPhase(value: CodeableConcept): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def set_artifact(value: Element): Self = StObject.set(x, "_artifact", value.asInstanceOf[js.Any])
    
    inline def set_artifactUndefined: Self = StObject.set(x, "_artifact", js.undefined)
  }
}
