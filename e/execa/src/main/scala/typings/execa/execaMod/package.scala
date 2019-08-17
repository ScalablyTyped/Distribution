package typings.execa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object execaMod {
  import typings.node.childUnderscoreProcessMod.ChildProcess
  import typings.node.streamMod.Stream

  type ExecaChildProcess[StdoutErrorType] = ChildProcess with ExecaChildPromise[StdoutErrorType] with js.Promise[ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = ExecaReturnBase[StdoutErrorType]
  /* Rewritten from type alias, can be one of: 
    - typings.execa.execaStrings.pipe
    - typings.execa.execaStrings.ipc
    - typings.execa.execaStrings.ignore
    - typings.execa.execaStrings.inherit
    - typings.node.streamMod.Stream
    - scala.Double
    - `js.undefined`
    - scala.Nothing
  */
  type StdioOption = js.UndefOr[_StdioOption | Stream | Double]
}
