package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedChooseSpecifier extends StObject {
  
  /**
    * Which class to look for instances of. E.g.: `ObjC.classes.UIButton`.
    */
  var `class`: Object
  
  /**
    * Whether you’re also interested in subclasses matching the given class selector.
    *
    * The default is to also include subclasses.
    */
  var subclasses: js.UndefOr[Boolean] = js.undefined
}
object DetailedChooseSpecifier {
  
  inline def apply(`class`: Object): DetailedChooseSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedChooseSpecifier]
  }
  
  extension [Self <: DetailedChooseSpecifier](x: Self) {
    
    inline def setClass(value: Object): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setSubclasses(value: Boolean): Self = StObject.set(x, "subclasses", value.asInstanceOf[js.Any])
    
    inline def setSubclassesUndefined: Self = StObject.set(x, "subclasses", js.undefined)
  }
}
