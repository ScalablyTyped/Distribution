package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInfo extends js.Object {
  
  var Created: Double = js.native
  
  var Id: String = js.native
  
  var Labels: StringDictionary[String] = js.native
  
  var ParentId: String = js.native
  
  var RepoDigests: js.UndefOr[js.Array[String]] = js.native
  
  var RepoTags: js.Array[String] = js.native
  
  var Size: Double = js.native
  
  var VirtualSize: Double = js.native
}
object ImageInfo {
  
  @scala.inline
  def apply(
    Created: Double,
    Id: String,
    Labels: StringDictionary[String],
    ParentId: String,
    RepoTags: js.Array[String],
    Size: Double,
    VirtualSize: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: Double): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoTagsVarargs(value: String*): Self = this.set("RepoTags", js.Array(value :_*))
    
    @scala.inline
    def setRepoTags(value: js.Array[String]): Self = this.set("RepoTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualSize(value: Double): Self = this.set("VirtualSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoDigestsVarargs(value: String*): Self = this.set("RepoDigests", js.Array(value :_*))
    
    @scala.inline
    def setRepoDigests(value: js.Array[String]): Self = this.set("RepoDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoDigests: Self = this.set("RepoDigests", js.undefined)
  }
}
