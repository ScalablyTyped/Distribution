package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilObject extends StObject {
  
  /**
    * Creates an empty object and copies all enumerable properties of another object to it
    * @param object Object to clone
    */
  def clone(`object`: Any): Any
  
  /**
    * Copies all enumerable properties of one object to another
    * @param destination Where to copy to
    * @param source Where to copy from
    */
  def extend(destination: Any, source: Any): Any
}
object IUtilObject {
  
  inline def apply(clone_ : Any => Any, extend: (Any, Any) => Any): IUtilObject = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction2(extend))
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[IUtilObject]
  }
  
  extension [Self <: IUtilObject](x: Self) {
    
    inline def setClone_(value: Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setExtend(value: (Any, Any) => Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
  }
}
