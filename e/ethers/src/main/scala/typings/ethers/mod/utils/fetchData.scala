package typings.ethers.mod.utils

import typings.ethersprojectWeb.mod.ConnectionInfo
import typings.ethersprojectWeb.mod.FetchJsonResponse
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "utils._fetchData")
@js.native
object fetchData extends js.Object {
  
  def apply[T](connection: String): js.Promise[T] = js.native
  def apply[T](
    connection: String,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: String, body: Uint8Array): js.Promise[T] = js.native
  def apply[T](
    connection: String,
    body: Uint8Array,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: ConnectionInfo): js.Promise[T] = js.native
  def apply[T](
    connection: ConnectionInfo,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: ConnectionInfo, body: Uint8Array): js.Promise[T] = js.native
  def apply[T](
    connection: ConnectionInfo,
    body: Uint8Array,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
}
