package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryRestricts extends js.Object {
  
  /**
    * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
    */
  var categoryRestricts: js.Array[String] = js.native
  
  /**
    * The keyword tag suggested for the video.
    */
  var tag: String = js.native
}
object CategoryRestricts {
  
  @scala.inline
  def apply(categoryRestricts: js.Array[String], tag: String): CategoryRestricts = {
    val __obj = js.Dynamic.literal(categoryRestricts = categoryRestricts.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryRestricts]
  }
  
  @scala.inline
  implicit class CategoryRestrictsOps[Self <: CategoryRestricts] (val x: Self) extends AnyVal {
    
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
    def setCategoryRestrictsVarargs(value: String*): Self = this.set("categoryRestricts", js.Array(value :_*))
    
    @scala.inline
    def setCategoryRestricts(value: js.Array[String]): Self = this.set("categoryRestricts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
