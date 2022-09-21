package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptDestination
  extends StObject
     with BackboneElement {
  
  /**
    * A given destination index (e.g. 1) can appear only once in the list (e.g. Destination 1 cannot be specified twice ... once as Form-Manager and again as Form-Processor within the same script as that could get confusing during test configuration).
    * Different destination indices could play the same actor in the same test script (e.g. You could have two different test systems acting as Form-Manager).
    * The destination indices provided elsewhere in the test script must be one of these destination indices.
    */
  var index: Double
  
  /**
    * Must be a "receiver"/"server" profile.
    */
  var profile: Coding
}
object TestScriptDestination {
  
  inline def apply(index: Double, profile: Coding): TestScriptDestination = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptDestination]
  }
  
  extension [Self <: TestScriptDestination](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Coding): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
