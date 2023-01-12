package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptVariable
  extends StObject
     with BackboneElement {
  
  var _headerField: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  /**
    * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
    */
  var headerField: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptive name for this variable.
    */
  var name: String
  
  /**
    * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
    */
  var sourceId: js.UndefOr[String] = js.undefined
}
object TestScriptVariable {
  
  inline def apply(name: String): TestScriptVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptVariable] (val x: Self) extends AnyVal {
    
    inline def setHeaderField(value: String): Self = StObject.set(x, "headerField", value.asInstanceOf[js.Any])
    
    inline def setHeaderFieldUndefined: Self = StObject.set(x, "headerField", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def set_headerField(value: Element): Self = StObject.set(x, "_headerField", value.asInstanceOf[js.Any])
    
    inline def set_headerFieldUndefined: Self = StObject.set(x, "_headerField", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
  }
}
