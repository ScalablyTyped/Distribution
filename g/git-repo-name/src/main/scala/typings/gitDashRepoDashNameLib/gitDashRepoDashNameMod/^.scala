package typings
package gitDashRepoDashNameLib.gitDashRepoDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-repo-name", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[java.lang.String] = js.native
  def apply(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* repoName */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def apply(options: java.lang.String | gitDashRepoDashNameLib.gitDashRepoDashNameMod.gitRepoNameNs.Options): js.Promise[java.lang.String] = js.native
  def apply(
    options: java.lang.String | gitDashRepoDashNameLib.gitDashRepoDashNameMod.gitRepoNameNs.Options,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* repoName */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def promise(): js.Promise[java.lang.String] = js.native
  def promise(options: gitDashRepoDashNameLib.gitDashRepoDashNameMod.gitRepoNameNs.Options): js.Promise[java.lang.String] = js.native
  def promise(options: java.lang.String): js.Promise[java.lang.String] = js.native
  def sync(): java.lang.String = js.native
  def sync(options: gitDashRepoDashNameLib.gitDashRepoDashNameMod.gitRepoNameNs.Options): java.lang.String = js.native
  def sync(options: java.lang.String): java.lang.String = js.native
}

