package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPageviews extends StObject {
  
  /**
    * Blog Id
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * The container of posts in this blog.
    */
  var counts: js.UndefOr[js.Array[Count]] = js.native
  
  /**
    * The kind of this entry. Always blogger#page_views
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaPageviews {
  
  @scala.inline
  def apply(): SchemaPageviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviews]
  }
  
  @scala.inline
  implicit class SchemaPageviewsMutableBuilder[Self <: SchemaPageviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setCounts(value: js.Array[Count]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: Count*): Self = StObject.set(x, "counts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
