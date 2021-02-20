package typings.fsCson

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-cson", "readFile")
  @js.native
  def readFile(filePath: String, done: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("fs-cson", "readFileSync")
  @js.native
  def readFileSync(filePath: String): js.Any = js.native
  
  @JSImport("fs-cson", "register")
  @js.native
  def register(): Unit = js.native
  
  @JSImport("fs-cson", "updateFile")
  @js.native
  def updateFile(
    filePath: String,
    updater: js.Function1[/* data */ js.Any, _],
    done: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("fs-cson", "updateFileSync")
  @js.native
  def updateFileSync(filePath: String, updater: js.Function1[/* data */ js.Any, _]): Unit = js.native
  
  @JSImport("fs-cson", "writeFile")
  @js.native
  def writeFile(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("fs-cson", "writeFileSafe")
  @js.native
  def writeFileSafe(filePath: String, data: js.Any, done: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("fs-cson", "writeFileSafeSync")
  @js.native
  def writeFileSafeSync(filePath: String, data: js.Any): Unit = js.native
  
  @JSImport("fs-cson", "writeFileSync")
  @js.native
  def writeFileSync(filePath: String, data: js.Any): Unit = js.native
}
