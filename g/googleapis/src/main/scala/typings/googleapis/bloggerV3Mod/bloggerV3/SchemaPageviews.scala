package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageviews extends StObject {
  
  /**
    * Blog Id.
    */
  var blogId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The container of posts in this blog.
    */
  var counts: js.UndefOr[js.Array[Count] | Null] = js.undefined
  
  /**
    * The kind of this entry. Always blogger#page_views.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaPageviews {
  
  inline def apply(): SchemaPageviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviews]
  }
  
  extension [Self <: SchemaPageviews](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdNull: Self = StObject.set(x, "blogId", null)
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setCounts(value: js.Array[Count]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsNull: Self = StObject.set(x, "counts", null)
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCountsVarargs(value: Count*): Self = StObject.set(x, "counts", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
