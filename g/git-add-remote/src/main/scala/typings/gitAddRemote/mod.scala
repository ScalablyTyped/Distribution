package typings.gitAddRemote

import typings.node.childProcessMod.ExecException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): AddRemote = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AddRemote]
  @scala.inline
  def apply(cwd: String): AddRemote = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[AddRemote]
  
  @JSImport("git-add-remote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
