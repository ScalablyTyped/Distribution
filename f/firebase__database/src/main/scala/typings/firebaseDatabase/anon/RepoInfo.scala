package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoInfo extends StObject {
  
  var path: typings.firebaseDatabase.pathMod.Path
  
  var repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo
}
object RepoInfo {
  
  inline def apply(
    path: typings.firebaseDatabase.pathMod.Path,
    repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
  
  extension [Self <: RepoInfo](x: Self) {
    
    inline def setPath(value: typings.firebaseDatabase.pathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typings.firebaseDatabase.repoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
