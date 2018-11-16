package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Git")
@js.native
class Git protected () extends js.Object {
  def this(gitDirectory: js.Any) = this()
   // last element is callback
  def add(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def add(options: js.Any, args: js.Any*): scala.Unit = js.native
  def blame(callback: js.Function): scala.Unit = js.native
  def blame(options: js.Any, callback: js.Function): scala.Unit = js.native
  def blame_tree(commit: js.Any, callback: js.Function): scala.Unit = js.native
  def blame_tree(commit: js.Any, path: js.Any, callback: js.Function): scala.Unit = js.native
   // last element is callback
  def call_git(
    prefix: java.lang.String,
    command: js.Any,
    postfix: java.lang.String,
    options: js.Any,
    args: js.Any,
    callback: js.Function2[/* error */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def cat_file(`type`: js.Any, ref: js.Any, callback: js.Function): scala.Unit = js.native
  // not implemented!
  def clone(options: js.Any, originalPath: js.Any, targetPath: js.Any, callback: js.Function): scala.Unit = js.native
  def commit(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def commit(options: js.Any, args: js.Any*): scala.Unit = js.native
   // last element is callback
  def commit_from_sha(id: java.lang.String): js.Any = js.native
   // last element is callback
  def config(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def config(options: js.Any, args: js.Any*): scala.Unit = js.native
  def diff(
    commit1: js.Any,
    commit2: js.Any,
    callback: js.Function2[/* error */ js.Any, /* patch */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def diff(
    commit1: js.Any,
    commit2: js.Any,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* patch */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
   // last element is callback
  def diff_files(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def diff_files(options: js.Any, args: js.Any*): scala.Unit = js.native
   // last element is callback
  def diff_index(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def diff_index(options: js.Any, args: js.Any*): scala.Unit = js.native
  def file_size(ref: js.Any, callback: js.Function): scala.Unit = js.native
   // last element is callback
  def file_type(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def file_type(options: js.Any, args: js.Any*): scala.Unit = js.native
  def format_patch(options: js.Any, reference: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_exist(path: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_mkdir(dir: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_read(
    gitDirectory: java.lang.String,
    file: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def fs_write(file: js.Any, content: js.Any, callback: js.Function): scala.Unit = js.native
  def git(functionName: js.Any, options: js.Any, args: js.Any*): scala.Unit = js.native
  def init(options: js.Any, callback: js.Function): scala.Unit = js.native
  def log(commit: js.Any, path: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
  def looking_for(commit: js.Any, callback: js.Function): scala.Unit = js.native
  def looking_for(commit: js.Any, path: js.Any, callback: js.Function): scala.Unit = js.native
   // last element is callback
  def ls_files(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def ls_files(options: js.Any, args: js.Any*): scala.Unit = js.native
  def ls_tree(treeish: js.Any, callback: js.Function): scala.Unit = js.native
  def ls_tree(treeish: js.Any, paths: js.Array[_], callback: js.Function): scala.Unit = js.native
  def ls_tree(treeish: js.Any, paths: js.Array[_], options: js.Any, callback: js.Function): scala.Unit = js.native
   // last element is callback
  def put_raw_object(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def put_raw_object(options: js.Any, args: js.Any*): scala.Unit = js.native
  def refs(
    options: js.Any,
    prefix: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
   // last element is callback
  def remove(args: js.Any*): scala.Unit = js.native
   // last element is callback
  def remove(options: js.Any, args: js.Any*): scala.Unit = js.native
  def rev_list(callback: js.Function): scala.Unit = js.native
  def rev_list(options: js.Any, callback: js.Function): scala.Unit = js.native
  def rev_list(options: js.Any, reference: java.lang.String, callback: js.Function): scala.Unit = js.native
  def rev_parse(options: js.Any, str: java.lang.String, callback: js.Function): scala.Unit = js.native
  def rev_parse(options: js.Any, str: java.lang.String, level: scala.Double, callback: js.Function): scala.Unit = js.native
  def select_existing_objects(objectIds: js.Array[_], callback: js.Function): scala.Unit = js.native
  def transform_options(options: js.Any): js.Array[java.lang.String] = js.native
}

