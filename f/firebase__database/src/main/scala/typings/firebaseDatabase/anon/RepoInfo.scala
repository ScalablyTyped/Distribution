package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoInfo extends StObject {
  
  var path: typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
  
  var repoInfo: typings.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
}
object RepoInfo {
  
  inline def apply(
    path: typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path,
    repoInfo: typings.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
  
  extension [Self <: RepoInfo](x: Self) {
    
    inline def setPath(value: typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepoInfo(value: typings.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
