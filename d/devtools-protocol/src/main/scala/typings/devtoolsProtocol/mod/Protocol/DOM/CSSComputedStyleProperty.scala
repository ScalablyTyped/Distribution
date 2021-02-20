package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSComputedStyleProperty extends StObject {
  
  /**
    * Computed style property name.
    */
  var name: String = js.native
  
  /**
    * Computed style property value.
    */
  var value: String = js.native
}
object CSSComputedStyleProperty {
  
  @scala.inline
  def apply(name: String, value: String): CSSComputedStyleProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSComputedStyleProperty]
  }
  
  @scala.inline
  implicit class CSSComputedStylePropertyMutableBuilder[Self <: CSSComputedStyleProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
