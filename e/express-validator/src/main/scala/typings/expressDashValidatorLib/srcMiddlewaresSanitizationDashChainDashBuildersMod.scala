package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/sanitization-chain-builders", JSImport.Namespace)
@js.native
object srcMiddlewaresSanitizationDashChainDashBuildersMod extends js.Object {
  def buildSanitizeFunction(locations: js.Array[expressDashValidatorLib.srcBaseMod.Location]): js.Function1[
    /* fields */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_express-validator/src.SanitizationChain */ _
  ] = js.native
  def sanitize(): js.Any = js.native
  def sanitize(fields: java.lang.String): js.Any = js.native
  def sanitize(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeBody(): js.Any = js.native
  def sanitizeBody(fields: java.lang.String): js.Any = js.native
  def sanitizeBody(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeCookie(): js.Any = js.native
  def sanitizeCookie(fields: java.lang.String): js.Any = js.native
  def sanitizeCookie(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeParam(): js.Any = js.native
  def sanitizeParam(fields: java.lang.String): js.Any = js.native
  def sanitizeParam(fields: js.Array[java.lang.String]): js.Any = js.native
  def sanitizeQuery(): js.Any = js.native
  def sanitizeQuery(fields: java.lang.String): js.Any = js.native
  def sanitizeQuery(fields: js.Array[java.lang.String]): js.Any = js.native
}

