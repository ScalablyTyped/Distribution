package typings.gitConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(file: String, callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Object]
  inline def sync(file: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
