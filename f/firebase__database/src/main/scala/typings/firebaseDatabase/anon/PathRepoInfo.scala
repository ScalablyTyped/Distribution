package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoInfo extends StObject {
  
  var path: typings.firebaseDatabase.utilPathMod.Path
  
  var repoInfo: typings.firebaseDatabase.coreRepoInfoMod.RepoInfo
}
object PathRepoInfo {
  
  inline def apply(
    path: typings.firebaseDatabase.utilPathMod.Path,
    repoInfo: typings.firebaseDatabase.coreRepoInfoMod.RepoInfo
  ): PathRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoInfo]
  }
  
  extension [Self <: PathRepoInfo](x: Self) {
    
    inline def setPath(value: typings.firebaseDatabase.utilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typings.firebaseDatabase.coreRepoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
