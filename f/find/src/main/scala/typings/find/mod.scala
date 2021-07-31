package typings.find

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dir(pattern: String, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  @scala.inline
  def dir(pattern: RegExp, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  @scala.inline
  def dir(root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  
  @scala.inline
  def dirSync(pattern: String, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def dirSync(pattern: RegExp, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def dirSync(root: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def eachdir(pattern: String, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachdir")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  @scala.inline
  def eachdir(pattern: RegExp, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachdir")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  @scala.inline
  def eachdir(root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachdir")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  
  @scala.inline
  def eachfile(pattern: String, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachfile")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  @scala.inline
  def eachfile(pattern: RegExp, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachfile")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  @scala.inline
  def eachfile(root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = (^.asInstanceOf[js.Dynamic].applyDynamic("eachfile")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FindEachStream]
  
  @scala.inline
  def file(pattern: String, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  @scala.inline
  def file(pattern: RegExp, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  @scala.inline
  def file(root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncFindStream]
  
  @scala.inline
  def fileSync(pattern: String, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def fileSync(pattern: RegExp, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def fileSync(root: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @js.native
  trait AsyncFindStream extends StObject {
    
    /**
      * Handling errors in asynchronous interfaces.
      * @param callback The callback that is called upon an error
      */
    def error(callback: js.Function0[Unit]): Unit = js.native
    def error(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait FindEachStream extends StObject {
    
    /**
      * Detect end in find.eachfile and find.eachdir.
      * @param callback The callback called at the end of find.eachfile and find.eachdir
      */
    def end(callback: js.Function0[Unit]): FindEachStream = js.native
    
    /**
      * Handling errors in asynchronous interfaces.
      * @param callback The callback that is called upon an error
      */
    def error(callback: js.Function0[Unit]): FindEachStream = js.native
    def error(callback: js.Function1[/* err */ Error, Unit]): FindEachStream = js.native
  }
}
