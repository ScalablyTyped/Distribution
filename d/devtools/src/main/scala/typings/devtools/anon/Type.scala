package typings.devtools.anon

import typings.devtools.devtoolsStrings.tab
import typings.devtools.devtoolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: window | tab
}
object Type {
  
  @scala.inline
  def apply(`type`: window | tab): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: window | tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
