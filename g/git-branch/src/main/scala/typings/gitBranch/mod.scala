package typings.gitBranch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(cwd: String): Unit = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(cwd: String, callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(cwd: Unit, callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String]
  inline def sync(cwd: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any]).asInstanceOf[String]
}
