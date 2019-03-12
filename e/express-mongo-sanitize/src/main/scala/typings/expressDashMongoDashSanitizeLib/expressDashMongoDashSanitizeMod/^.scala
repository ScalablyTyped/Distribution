package typings
package expressDashMongoDashSanitizeLib.expressDashMongoDashSanitizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mongo-sanitize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
  def apply(options: MongoSanitizeOptions): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
  def has(payload: js.Any): scala.Boolean = js.native
  def sanitize[T](payload: T): T = js.native
  def sanitize[T](payload: T, options: MongoSanitizeOptions): T = js.native
}

