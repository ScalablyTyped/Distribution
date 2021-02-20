package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fixture in the test script - by reference (uri)
  */
@js.native
trait TestScriptFixture extends BackboneElement {
  
  /**
    * Contains extended information for property 'autocreate'.
    */
  var _autocreate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'autodelete'.
    */
  var _autodelete: js.UndefOr[Element] = js.native
  
  /**
    * Whether or not to implicitly create the fixture during setup
    */
  var autocreate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to implicitly delete the fixture during teardown
    */
  var autodelete: js.UndefOr[Boolean] = js.native
  
  /**
    * Reference of the resource
    */
  var resource: js.UndefOr[Reference] = js.native
}
object TestScriptFixture {
  
  @scala.inline
  def apply(): TestScriptFixture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptFixture]
  }
  
  @scala.inline
  implicit class TestScriptFixtureMutableBuilder[Self <: TestScriptFixture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocreate(value: Boolean): Self = StObject.set(x, "autocreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocreateUndefined: Self = StObject.set(x, "autocreate", js.undefined)
    
    @scala.inline
    def setAutodelete(value: Boolean): Self = StObject.set(x, "autodelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutodeleteUndefined: Self = StObject.set(x, "autodelete", js.undefined)
    
    @scala.inline
    def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def set_autocreate(value: Element): Self = StObject.set(x, "_autocreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_autocreateUndefined: Self = StObject.set(x, "_autocreate", js.undefined)
    
    @scala.inline
    def set_autodelete(value: Element): Self = StObject.set(x, "_autodelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_autodeleteUndefined: Self = StObject.set(x, "_autodelete", js.undefined)
  }
}
