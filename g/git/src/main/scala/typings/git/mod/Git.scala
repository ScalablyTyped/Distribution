package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Git")
@js.native
open class Git protected () extends StObject {
  def this(gitDirectory: Any) = this()
  
  // last element is callback
  def add(args: Any*): Unit = js.native
  // last element is callback
  def add(options: Any, args: Any*): Unit = js.native
  
  def blame(callback: js.Function): Unit = js.native
  def blame(options: Any, callback: js.Function): Unit = js.native
  
  def blame_tree(commit: Any, callback: js.Function): Unit = js.native
  def blame_tree(commit: Any, path: Any, callback: js.Function): Unit = js.native
  
  // last element is callback
  def call_git(
    prefix: String,
    command: Any,
    postfix: String,
    options: Any,
    args: Any,
    callback: js.Function2[/* error */ Any, /* result */ String, Unit]
  ): Unit = js.native
  
  def cat_file(`type`: Any, ref: Any, callback: js.Function): Unit = js.native
  
  // not implemented!
  def clone(options: Any, originalPath: Any, targetPath: Any, callback: js.Function): Unit = js.native
  
  def commit(args: Any*): Unit = js.native
  // last element is callback
  def commit(options: Any, args: Any*): Unit = js.native
  
  // last element is callback
  def commit_from_sha(id: String): Any = js.native
  
  // last element is callback
  def config(args: Any*): Unit = js.native
  // last element is callback
  def config(options: Any, args: Any*): Unit = js.native
  
  def diff(commit1: Any, commit2: Any, callback: js.Function2[/* error */ Any, /* patch */ String, Unit]): Unit = js.native
  def diff(
    commit1: Any,
    commit2: Any,
    options: Any,
    callback: js.Function2[/* error */ Any, /* patch */ String, Unit]
  ): Unit = js.native
  
  // last element is callback
  def diff_files(args: Any*): Unit = js.native
  // last element is callback
  def diff_files(options: Any, args: Any*): Unit = js.native
  
  // last element is callback
  def diff_index(args: Any*): Unit = js.native
  // last element is callback
  def diff_index(options: Any, args: Any*): Unit = js.native
  
  def file_size(ref: Any, callback: js.Function): Unit = js.native
  
  // last element is callback
  def file_type(args: Any*): Unit = js.native
  // last element is callback
  def file_type(options: Any, args: Any*): Unit = js.native
  
  def format_patch(options: Any, reference: Any, callback: js.Function): Unit = js.native
  
  def fs_exist(path: Any, callback: js.Function): Unit = js.native
  
  def fs_mkdir(dir: Any, callback: js.Function): Unit = js.native
  
  def fs_read(gitDirectory: String, file: String, callback: js.Function2[/* err */ Any, /* data */ Any, Unit]): Unit = js.native
  
  def fs_write(file: Any, content: Any, callback: js.Function): Unit = js.native
  
  def git(functionName: Any, options: Any, args: Any*): Unit = js.native
  
  def init(options: Any, callback: js.Function): Unit = js.native
  
  def log(commit: Any, path: Any, options: Any, callback: js.Function): Unit = js.native
  
  def looking_for(commit: Any, callback: js.Function): Unit = js.native
  def looking_for(commit: Any, path: Any, callback: js.Function): Unit = js.native
  
  // last element is callback
  def ls_files(args: Any*): Unit = js.native
  // last element is callback
  def ls_files(options: Any, args: Any*): Unit = js.native
  
  def ls_tree(treeish: Any, callback: js.Function): Unit = js.native
  def ls_tree(treeish: Any, paths: js.Array[Any], callback: js.Function): Unit = js.native
  def ls_tree(treeish: Any, paths: js.Array[Any], options: Any, callback: js.Function): Unit = js.native
  
  // last element is callback
  def put_raw_object(args: Any*): Unit = js.native
  // last element is callback
  def put_raw_object(options: Any, args: Any*): Unit = js.native
  
  def refs(options: Any, prefix: String, callback: js.Function2[/* err */ Any, /* data */ String, Unit]): Unit = js.native
  
  // last element is callback
  def remove(args: Any*): Unit = js.native
  // last element is callback
  def remove(options: Any, args: Any*): Unit = js.native
  
  def rev_list(callback: js.Function): Unit = js.native
  def rev_list(options: Any, callback: js.Function): Unit = js.native
  def rev_list(options: Any, reference: String, callback: js.Function): Unit = js.native
  
  def rev_parse(options: Any, str: String, callback: js.Function): Unit = js.native
  def rev_parse(options: Any, str: String, level: Double, callback: js.Function): Unit = js.native
  
  def select_existing_objects(objectIds: js.Array[Any], callback: js.Function): Unit = js.native
  
  def transform_options(options: Any): js.Array[String] = js.native
}
