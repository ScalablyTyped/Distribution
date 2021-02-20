package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract server representing a destination or receiver in a message exchange
  */
@js.native
trait TestScriptDestination extends BackboneElement {
  
  /**
    * Contains extended information for property 'index'.
    */
  var _index: js.UndefOr[Element] = js.native
  
  /**
    * The index of the abstract destination server starting at 1
    */
  var index: integer = js.native
  
  /**
    * FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver | FHIR-SDC-FormProcessor
    */
  var profile: Coding = js.native
}
object TestScriptDestination {
  
  @scala.inline
  def apply(index: integer, profile: Coding): TestScriptDestination = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptDestination]
  }
  
  @scala.inline
  implicit class TestScriptDestinationMutableBuilder[Self <: TestScriptDestination] (val x: Self) extends AnyVal {
    
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
