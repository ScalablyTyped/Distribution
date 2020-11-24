package typings.find

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("find", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def dir(pattern: String, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  def dir(pattern: RegExp, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  def dir(root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  
  def dirSync(pattern: String, root: String): js.Array[String] = js.native
  def dirSync(pattern: RegExp, root: String): js.Array[String] = js.native
  def dirSync(root: String): js.Array[String] = js.native
  
  def eachdir(pattern: String, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  def eachdir(pattern: RegExp, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  def eachdir(root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  
  def eachfile(pattern: String, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  def eachfile(pattern: RegExp, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  def eachfile(root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  
  def file(pattern: String, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  def file(pattern: RegExp, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  def file(root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  
  def fileSync(pattern: String, root: String): js.Array[String] = js.native
  def fileSync(pattern: RegExp, root: String): js.Array[String] = js.native
  def fileSync(root: String): js.Array[String] = js.native
  
  @js.native
  trait AsyncFindStream extends js.Object {
    
    /**
      * Handling errors in asynchronous interfaces.
      * @param callback The callback that is called upon an error
      */
    def error(callback: js.Function0[Unit]): Unit = js.native
    def error(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait FindEachStream extends js.Object {
    
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
