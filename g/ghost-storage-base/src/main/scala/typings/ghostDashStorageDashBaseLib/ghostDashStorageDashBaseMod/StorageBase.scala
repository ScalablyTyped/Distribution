package typings
package ghostDashStorageDashBaseLib.ghostDashStorageDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ghost-storage-base", "StorageBase")
@js.native
abstract class StorageBase () extends js.Object {
  def delete(fileName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def delete(fileName: java.lang.String, targetDir: java.lang.String): js.Promise[scala.Boolean] = js.native
  def exists(fileName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def exists(fileName: java.lang.String, targetDir: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getSanitizedFileName(fileName: java.lang.String): java.lang.String = js.native
  def getTargetDir(): java.lang.String = js.native
  def getTargetDir(baseDir: java.lang.String): java.lang.String = js.native
  def getUniqueFileName(image: Image, targetDir: java.lang.String): java.lang.String = js.native
  def read(): js.Promise[nodeLib.Buffer] = js.native
  def read(options: ReadOptions): js.Promise[nodeLib.Buffer] = js.native
  def save(image: Image): js.Promise[java.lang.String] = js.native
  def save(image: Image, targetDir: java.lang.String): js.Promise[java.lang.String] = js.native
  def serve(): expressLib.expressMod.Handler = js.native
}

