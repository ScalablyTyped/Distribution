package typings.ejWebAll.anon

import typings.ejWebAll.ej.TagCloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTagCloud extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: TagCloud
}
object TypeofTagCloud {
  
  @scala.inline
  def apply(Locale: js.Any, fn: TagCloud): TypeofTagCloud = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTagCloud]
  }
  
  @scala.inline
  implicit class TypeofTagCloudMutableBuilder[Self <: TypeofTagCloud] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: TagCloud): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
