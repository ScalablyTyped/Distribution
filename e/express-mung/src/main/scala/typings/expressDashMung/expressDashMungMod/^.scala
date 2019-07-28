package typings.expressDashMung.expressDashMungMod

import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var onError: ErrorRequestHandler = js.native
  def headers(fn: TransformHeader): RequestHandler = js.native
  def headersAsync(fn: TransformHeaderAsync): RequestHandler = js.native
  def json(fn: Transform): RequestHandler = js.native
  def json(fn: Transform, options: Options): RequestHandler = js.native
  def jsonAsync(fn: TransformAsync): RequestHandler = js.native
  def jsonAsync(fn: TransformAsync, options: Options): RequestHandler = js.native
  def write(fn: TransformChunk): RequestHandler = js.native
  def write(fn: TransformChunk, options: Options): RequestHandler = js.native
}

