package typings
package eggDashMultipartLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * clean up request tmp files helper
    * @param {EggFile[]} files file paths need to clenup, default is `ctx.request.files`.
    * @return {Promise<void>}
    */
  def cleanupRequestFiles(): js.Promise[scala.Unit] = js.native
  def cleanupRequestFiles(files: js.Array[eggDashMultipartLib.EggFile]): js.Promise[scala.Unit] = js.native
  /**
    * get upload file stream
    * @param {MultipartOptions} options
    * @return {Promise<MultipartFileStream>}
    */
  def getFileStream(): js.Promise[eggDashMultipartLib.MultipartFileStream] = js.native
  def getFileStream(options: eggDashMultipartLib.MultipartOptions): js.Promise[eggDashMultipartLib.MultipartFileStream] = js.native
  /**
    * create multipart.parts instance, to get separated files.
    * @param {MultipartOptions} options
    * @return {Function} return a function which return a Promise
    */
  def multipart(): js.Function1[/* fn */ js.UndefOr[js.Function], js.Promise[_]] = js.native
  def multipart(options: eggDashMultipartLib.MultipartOptions): js.Function1[/* fn */ js.UndefOr[js.Function], js.Promise[_]] = js.native
  /**
    * save request multipart data and files to `ctx.request`
    * @return {Promise<void>}
    */
  def saveRequestFiles(): js.Promise[scala.Unit] = js.native
}

