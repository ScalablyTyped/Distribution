package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labelwithop extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var label_with_op: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object Labelwithop {
  
  inline def apply(): Labelwithop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labelwithop]
  }
  
  extension [Self <: Labelwithop](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabel_with_op(value: String): Self = StObject.set(x, "label_with_op", value.asInstanceOf[js.Any])
    
    inline def setLabel_with_opUndefined: Self = StObject.set(x, "label_with_op", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
