package typings.fhir.r2Mod

import typings.fhir.fhirStrings.additional
import typings.fhir.fhirStrings.empty
import typings.fhir.fhirStrings.extensions
import typings.fhir.fhirStrings.generated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Narrative
  extends StObject
     with Element {
  
  var _div: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual narrative content, a stripped down version of XHTML.
    */
  var div: String
  
  /**
    * The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
    */
  var status: generated | extensions | additional | empty
}
object Narrative {
  
  inline def apply(div: String, status: generated | extensions | additional | empty): Narrative = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Narrative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Narrative] (val x: Self) extends AnyVal {
    
    inline def setDiv(value: String): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: generated | extensions | additional | empty): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_div(value: Element): Self = StObject.set(x, "_div", value.asInstanceOf[js.Any])
    
    inline def set_divUndefined: Self = StObject.set(x, "_div", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
