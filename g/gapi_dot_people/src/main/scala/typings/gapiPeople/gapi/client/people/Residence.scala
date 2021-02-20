package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Residence extends StObject {
  
  var current: Boolean = js.native
  
  var metadata: FieldMetadata = js.native
  
  var value: String = js.native
}
object Residence {
  
  @scala.inline
  def apply(current: Boolean, metadata: FieldMetadata, value: String): Residence = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Residence]
  }
  
  @scala.inline
  implicit class ResidenceMutableBuilder[Self <: Residence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
