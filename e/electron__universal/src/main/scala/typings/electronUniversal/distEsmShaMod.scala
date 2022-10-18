package typings.electronUniversal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmShaMod {
  
  @JSImport("@electron/universal/dist/esm/sha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha(filePath: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
