package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInfo extends StObject {
  
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
  implicit class ImageInfoMutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoDigests(value: js.Array[String]): Self = StObject.set(x, "RepoDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoDigestsUndefined: Self = StObject.set(x, "RepoDigests", js.undefined)
    
    @scala.inline
    def setRepoDigestsVarargs(value: String*): Self = StObject.set(x, "RepoDigests", js.Array(value :_*))
    
    @scala.inline
    def setRepoTags(value: js.Array[String]): Self = StObject.set(x, "RepoTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoTagsVarargs(value: String*): Self = StObject.set(x, "RepoTags", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualSize(value: Double): Self = StObject.set(x, "VirtualSize", value.asInstanceOf[js.Any])
  }
}
