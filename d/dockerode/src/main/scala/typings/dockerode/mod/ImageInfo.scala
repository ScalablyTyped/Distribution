package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  var Created: Double
  
  var Id: String
  
  var Labels: StringDictionary[String]
  
  var ParentId: String
  
  var RepoDigests: js.UndefOr[js.Array[String]] = js.undefined
  
  var RepoTags: js.Array[String]
  
  var Size: Double
  
  var VirtualSize: Double
}
object ImageInfo {
  
  inline def apply(
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
  
  extension [Self <: ImageInfo](x: Self) {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setRepoDigests(value: js.Array[String]): Self = StObject.set(x, "RepoDigests", value.asInstanceOf[js.Any])
    
    inline def setRepoDigestsUndefined: Self = StObject.set(x, "RepoDigests", js.undefined)
    
    inline def setRepoDigestsVarargs(value: String*): Self = StObject.set(x, "RepoDigests", js.Array(value :_*))
    
    inline def setRepoTags(value: js.Array[String]): Self = StObject.set(x, "RepoTags", value.asInstanceOf[js.Any])
    
    inline def setRepoTagsVarargs(value: String*): Self = StObject.set(x, "RepoTags", js.Array(value :_*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setVirtualSize(value: Double): Self = StObject.set(x, "VirtualSize", value.asInstanceOf[js.Any])
  }
}
