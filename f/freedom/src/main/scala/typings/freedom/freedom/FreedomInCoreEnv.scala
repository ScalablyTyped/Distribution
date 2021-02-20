package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreedomInCoreEnv
  extends OnAndEmit[js.Any, js.Any] {
  
  // Represents the call to freedom when you create a root module. Returns a
  // promise to a factory constructor for the freedom module. The
  // |manifestPath| should be a path to a json string that specifies the
  // freedom module.
  def apply(manifestPath: String): js.Promise[FreedomModuleFactoryManager[_]] = js.native
  def apply(manifestPath: String, options: FreedomInCoreEnvOptions): js.Promise[FreedomModuleFactoryManager[_]] = js.native
}
