package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  var files: js.Array[File]
}

object Commit {
  @scala.inline
  def apply(files: js.Array[File]): Commit = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
}

