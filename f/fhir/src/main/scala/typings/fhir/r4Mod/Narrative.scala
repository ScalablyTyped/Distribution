package typings.fhir.r4Mod

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
    * The contents of the html element are an XHTML fragment containing only the basic html formatting elements described in chapters 7-11 and 15 of the HTML 4.0 standard, <a> elements (either name or href), images and internally contained stylesheets. The XHTML content SHALL NOT contain a head, a body, external stylesheet references, scripts, forms, base/link/xlink, frames, iframes and objects.
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
