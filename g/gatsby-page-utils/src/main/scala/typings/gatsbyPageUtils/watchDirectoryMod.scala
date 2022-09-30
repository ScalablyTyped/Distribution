package typings.gatsbyPageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchDirectoryMod {
  
  @JSImport("gatsby-page-utils/dist/watch-directory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def watchDirectory(
    path: String,
    glob: String,
    onNewFile: js.Function1[/* path */ String, Unit],
    onRemovedFile: js.Function1[/* path */ String, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchDirectory")(path.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], onNewFile.asInstanceOf[js.Any], onRemovedFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def watchDirectory(
    path: String,
    glob: js.Array[String],
    onNewFile: js.Function1[/* path */ String, Unit],
    onRemovedFile: js.Function1[/* path */ String, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchDirectory")(path.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], onNewFile.asInstanceOf[js.Any], onRemovedFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
