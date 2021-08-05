package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract server representing a destination or receiver in a message exchange
  */
trait TestScriptDestination
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'index'.
    */
  var _index: js.UndefOr[Element] = js.undefined
  
  /**
    * The index of the abstract destination server starting at 1
    */
  var index: integer
  
  /**
    * FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver | FHIR-SDC-FormProcessor
    */
  var profile: Coding
}
object TestScriptDestination {
  
  inline def apply(index: integer, profile: Coding): TestScriptDestination = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptDestination]
  }
  
  extension [Self <: TestScriptDestination](x: Self) {
    
    inline def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Coding): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def set_index(value: Element): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
  }
}
