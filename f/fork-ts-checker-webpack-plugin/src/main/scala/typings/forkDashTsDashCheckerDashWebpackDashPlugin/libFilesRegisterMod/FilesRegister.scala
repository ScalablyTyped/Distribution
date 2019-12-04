package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libFilesRegisterMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/FilesRegister", "FilesRegister")
@js.native
class FilesRegister protected () extends js.Object {
  def this(dataFactory: js.Function1[/* _data */ js.UndefOr[DataShape], DataShape]) = this()
  var dataFactory: js.Any = js.native
  var files: js.Any = js.native
  def add(filePath: String): Unit = js.native
  def ensure(filePath: String): Unit = js.native
  def get(filePath: String): Anon_Data = js.native
  def getData(filePath: String): DataShape = js.native
  def getMtime(filePath: String): js.UndefOr[Double] = js.native
  def has(filePath: String): Boolean = js.native
  def keys(): js.Array[String] = js.native
  def mutateData(filePath: String, mutator: js.Function1[/* data */ DataShape, Unit]): Unit = js.native
  def remove(filePath: String): Unit = js.native
  def setMtime(filePath: String, mtime: Double): Unit = js.native
}

