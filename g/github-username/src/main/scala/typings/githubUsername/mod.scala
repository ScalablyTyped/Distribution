package typings.githubUsername

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(email: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(email: String, token: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("github-username", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
