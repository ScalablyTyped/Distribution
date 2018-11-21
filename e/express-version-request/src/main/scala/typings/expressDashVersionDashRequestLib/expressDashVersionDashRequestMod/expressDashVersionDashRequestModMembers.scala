package typings
package expressDashVersionDashRequestLib.expressDashVersionDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-version-request", JSImport.Namespace)
@js.native
object expressDashVersionDashRequestModMembers extends js.Object {
  def formatVersion(version: java.lang.String): java.lang.String = js.native
  def formatVersion(version: js.Object): java.lang.String = js.native
  def setVersion(version: java.lang.String): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByAcceptHeader(): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByAcceptHeader(customParsingFunction: CustomParsingFunction): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByHeader(): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByHeader(headerName: java.lang.String): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByQueryParam(): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByQueryParam(queryParam: java.lang.String): expressLib.expressMod.eNs.Handler = js.native
  def setVersionByQueryParam(queryParam: java.lang.String, options: SetVersionByQueryParamOptions): expressLib.expressMod.eNs.Handler = js.native
}

