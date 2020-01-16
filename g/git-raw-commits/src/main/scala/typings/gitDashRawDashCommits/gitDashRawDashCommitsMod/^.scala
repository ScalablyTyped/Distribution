package typings.gitDashRawDashCommits.gitDashRawDashCommitsMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-raw-commits", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a readable stream. Stream is split to break on each commit.
    *
    * @param gitOpts
    * @param execOpts Options to pass to `git` `childProcess`.
    */
  def apply(gitOptions: GitOptions): Readable = js.native
  def apply(gitOptions: GitOptions, execOptions: ExecOptions): Readable = js.native
}

