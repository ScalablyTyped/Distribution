package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val gitignore: Gitignore = js.native
  def default(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: java.lang.String, options: GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def generateGlobTasks(patterns: java.lang.String): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: java.lang.String, options: GlobbyOptions): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String]): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Array[GlobTask] = js.native
  def hasMagic(patterns: java.lang.String): scala.Boolean = js.native
  def hasMagic(patterns: java.lang.String, options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String], options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: GlobbyOptions): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Array[java.lang.String] = js.native
}

