package typings.ghostStorageBase.mod

import typings.express.mod.Handler
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageBase extends js.Object {
  
  def delete(fileName: String): js.Promise[Boolean] = js.native
  def delete(fileName: String, targetDir: String): js.Promise[Boolean] = js.native
  
  def exists(fileName: String): js.Promise[Boolean] = js.native
  def exists(fileName: String, targetDir: String): js.Promise[Boolean] = js.native
  
  def getSanitizedFileName(fileName: String): String = js.native
  
  def getTargetDir(): String = js.native
  def getTargetDir(baseDir: String): String = js.native
  
  def getUniqueFileName(image: Image, targetDir: String): String = js.native
  
  def read(): js.Promise[Buffer] = js.native
  def read(options: ReadOptions): js.Promise[Buffer] = js.native
  
  def save(image: Image): js.Promise[String] = js.native
  def save(image: Image, targetDir: String): js.Promise[String] = js.native
  
  def serve(): Handler = js.native
}
