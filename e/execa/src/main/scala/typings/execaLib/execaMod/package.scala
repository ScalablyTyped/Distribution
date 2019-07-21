package typings
package execaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object execaMod {
  type ExecaChildProcess[StdoutErrorType] = nodeLib.childUnderscoreProcessMod.ChildProcess with ExecaChildPromise[StdoutErrorType] with js.Promise[ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = ExecaReturnBase[StdoutErrorType]
  /* Rewritten from type alias, can be one of: 
    - execaLib.execaLibStrings.pipe
    - execaLib.execaLibStrings.ipc
    - execaLib.execaLibStrings.ignore
    - execaLib.execaLibStrings.inherit
    - nodeLib.streamMod.Stream
    - scala.Double
    - `js.undefined`
    - scala.Nothing
  */
  type StdioOption = js.UndefOr[_StdioOption | nodeLib.streamMod.Stream | scala.Double]
}
