package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for elements defined inside a resource
  */
@js.native
trait BackboneElement extends Element {
  
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.native
}
object BackboneElement {
  
  @scala.inline
  def apply(): BackboneElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackboneElement]
  }
  
  @scala.inline
  implicit class BackboneElementMutableBuilder[Self <: BackboneElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifierExtension(value: js.Array[Extension]): Self = StObject.set(x, "modifierExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierExtensionUndefined: Self = StObject.set(x, "modifierExtension", js.undefined)
    
    @scala.inline
    def setModifierExtensionVarargs(value: Extension*): Self = StObject.set(x, "modifierExtension", js.Array(value :_*))
  }
}
