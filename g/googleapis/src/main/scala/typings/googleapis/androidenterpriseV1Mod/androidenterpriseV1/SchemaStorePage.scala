package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStorePage extends StObject {
  
  /**
    * Unique ID of this page. Assigned by the server. Immutable once assigned.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ordered list of pages a user should be able to reach from this page. The list can't include this page. It is recommended that the basic pages are created first, before adding the links between pages. The API doesn't verify that the pages exist or the pages are reachable.
    */
  var link: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[SchemaLocalizedText]] = js.undefined
}
object SchemaStorePage {
  
  inline def apply(): SchemaStorePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorePage]
  }
  
  extension [Self <: SchemaStorePage](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setName(value: js.Array[SchemaLocalizedText]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: SchemaLocalizedText*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
