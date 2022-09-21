package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParent extends StObject {
  
  /**
    * The parent&#39;s ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this is the root folder.
    */
  var isRoot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The parent&#39;s title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaParent {
  
  inline def apply(): SchemaParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParent]
  }
  
  extension [Self <: SchemaParent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootNull: Self = StObject.set(x, "isRoot", null)
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
