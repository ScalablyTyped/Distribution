package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptFixture
  extends StObject
     with BackboneElement {
  
  var _autocreate: js.UndefOr[Element] = js.undefined
  
  var _autodelete: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
    */
  var autocreate: Boolean
  
  /**
    * Whether or not to implicitly delete the fixture during teardown. If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
    */
  var autodelete: Boolean
  
  /**
    * See http://build.fhir.org/resourcelist.html for complete list of resource types.
    */
  var resource: js.UndefOr[Reference] = js.undefined
}
object TestScriptFixture {
  
  inline def apply(autocreate: Boolean, autodelete: Boolean): TestScriptFixture = {
    val __obj = js.Dynamic.literal(autocreate = autocreate.asInstanceOf[js.Any], autodelete = autodelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptFixture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptFixture] (val x: Self) extends AnyVal {
    
    inline def setAutocreate(value: Boolean): Self = StObject.set(x, "autocreate", value.asInstanceOf[js.Any])
    
    inline def setAutodelete(value: Boolean): Self = StObject.set(x, "autodelete", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def set_autocreate(value: Element): Self = StObject.set(x, "_autocreate", value.asInstanceOf[js.Any])
    
    inline def set_autocreateUndefined: Self = StObject.set(x, "_autocreate", js.undefined)
    
    inline def set_autodelete(value: Element): Self = StObject.set(x, "_autodelete", value.asInstanceOf[js.Any])
    
    inline def set_autodeleteUndefined: Self = StObject.set(x, "_autodelete", js.undefined)
  }
}
