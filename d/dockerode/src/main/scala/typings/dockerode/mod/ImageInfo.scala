package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  var Containers: Double
  
  var Created: Double
  
  var Id: String
  
  var Labels: StringDictionary[String]
  
  var ParentId: String
  
  var RepoDigests: js.UndefOr[js.Array[String]] = js.undefined
  
  var RepoTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var SharedSize: Double
  
  var Size: Double
  
  var VirtualSize: Double
}
object ImageInfo {
  
  inline def apply(
    Containers: Double,
    Created: Double,
    Id: String,
    Labels: StringDictionary[String],
    ParentId: String,
    SharedSize: Double,
    Size: Double,
    VirtualSize: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any], SharedSize = SharedSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: Double): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setRepoDigests(value: js.Array[String]): Self = StObject.set(x, "RepoDigests", value.asInstanceOf[js.Any])
    
    inline def setRepoDigestsUndefined: Self = StObject.set(x, "RepoDigests", js.undefined)
    
    inline def setRepoDigestsVarargs(value: String*): Self = StObject.set(x, "RepoDigests", js.Array(value*))
    
    inline def setRepoTags(value: js.Array[String]): Self = StObject.set(x, "RepoTags", value.asInstanceOf[js.Any])
    
    inline def setRepoTagsUndefined: Self = StObject.set(x, "RepoTags", js.undefined)
    
    inline def setRepoTagsVarargs(value: String*): Self = StObject.set(x, "RepoTags", js.Array(value*))
    
    inline def setSharedSize(value: Double): Self = StObject.set(x, "SharedSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setVirtualSize(value: Double): Self = StObject.set(x, "VirtualSize", value.asInstanceOf[js.Any])
  }
}
