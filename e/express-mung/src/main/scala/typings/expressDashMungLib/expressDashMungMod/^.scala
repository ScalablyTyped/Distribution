package typings
package expressDashMungLib.expressDashMungMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def headers(fn: expressDashMungLib.expressDashMungMod.TransformHeader): expressLib.expressMod.eNs.RequestHandler = js.native
  def headersAsync(fn: expressDashMungLib.expressDashMungMod.TransformHeaderAsync): expressLib.expressMod.eNs.RequestHandler = js.native
  def json(fn: expressDashMungLib.expressDashMungMod.Transform): expressLib.expressMod.eNs.RequestHandler = js.native
  def json(
    fn: expressDashMungLib.expressDashMungMod.Transform,
    options: expressDashMungLib.expressDashMungMod.Options
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def jsonAsync(fn: expressDashMungLib.expressDashMungMod.TransformAsync): expressLib.expressMod.eNs.RequestHandler = js.native
  def jsonAsync(
    fn: expressDashMungLib.expressDashMungMod.TransformAsync,
    options: expressDashMungLib.expressDashMungMod.Options
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def write(fn: expressDashMungLib.expressDashMungMod.TransformChunk): expressLib.expressMod.eNs.RequestHandler = js.native
  def write(
    fn: expressDashMungLib.expressDashMungMod.TransformChunk,
    options: expressDashMungLib.expressDashMungMod.Options
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

