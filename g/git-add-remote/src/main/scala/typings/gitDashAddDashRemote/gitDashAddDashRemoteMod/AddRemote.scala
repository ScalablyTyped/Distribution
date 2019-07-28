package typings.gitDashAddDashRemote.gitDashAddDashRemoteMod

import typings.node.childUnderscoreProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRemote extends js.Object {
  def apply(
    name: String,
    url: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): Unit = js.native
  def sync(name: String, url: String): Unit = js.native
}

