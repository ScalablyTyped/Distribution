package typings.execa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecaChildProcess[StdoutErrorType] = typings.node.childProcessMod.ChildProcess with typings.execa.mod.ExecaChildPromise[StdoutErrorType] with js.Promise[typings.execa.mod.ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = typings.execa.mod.ExecaReturnBase[StdoutErrorType]
  /* Rewritten from type alias, can be one of: 
    - typings.execa.execaStrings.pipe
    - typings.execa.execaStrings.ipc
    - typings.execa.execaStrings.ignore
    - typings.execa.execaStrings.inherit
    - typings.node.streamMod.Stream
    - scala.Double
    - `js.undefined`
  */
  type StdioOption = js.UndefOr[typings.execa.mod._StdioOption | typings.node.streamMod.Stream | scala.Double]
}
