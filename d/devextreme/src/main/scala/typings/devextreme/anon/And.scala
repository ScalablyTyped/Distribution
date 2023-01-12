package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  /**
    * The &apos;and&apos; operation&apos;s description.
    */
  var and: js.UndefOr[String] = js.undefined
  
  /**
    * The &apos;notand&apos; operation&apos;s description.
    */
  var notAnd: js.UndefOr[String] = js.undefined
  
  /**
    * The &apos;notor&apos; operation&apos;s description.
    */
  var notOr: js.UndefOr[String] = js.undefined
  
  /**
    * The &apos;or&apos; operation&apos;s description.
    */
  var or: js.UndefOr[String] = js.undefined
}
object And {
  
  inline def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: String): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setNotAnd(value: String): Self = StObject.set(x, "notAnd", value.asInstanceOf[js.Any])
    
    inline def setNotAndUndefined: Self = StObject.set(x, "notAnd", js.undefined)
    
    inline def setNotOr(value: String): Self = StObject.set(x, "notOr", value.asInstanceOf[js.Any])
    
    inline def setNotOrUndefined: Self = StObject.set(x, "notOr", js.undefined)
    
    inline def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
  }
}
