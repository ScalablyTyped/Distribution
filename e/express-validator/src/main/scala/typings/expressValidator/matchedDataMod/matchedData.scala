package typings.expressValidator.matchedDataMod

import typings.expressValidator.PartialMatchedDataOptions
import typings.expressValidator.baseMod.Request
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/matched-data", "matchedData")
@js.native
object matchedData extends js.Object {
  def apply(req: Request): Record[String, _] = js.native
  def apply(req: Request, options: PartialMatchedDataOptions): Record[String, _] = js.native
}

