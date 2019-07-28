package typings.expressDashVersionDashRequest.expressDashVersionDashRequestMod

import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-version-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatVersion(version: String): String = js.native
  def formatVersion(version: js.Object): String = js.native
  def setVersion(version: String): Handler = js.native
  def setVersionByAcceptHeader(): Handler = js.native
  def setVersionByAcceptHeader(customParsingFunction: CustomParsingFunction): Handler = js.native
  def setVersionByHeader(): Handler = js.native
  def setVersionByHeader(headerName: String): Handler = js.native
  def setVersionByQueryParam(): Handler = js.native
  def setVersionByQueryParam(queryParam: String): Handler = js.native
  def setVersionByQueryParam(queryParam: String, options: SetVersionByQueryParamOptions): Handler = js.native
}

