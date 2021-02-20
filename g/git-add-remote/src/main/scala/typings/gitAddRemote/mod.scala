package typings.gitAddRemote

import typings.node.childProcessMod.ExecException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-add-remote", JSImport.Namespace)
  @js.native
  def apply(): AddRemote = js.native
  @JSImport("git-add-remote", JSImport.Namespace)
  @js.native
  def apply(cwd: String): AddRemote = js.native
  
  @js.native
  trait AddRemote extends StObject {
    
    def apply(
      name: String,
      url: String,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): Unit = js.native
    
    def sync(name: String, url: String): Unit = js.native
  }
}
