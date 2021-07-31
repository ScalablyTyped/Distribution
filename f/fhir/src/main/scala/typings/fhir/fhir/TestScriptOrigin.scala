package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract server representing a client or sender in a message exchange
  */
trait TestScriptOrigin
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'index'.
    */
  var _index: js.UndefOr[Element] = js.undefined
  
  /**
    * The index of the abstract origin server starting at 1
    */
  var index: integer
  
  /**
    * FHIR-Client | FHIR-SDC-FormFiller
    */
  var profile: Coding
}
object TestScriptOrigin {
  
  @scala.inline
  def apply(index: integer, profile: Coding): TestScriptOrigin = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptOrigin]
  }
  
  @scala.inline
  implicit class TestScriptOriginMutableBuilder[Self <: TestScriptOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: Coding): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: Element): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
  }
}
