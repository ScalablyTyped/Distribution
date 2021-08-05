package typings.electronWinstaller

import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spawnPromiseMod {
  
  @JSImport("electron-winstaller/lib/spawn-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(exe: String, params: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(exe.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(exe: String, params: js.Array[String], opts: SpawnOptionsWithoutStdio): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(exe.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
