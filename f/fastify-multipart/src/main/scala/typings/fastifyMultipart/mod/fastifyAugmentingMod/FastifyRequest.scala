package typings.fastifyMultipart.mod.fastifyAugmentingMod

import typings.busboy.busboy.Busboy
import typings.busboy.busboy.BusboyConfig
import typings.fastifyMultipart.fastifyMultipartBooleans.`true`
import typings.fastifyMultipart.mod.Multipart
import typings.fastifyMultipart.mod.MultipartHandler
import typings.std.AsyncIterableIterator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyRequest extends js.Object {
  
  def cleanRequestFiles(): js.Promise[Unit] = js.native
  
  // Stream mode
  def file(): js.Promise[Multipart[`true`]] = js.native
  def file(options: BusboyConfig): js.Promise[Multipart[`true`]] = js.native
  
  def files(): AsyncIterableIterator[Multipart[`true`]] = js.native
  def files(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
  
  def isMultipart(): Boolean = js.native
  
  // legacy
  def multipart(handler: MultipartHandler, next: js.Function1[/* err */ Error, Unit]): Busboy = js.native
  def multipart(handler: MultipartHandler, next: js.Function1[/* err */ Error, Unit], options: BusboyConfig): Busboy = js.native
  
  // promise api
  def multipartIterator(): AsyncIterableIterator[Multipart[`true`]] = js.native
  def multipartIterator(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
  
  def parts(): AsyncIterableIterator[Multipart[`true`]] = js.native
  def parts(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
  
  // Disk mode
  def saveRequestFiles(): js.Promise[js.Array[Multipart[`true`]]] = js.native
  def saveRequestFiles(options: BusboyConfig): js.Promise[js.Array[Multipart[`true`]]] = js.native
  
  var tmpUploads: js.Array[Multipart[`true`]] = js.native
}
