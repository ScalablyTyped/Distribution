package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  val sanitize: expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  val sanitizeBody: expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  val sanitizeCookie: expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  val sanitizeParam: expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  val sanitizeQuery: expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  def buildSanitizeFunction(location: js.Array[expressDashValidatorLib.checkLocationMod.Location]): expressDashValidatorLib.filterSanitizationDashChainDashBuildersMod.SanitizationChainBuilder = js.native
  def matchedData(req: expressLib.expressMod.Request): stdLib.Record[java.lang.String, _] = js.native
  def matchedData(
    req: expressLib.expressMod.Request,
    options: stdLib.Partial[expressDashValidatorLib.filterMatchedDashDataMod.MatchedDataOptions]
  ): stdLib.Record[java.lang.String, _] = js.native
}

