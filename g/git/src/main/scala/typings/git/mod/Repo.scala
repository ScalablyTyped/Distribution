package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Repo")
@js.native
class Repo protected () extends StObject {
  def this(path: String, callback: js.Function2[/* err */ js.Any, /* repo */ Repo, Unit]) = this()
  def this(path: String, options: js.Any, callback: js.Function2[/* err */ js.Any, /* repo */ Repo, Unit]) = this()
  
  def add(files: js.Any, callback: js.Function): Unit = js.native
  
  def alternates(callback: js.Function): Unit = js.native
  
  var bare: js.Any = js.native
  
  def blame(file: String, commit: String, callback: js.Function2[/* err */ js.Any, /* blame */ Blame, Unit]): Unit = js.native
  
  def blob(id: String, callback: js.Function): Unit = js.native
  
  def commit(id: String, callback: js.Function): Unit = js.native
  
  def commit_all(message: js.Any, callback: js.Function): Unit = js.native
  
  def commit_count(start: js.Any, callback: js.Function): Unit = js.native
  
  def commit_deltas_from(otherRepo: js.Any, callback: js.Function): Unit = js.native
  def commit_deltas_from(otherRepo: js.Any, reference: js.Any, callback: js.Function): Unit = js.native
  def commit_deltas_from(otherRepo: js.Any, reference: js.Any, otherReference: js.Any, callback: js.Function): Unit = js.native
  
  def commit_diff(commit: String, callback: js.Function): Unit = js.native
  
  def commit_index(message: js.Any, callback: js.Function): Unit = js.native
  
  def commit_stats(callback: js.Function): Unit = js.native
  def commit_stats(start: js.Any, callback: js.Function): Unit = js.native
  def commit_stats(start: js.Any, maxCount: js.Any, callback: js.Function): Unit = js.native
  def commit_stats(start: js.Any, maxCount: js.Any, skip: js.Any, callback: js.Function): Unit = js.native
  
  def commits(callback: js.Function): Unit = js.native
  def commits(start: String, callback: js.Function): Unit = js.native
  def commits(start: String, maxCount: Double, callback: js.Function): Unit = js.native
  def commits(start: String, maxCount: Double, skip: js.Any, callback: js.Function): Unit = js.native
  
  def config(callback: js.Function): Unit = js.native
  
  var config_object: js.Any = js.native
  
  def description(callback: js.Function): Unit = js.native
  
  def diff(a: String, b: String, callback: js.Function2[/* error */ js.Any, /* patch */ String, Unit]): Unit = js.native
  def diff(
    a: String,
    b: String,
    paths: js.Any,
    callback: js.Function2[/* error */ js.Any, /* patch */ String, Unit]
  ): Unit = js.native
  // buggy?
  def diff(a: String, callback: js.Function2[/* error */ js.Any, /* patch */ String, Unit]): Unit = js.native
  
  def fork_bare(path: js.Any, callback: js.Function): Unit = js.native
  def fork_bare(path: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  
  def get_head(headName: js.Any, callback: js.Function): Unit = js.native
  
  var git: js.Any = js.native
  
  def head(callback: js.Function2[/* err */ js.Any, /* head */ Head, Unit]): Unit = js.native
  
  def heads(callback: js.Function2[/* err */ js.Any, /* heads */ js.Array[Head], Unit]): Unit = js.native
  
  def index(callback: js.Function): Unit = js.native
  
  def init_bare(path: js.Any, gitOptions: js.Any, repoOptions: js.Any, callback: js.Function): Unit = js.native
  
  def is_head(headName: js.Any, callback: js.Function): Unit = js.native
  
  def log(callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], Unit]): Unit = js.native
  def log(commit: String, callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], Unit]): Unit = js.native
  def log(
    commit: String,
    path: js.Any,
    callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], Unit]
  ): Unit = js.native
  def log(
    commit: String,
    path: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* commits */ js.Array[Commit], Unit]
  ): Unit = js.native
  
  var options: js.Any = js.native
  
  var path: String = js.native
  
  def refs(callback: js.Function): Unit = js.native
  
  def remove(files: js.Any, callback: js.Function): Unit = js.native
  
  def set_alternates(alts: js.Any, callback: js.Function): Unit = js.native
  
  def status(callback: js.Function): Unit = js.native
  
  def tags(callback: js.Function): Unit = js.native
  
  def tree(callback: js.Function): Unit = js.native
  def tree(treeish: String, callback: js.Function): Unit = js.native
  def tree(treeish: String, paths: js.Any, callback: js.Function): Unit = js.native
  
  def update_ref(head: js.Any, commitSha: js.Any, callback: js.Function): Unit = js.native
  
  var working_directory: js.Any = js.native
}
