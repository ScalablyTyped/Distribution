package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcMatchedDashDataMod.MatchedDataOptions
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.SanitizationChain */ _
  ] = js.native
  def matchedData(req: Request): Record[String, _] = js.native
  def matchedData(req: Request, options: Partial[MatchedDataOptions]): Record[String, _] = js.native
  def sanitize(): js.Any = js.native
  def sanitize(fields: String): js.Any = js.native
  def sanitize(fields: js.Array[String]): js.Any = js.native
  def sanitizeBody(): js.Any = js.native
  def sanitizeBody(fields: String): js.Any = js.native
  def sanitizeBody(fields: js.Array[String]): js.Any = js.native
  def sanitizeCookie(): js.Any = js.native
  def sanitizeCookie(fields: String): js.Any = js.native
  def sanitizeCookie(fields: js.Array[String]): js.Any = js.native
  def sanitizeParam(): js.Any = js.native
  def sanitizeParam(fields: String): js.Any = js.native
  def sanitizeParam(fields: js.Array[String]): js.Any = js.native
  def sanitizeQuery(): js.Any = js.native
  def sanitizeQuery(fields: String): js.Any = js.native
  def sanitizeQuery(fields: js.Array[String]): js.Any = js.native
}

