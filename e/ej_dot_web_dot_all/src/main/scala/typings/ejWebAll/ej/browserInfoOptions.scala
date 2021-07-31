package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait browserInfoOptions extends StObject {
  
  var culture: js.Any
  
  var isMSPointerEnabled: Boolean
  
  var name: String
  
  var version: String
}
object browserInfoOptions {
  
  @scala.inline
  def apply(culture: js.Any, isMSPointerEnabled: Boolean, name: String, version: String): browserInfoOptions = {
    val __obj = js.Dynamic.literal(culture = culture.asInstanceOf[js.Any], isMSPointerEnabled = isMSPointerEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[browserInfoOptions]
  }
  
  @scala.inline
  implicit class browserInfoOptionsMutableBuilder[Self <: browserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: js.Any): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMSPointerEnabled(value: Boolean): Self = StObject.set(x, "isMSPointerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
