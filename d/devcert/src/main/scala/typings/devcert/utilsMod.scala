package typings.devcert

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.childProcessMod.ExecFileSyncOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("devcert/dist/utils", "mktmp")
  @js.native
  def mktmp(): String = js.native
  
  @JSImport("devcert/dist/utils", "openssl")
  @js.native
  def openssl(args: js.Array[String]): Buffer = js.native
  
  @JSImport("devcert/dist/utils", "reportableError")
  @js.native
  def reportableError(message: String): Error = js.native
  
  @JSImport("devcert/dist/utils", "run")
  @js.native
  def run(cmd: String, args: js.Array[String]): Buffer = js.native
  @JSImport("devcert/dist/utils", "run")
  @js.native
  def run(cmd: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  
  @JSImport("devcert/dist/utils", "sudo")
  @js.native
  def sudo(cmd: String): js.Promise[String | Null] = js.native
  
  @JSImport("devcert/dist/utils", "sudoAppend")
  @js.native
  def sudoAppend(file: String): Unit = js.native
  @JSImport("devcert/dist/utils", "sudoAppend")
  @js.native
  def sudoAppend(file: String, input: String): Unit = js.native
  @JSImport("devcert/dist/utils", "sudoAppend")
  @js.native
  def sudoAppend(file: String, input: ArrayBufferView): Unit = js.native
  
  @JSImport("devcert/dist/utils", "waitForUser")
  @js.native
  def waitForUser(): js.Promise[js.Object] = js.native
}
