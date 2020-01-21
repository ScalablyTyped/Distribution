package typings.gfc.mod

import typings.gfc.AnonStderr
import typings.node.Buffer
import typings.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gfc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[AnonStderr] = js.native
  def apply(cwd: String): js.Promise[AnonStderr] = js.native
  def apply(
    cwd: String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(cwd: String, options: Options[ExecOptionsWithEncoding]): js.Promise[AnonStderr] = js.native
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
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[AnonStderr] = js.native
}

