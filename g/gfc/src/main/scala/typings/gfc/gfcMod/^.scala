package typings.gfc.gfcMod

import typings.gfc.Anon_Stderr
import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ExecException
import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gfc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Anon_Stderr] = js.native
  def apply(cwd: String): js.Promise[Anon_Stderr] = js.native
  def apply(
    cwd: String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(cwd: String, options: Options[ExecOptionsWithEncoding]): js.Promise[Anon_Stderr] = js.native
  def apply(
    cwd: String,
    options: Options[ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[Anon_Stderr] = js.native
  def sync(): String | Buffer = js.native
  def sync(cwd: String): String | Buffer = js.native
  def sync(cwd: String, options: Options[ExecSyncOptions]): String | Buffer = js.native
  def sync(options: Options[ExecSyncOptions]): String | Buffer = js.native
}

