package typings.gitRemoteOriginUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(cwd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(cwd: String, remoteName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], remoteName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(cwd: Unit, remoteName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], remoteName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("git-remote-origin-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
