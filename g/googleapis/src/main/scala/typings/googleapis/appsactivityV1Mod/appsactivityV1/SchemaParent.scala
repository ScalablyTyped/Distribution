package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a parent object. For example, a folder in Drive
  * is a parent for all files within it.
  */
trait SchemaParent extends StObject {
  
  /**
    * The parent&#39;s ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parent&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaParent {
  
  inline def apply(): SchemaParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParent]
  }
  
  extension [Self <: SchemaParent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
