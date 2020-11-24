package typings.ethers.utilsMod

import typings.ethersprojectWeb.mod.ConnectionInfo
import typings.ethersprojectWeb.mod.FetchJsonResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "fetchJson")
@js.native
object fetchJson extends js.Object {
  
  def apply(connection: String): js.Promise[_] = js.native
  def apply(
    connection: String,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def apply(connection: String, json: String): js.Promise[_] = js.native
  def apply(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def apply(connection: ConnectionInfo): js.Promise[_] = js.native
  def apply(
    connection: ConnectionInfo,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def apply(connection: ConnectionInfo, json: String): js.Promise[_] = js.native
  def apply(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
}
