package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Specificity extends StObject {
  
  /**
    * The a component, which represents the number of ID selectors.
    */
  var a: integer
  
  /**
    * The b component, which represents the number of class selectors, attributes selectors, and
    * pseudo-classes.
    */
  var b: integer
  
  /**
    * The c component, which represents the number of type selectors and pseudo-elements.
    */
  var c: integer
}
object Specificity {
  
  inline def apply(a: integer, b: integer, c: integer): Specificity = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specificity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Specificity] (val x: Self) extends AnyVal {
    
    inline def setA(value: integer): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: integer): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: integer): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
