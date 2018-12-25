package typings
package gitDashAddDashRemoteLib.gitDashAddDashRemoteMod.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRemote extends js.Object {
  def apply(
    name: java.lang.String,
    url: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sync(name: java.lang.String, url: java.lang.String): scala.Unit = js.native
}

