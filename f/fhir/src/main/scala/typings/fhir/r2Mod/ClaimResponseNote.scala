package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseNote
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * An integer associated with each note which may be referred to from each service line item.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * The note text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The note purpose: Print/Display.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object ClaimResponseNote {
  
  inline def apply(): ClaimResponseNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseNote] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
