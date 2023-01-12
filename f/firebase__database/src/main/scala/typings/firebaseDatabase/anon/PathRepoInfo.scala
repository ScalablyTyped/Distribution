package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoInfo extends StObject {
  
  var path: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
  
  var repoInfo: typings.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
}
object PathRepoInfo {
  
  inline def apply(
    path: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path,
    repoInfo: typings.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
  ): PathRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoInfo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typings.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
