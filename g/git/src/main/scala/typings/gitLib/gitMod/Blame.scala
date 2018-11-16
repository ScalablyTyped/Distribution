package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Blame")
@js.native
class Blame protected () extends js.Object {
  def this(repo: Repo, file: java.lang.String, callback: js.Function2[/* err */ js.Any, /* blame */ Blame, scala.Unit]) = this()
  def this(repo: Repo, file: java.lang.String, commit: java.lang.String, callback: js.Function2[/* err */ js.Any, /* blame */ Blame, scala.Unit]) = this()
  var commit: java.lang.String = js.native
  var file: java.lang.String = js.native
  var lines: js.Array[BlameLine] = js.native
  var repo: Repo = js.native
}

