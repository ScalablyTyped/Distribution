package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Repo")
@js.native
open class Repo protected () extends StObject {
  def this(path: String, callback: js.Function2[/* err */ Any, /* repo */ Repo, Unit]) = this()
  def this(path: String, options: Any, callback: js.Function2[/* err */ Any, /* repo */ Repo, Unit]) = this()
  
  def add(files: Any, callback: js.Function): Unit = js.native
  
  def alternates(callback: js.Function): Unit = js.native
  
  var bare: Any = js.native
  
  def blame(file: String, commit: String, callback: js.Function2[/* err */ Any, /* blame */ Blame, Unit]): Unit = js.native
  
  def blob(id: String, callback: js.Function): Unit = js.native
  
  def commit(id: String, callback: js.Function): Unit = js.native
  
  def commit_all(message: Any, callback: js.Function): Unit = js.native
  
  def commit_count(start: Any, callback: js.Function): Unit = js.native
  
  def commit_deltas_from(otherRepo: Any, callback: js.Function): Unit = js.native
  def commit_deltas_from(otherRepo: Any, reference: Any, callback: js.Function): Unit = js.native
  def commit_deltas_from(otherRepo: Any, reference: Any, otherReference: Any, callback: js.Function): Unit = js.native
  
  def commit_diff(commit: String, callback: js.Function): Unit = js.native
  
  def commit_index(message: Any, callback: js.Function): Unit = js.native
  
  def commit_stats(callback: js.Function): Unit = js.native
  def commit_stats(start: Any, callback: js.Function): Unit = js.native
  def commit_stats(start: Any, maxCount: Any, callback: js.Function): Unit = js.native
  def commit_stats(start: Any, maxCount: Any, skip: Any, callback: js.Function): Unit = js.native
  
  def commits(callback: js.Function): Unit = js.native
  def commits(start: String, callback: js.Function): Unit = js.native
  def commits(start: String, maxCount: Double, callback: js.Function): Unit = js.native
  def commits(start: String, maxCount: Double, skip: Any, callback: js.Function): Unit = js.native
  
  def config(callback: js.Function): Unit = js.native
  
  var config_object: Any = js.native
  
  def description(callback: js.Function): Unit = js.native
  
  def diff(a: String, b: String, callback: js.Function2[/* error */ Any, /* patch */ String, Unit]): Unit = js.native
  def diff(
    a: String,
    b: String,
    paths: Any,
    callback: js.Function2[/* error */ Any, /* patch */ String, Unit]
  ): Unit = js.native
  // buggy?
  def diff(a: String, callback: js.Function2[/* error */ Any, /* patch */ String, Unit]): Unit = js.native
  
  def fork_bare(path: Any, callback: js.Function): Unit = js.native
  def fork_bare(path: Any, options: Any, callback: js.Function): Unit = js.native
  
  def get_head(headName: Any, callback: js.Function): Unit = js.native
  
  var git: Any = js.native
  
  def head(callback: js.Function2[/* err */ Any, /* head */ Head, Unit]): Unit = js.native
  
  def heads(callback: js.Function2[/* err */ Any, /* heads */ js.Array[Head], Unit]): Unit = js.native
  
  def index(callback: js.Function): Unit = js.native
  
  def init_bare(path: Any, gitOptions: Any, repoOptions: Any, callback: js.Function): Unit = js.native
  
  def is_head(headName: Any, callback: js.Function): Unit = js.native
  
  def log(callback: js.Function2[/* err */ Any, /* commits */ js.Array[Commit], Unit]): Unit = js.native
  def log(commit: String, callback: js.Function2[/* err */ Any, /* commits */ js.Array[Commit], Unit]): Unit = js.native
  def log(
    commit: String,
    path: Any,
    callback: js.Function2[/* err */ Any, /* commits */ js.Array[Commit], Unit]
  ): Unit = js.native
  def log(
    commit: String,
    path: Any,
    options: Any,
    callback: js.Function2[/* err */ Any, /* commits */ js.Array[Commit], Unit]
  ): Unit = js.native
  
  var options: Any = js.native
  
  var path: String = js.native
  
  def refs(callback: js.Function): Unit = js.native
  
  def remove(files: Any, callback: js.Function): Unit = js.native
  
  def set_alternates(alts: Any, callback: js.Function): Unit = js.native
  
  def status(callback: js.Function): Unit = js.native
  
  def tags(callback: js.Function): Unit = js.native
  
  def tree(callback: js.Function): Unit = js.native
  def tree(treeish: String, callback: js.Function): Unit = js.native
  def tree(treeish: String, paths: Any, callback: js.Function): Unit = js.native
  
  def update_ref(head: Any, commitSha: Any, callback: js.Function): Unit = js.native
  
  var working_directory: Any = js.native
}
