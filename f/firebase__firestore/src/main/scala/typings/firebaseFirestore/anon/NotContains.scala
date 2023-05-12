package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.MutableDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotContains extends StObject {
  
  var bitCount: js.UndefOr[Double] = js.undefined
  
  var contains: js.Array[MutableDocument]
  
  var hashCount: js.UndefOr[Double] = js.undefined
  
  var notContains: js.Array[MutableDocument]
}
object NotContains {
  
  inline def apply(contains: js.Array[MutableDocument], notContains: js.Array[MutableDocument]): NotContains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], notContains = notContains.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotContains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotContains] (val x: Self) extends AnyVal {
    
    inline def setBitCount(value: Double): Self = StObject.set(x, "bitCount", value.asInstanceOf[js.Any])
    
    inline def setBitCountUndefined: Self = StObject.set(x, "bitCount", js.undefined)
    
    inline def setContains(value: js.Array[MutableDocument]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: MutableDocument*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setHashCount(value: Double): Self = StObject.set(x, "hashCount", value.asInstanceOf[js.Any])
    
    inline def setHashCountUndefined: Self = StObject.set(x, "hashCount", js.undefined)
    
    inline def setNotContains(value: js.Array[MutableDocument]): Self = StObject.set(x, "notContains", value.asInstanceOf[js.Any])
    
    inline def setNotContainsVarargs(value: MutableDocument*): Self = StObject.set(x, "notContains", js.Array(value*))
  }
}
