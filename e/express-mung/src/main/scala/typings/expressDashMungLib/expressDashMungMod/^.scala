package typings
package expressDashMungLib.expressDashMungMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def headers(fn: TransformHeader): expressLib.expressMod.eNs.RequestHandler = js.native
  def headersAsync(fn: TransformHeaderAsync): expressLib.expressMod.eNs.RequestHandler = js.native
  def json(fn: Transform): expressLib.expressMod.eNs.RequestHandler = js.native
  def json(fn: Transform, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  def jsonAsync(fn: TransformAsync): expressLib.expressMod.eNs.RequestHandler = js.native
  def jsonAsync(fn: TransformAsync, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
  def write(fn: TransformChunk): expressLib.expressMod.eNs.RequestHandler = js.native
  def write(fn: TransformChunk, options: Options): expressLib.expressMod.eNs.RequestHandler = js.native
}

