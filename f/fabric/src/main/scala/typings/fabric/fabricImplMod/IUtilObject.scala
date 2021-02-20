package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilObject extends StObject {
  
  /**
    * Creates an empty object and copies all enumerable properties of another object to it
    * @param object Object to clone
    */
  def clone(`object`: js.Any): js.Any = js.native
  
  /**
    * Copies all enumerable properties of one object to another
    * @param destination Where to copy to
    * @param source Where to copy from
    */
  def extend(destination: js.Any, source: js.Any): js.Any = js.native
}
object IUtilObject {
  
  @scala.inline
  def apply(clone_ : js.Any => js.Any, extend: (js.Any, js.Any) => js.Any): IUtilObject = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction2(extend))
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[IUtilObject]
  }
  
  @scala.inline
  implicit class IUtilObjectMutableBuilder[Self <: IUtilObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: js.Any => js.Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
  }
}
