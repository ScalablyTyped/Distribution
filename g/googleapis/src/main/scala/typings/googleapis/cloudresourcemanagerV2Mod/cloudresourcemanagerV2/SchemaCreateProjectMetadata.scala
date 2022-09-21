package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateProjectMetadata extends StObject {
  
  /**
    * Creation time of the project creation workflow.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the project can be retrieved using `GetProject`. No other operations on the project are guaranteed to work until the project creation is complete.
    */
  var gettable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if the project creation process is complete.
    */
  var ready: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCreateProjectMetadata {
  
  inline def apply(): SchemaCreateProjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateProjectMetadata]
  }
  
  extension [Self <: SchemaCreateProjectMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setGettable(value: Boolean): Self = StObject.set(x, "gettable", value.asInstanceOf[js.Any])
    
    inline def setGettableNull: Self = StObject.set(x, "gettable", null)
    
    inline def setGettableUndefined: Self = StObject.set(x, "gettable", js.undefined)
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyNull: Self = StObject.set(x, "ready", null)
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
