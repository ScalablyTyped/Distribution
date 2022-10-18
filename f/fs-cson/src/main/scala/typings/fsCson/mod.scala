package typings.fsCson

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-cson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(filePath: String, done: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFileSync(filePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  
  inline def updateFile(
    filePath: String,
    updater: js.Function1[/* data */ Any, Any],
    done: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFile")(filePath.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateFileSync(filePath: String, updater: js.Function1[/* data */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileSync")(filePath.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFile(filePath: String, data: Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileSafe(filePath: String, data: Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSafe")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileSafeSync(filePath: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSafeSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileSync(filePath: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
