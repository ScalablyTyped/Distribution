package typings
package execaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object execaMod {
  type ExecaChildProcess = nodeLib.childUnderscoreProcessMod.ChildProcess with ExecaChildPromise with js.Promise[ExecaReturns]
  type ExecaError = stdLib.Error with ExecaReturns
  /* Rewritten from type alias, can be one of: 
    - execaLib.execaLibStrings.pipe
    - execaLib.execaLibStrings.ipc
    - execaLib.execaLibStrings.ignore
    - execaLib.execaLibStrings.inherit
    - nodeLib.streamMod.Stream
    - scala.Double
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type StdIOOption = js.UndefOr[_StdIOOption | nodeLib.streamMod.Stream | scala.Double | scala.Null]
}
