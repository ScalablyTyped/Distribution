package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServerBinding extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaServerBinding {
  
  @scala.inline
  def apply(): SchemaServerBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerBinding]
  }
  
  @scala.inline
  implicit class SchemaServerBindingMutableBuilder[Self <: SchemaServerBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
