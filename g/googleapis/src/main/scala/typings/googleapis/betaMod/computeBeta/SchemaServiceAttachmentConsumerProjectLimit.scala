package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAttachmentConsumerProjectLimit extends StObject {
  
  /**
    * The value of the limit to set.
    */
  var connectionLimit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The project id or number for the project to set the limit for.
    */
  var projectIdOrNum: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAttachmentConsumerProjectLimit {
  
  inline def apply(): SchemaServiceAttachmentConsumerProjectLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAttachmentConsumerProjectLimit]
  }
  
  extension [Self <: SchemaServiceAttachmentConsumerProjectLimit](x: Self) {
    
    inline def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
    
    inline def setConnectionLimitNull: Self = StObject.set(x, "connectionLimit", null)
    
    inline def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
    
    inline def setProjectIdOrNum(value: String): Self = StObject.set(x, "projectIdOrNum", value.asInstanceOf[js.Any])
    
    inline def setProjectIdOrNumNull: Self = StObject.set(x, "projectIdOrNum", null)
    
    inline def setProjectIdOrNumUndefined: Self = StObject.set(x, "projectIdOrNum", js.undefined)
  }
}
