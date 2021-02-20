package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaItemCountByStatus extends StObject {
  
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object SchemaItemCountByStatus {
  
  @scala.inline
  def apply(): SchemaItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemCountByStatus]
  }
  
  @scala.inline
  implicit class SchemaItemCountByStatusMutableBuilder[Self <: SchemaItemCountByStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
