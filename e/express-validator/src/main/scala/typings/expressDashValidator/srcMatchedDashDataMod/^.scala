package typings.expressDashValidator.srcMatchedDashDataMod

import typings.expressDashValidator.srcBaseMod.Request
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/matched-data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchedData(req: Request): Record[String, _] = js.native
  def matchedData(req: Request, options: Partial[MatchedDataOptions]): Record[String, _] = js.native
}

