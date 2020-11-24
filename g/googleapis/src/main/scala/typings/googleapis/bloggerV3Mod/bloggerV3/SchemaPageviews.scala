package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPageviews extends js.Object {
  
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
  implicit class SchemaPageviewsOps[Self <: SchemaPageviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogId: Self = this.set("blogId", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: Count*): Self = this.set("counts", js.Array(value :_*))
    
    @scala.inline
    def setCounts(value: js.Array[Count]): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
