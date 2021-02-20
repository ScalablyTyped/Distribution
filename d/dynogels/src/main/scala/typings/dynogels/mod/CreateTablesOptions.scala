package typings.dynogels.mod

import typings.dynogels.anon.StreamEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTablesOptions extends StObject {
  
  var readCapacity: js.UndefOr[Double] = js.native
  
  var streamSpecification: js.UndefOr[StreamEnabled] = js.native
  
  var writeCapacity: js.UndefOr[Double] = js.native
}
object CreateTablesOptions {
  
  @scala.inline
  def apply(): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTablesOptions]
  }
  
  @scala.inline
  implicit class CreateTablesOptionsMutableBuilder[Self <: CreateTablesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: StreamEnabled): Self = StObject.set(x, "streamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSpecificationUndefined: Self = StObject.set(x, "streamSpecification", js.undefined)
    
    @scala.inline
    def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
  }
}
