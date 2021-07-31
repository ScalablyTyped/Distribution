package typings.gitConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Object]
  @scala.inline
  def sync(gitFile: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(gitFile.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
