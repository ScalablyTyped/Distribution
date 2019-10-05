package typings.expressDashMongoDashSanitize.expressDashMongoDashSanitizeMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mongo-sanitize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(options: MongoSanitizeOptions): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

