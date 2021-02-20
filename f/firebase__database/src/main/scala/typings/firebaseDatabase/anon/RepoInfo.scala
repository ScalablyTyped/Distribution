package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoInfo extends StObject {
  
  var path: typings.firebaseDatabase.pathMod.Path = js.native
  
  var repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo = js.native
}
object RepoInfo {
  
  @scala.inline
  def apply(
    path: typings.firebaseDatabase.pathMod.Path,
    repoInfo: typings.firebaseDatabase.repoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
  
  @scala.inline
  implicit class RepoInfoMutableBuilder[Self <: RepoInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: typings.firebaseDatabase.pathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoInfo(value: typings.firebaseDatabase.repoInfoMod.RepoInfo): Self = StObject.set(x, "repoInfo", value.asInstanceOf[js.Any])
  }
}
