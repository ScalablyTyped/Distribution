package typings.fsCson

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-cson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readFile(filePath: String, done: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readFileSync(filePath: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  
  @scala.inline
  def updateFile(
    filePath: String,
    updater: js.Function1[/* data */ js.Any, js.Any],
    done: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFile")(filePath.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateFileSync(filePath: String, updater: js.Function1[/* data */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileSync")(filePath.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFile(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFileSafe(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSafe")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFileSafeSync(filePath: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSafeSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFileSync(filePath: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
