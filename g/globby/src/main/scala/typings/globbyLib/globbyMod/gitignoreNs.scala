package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globby", "gitignore")
@js.native
object gitignoreNs extends js.Object {
  /**
    * Returns a `(path: string) => boolean` indicating whether a given path is ignored via a `.gitignore` file.
    *
    * Takes the same options as `globby.gitignore`.
    */
  def sync(): js.Function1[/* path */ java.lang.String, scala.Boolean] = js.native
  def sync(options: globbyLib.Anon_Cwd): js.Function1[/* path */ java.lang.String, scala.Boolean] = js.native
}

