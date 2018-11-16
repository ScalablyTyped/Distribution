package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Repo")
@js.native
class Repo protected () extends js.Object {
  def this(path: java.lang.String, callback: js.Function2[/* err */ js.Any, /* repo */ Repo, scala.Unit]) = this()
  def this(path: java.lang.String, options: js.Any, callback: js.Function2[/* err */ js.Any, /* repo */ Repo, scala.Unit]) = this()
  var bare: js.Any = js.native
  var config_object: js.Any = js.native
  var git: js.Any = js.native
  var options: js.Any = js.native
  var path: java.lang.String = js.native
  var working_directory: js.Any = js.native
  def add(files: js.Any, callback: js.Function): scala.Unit = js.native
  def alternates(callback: js.Function): scala.Unit = js.native
  def blame(
    file: java.lang.String,
    commit: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* blame */ Blame, scala.Unit]
  ): scala.Unit = js.native
  def blob(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def commit(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def commit_all(message: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_count(start: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_deltas_from(otherRepo: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_deltas_from(otherRepo: js.Any, reference: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_deltas_from(otherRepo: js.Any, reference: js.Any, otherReference: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_diff(commit: java.lang.String, callback: js.Function): scala.Unit = js.native
  def commit_index(message: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_stats(callback: js.Function): scala.Unit = js.native
  def commit_stats(start: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_stats(start: js.Any, maxCount: js.Any, callback: js.Function): scala.Unit = js.native
  def commit_stats(start: js.Any, maxCount: js.Any, skip: js.Any, callback: js.Function): scala.Unit = js.native
  def commits(callback: js.Function): scala.Unit = js.native
  def commits(start: java.lang.String, callback: js.Function): scala.Unit = js.native
  def commits(start: java.lang.String, maxCount: scala.Double, callback: js.Function): scala.Unit = js.native
  def commits(start: java.lang.String, maxCount: scala.Double, skip: js.Any, callback: js.Function): scala.Unit = js.native
  def config(callback: js.Function): scala.Unit = js.native
  def description(callback: js.Function): scala.Unit = js.native
  def diff(
    a: java.lang.String,
    b: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* patch */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def diff(
    a: java.lang.String,
    b: java.lang.String,
    paths: js.Any,
    callback: js.Function2[/* error */ js.Any, /* patch */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  // buggy?
  def diff(
    a: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* patch */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fork_bare(path: js.Any, callback: js.Function): scala.Unit = js.native
  def fork_bare(path: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
  def get_head(headName: js.Any, callback: js.Function): scala.Unit = js.native
  def head(callback: js.Function2[/* err */ js.Any, /* head */ Head, scala.Unit]): scala.Unit = js.native
  def heads(callback: js.Function2[/* err */ js.Any, /* heads */ js.Array[Head], scala.Unit]): scala.Unit = js.native
  def index(callback: js.Function): scala.Unit = js.native
  def init_bare(path: js.Any, gitOptions: js.Any, repoOptions: js.Any, callback: js.Function): scala.Unit = js.native
  def is_head(headName: js.Any, callback: js.Function): scala.Unit = js.native
  def log(callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], scala.Unit]): scala.Unit = js.native
  def log(
    commit: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], scala.Unit]
  ): scala.Unit = js.native
  def log(
    commit: java.lang.String,
    path: js.Any,
    callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], scala.Unit]
  ): scala.Unit = js.native
  def log(
    commit: java.lang.String,
    path: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], scala.Unit]
  ): scala.Unit = js.native
  def refs(callback: js.Function): scala.Unit = js.native
  def remove(files: js.Any, callback: js.Function): scala.Unit = js.native
  def set_alternates(alts: js.Any, callback: js.Function): scala.Unit = js.native
  def status(callback: js.Function): scala.Unit = js.native
  def tags(callback: js.Function): scala.Unit = js.native
  def tree(callback: js.Function): scala.Unit = js.native
  def tree(treeish: java.lang.String, callback: js.Function): scala.Unit = js.native
  def tree(treeish: java.lang.String, paths: js.Any, callback: js.Function): scala.Unit = js.native
  def update_ref(head: js.Any, commitSha: js.Any, callback: js.Function): scala.Unit = js.native
}

