package typings
package findLib.findMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dir(
    pattern: java.lang.String,
    root: java.lang.String,
    callback: js.Function1[/* directories */ js.Array[java.lang.String], scala.Unit]
  ): AsyncFindStream = js.native
  def dir(
    pattern: stdLib.RegExp,
    root: java.lang.String,
    callback: js.Function1[/* directories */ js.Array[java.lang.String], scala.Unit]
  ): AsyncFindStream = js.native
  def dir(
    root: java.lang.String,
    callback: js.Function1[/* directories */ js.Array[java.lang.String], scala.Unit]
  ): AsyncFindStream = js.native
  def dirSync(pattern: java.lang.String, root: java.lang.String): js.Array[java.lang.String] = js.native
  def dirSync(pattern: stdLib.RegExp, root: java.lang.String): js.Array[java.lang.String] = js.native
  def dirSync(root: java.lang.String): js.Array[java.lang.String] = js.native
  def eachdir(
    pattern: java.lang.String,
    root: java.lang.String,
    callback: js.Function1[/* directory */ java.lang.String, scala.Unit]
  ): FindEachStream = js.native
  def eachdir(
    pattern: stdLib.RegExp,
    root: java.lang.String,
    callback: js.Function1[/* directory */ java.lang.String, scala.Unit]
  ): FindEachStream = js.native
  def eachdir(root: java.lang.String, callback: js.Function1[/* directory */ java.lang.String, scala.Unit]): FindEachStream = js.native
  def eachfile(
    pattern: java.lang.String,
    root: java.lang.String,
    callback: js.Function1[/* file */ java.lang.String, scala.Unit]
  ): FindEachStream = js.native
  def eachfile(
    pattern: stdLib.RegExp,
    root: java.lang.String,
    callback: js.Function1[/* file */ java.lang.String, scala.Unit]
  ): FindEachStream = js.native
  def eachfile(root: java.lang.String, callback: js.Function1[/* file */ java.lang.String, scala.Unit]): FindEachStream = js.native
  def file(
    pattern: java.lang.String,
    root: java.lang.String,
    callback: js.Function1[/* files */ js.Array[java.lang.String], scala.Unit]
  ): AsyncFindStream = js.native
  def file(
    pattern: stdLib.RegExp,
    root: java.lang.String,
    callback: js.Function1[/* files */ js.Array[java.lang.String], scala.Unit]
  ): AsyncFindStream = js.native
  def file(root: java.lang.String, callback: js.Function1[/* files */ js.Array[java.lang.String], scala.Unit]): AsyncFindStream = js.native
  def fileSync(pattern: java.lang.String, root: java.lang.String): js.Array[java.lang.String] = js.native
  def fileSync(pattern: stdLib.RegExp, root: java.lang.String): js.Array[java.lang.String] = js.native
  def fileSync(root: java.lang.String): js.Array[java.lang.String] = js.native
}

