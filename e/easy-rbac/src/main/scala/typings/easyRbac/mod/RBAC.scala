package typings.easyRbac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RBAC extends js.Object {
  
  def can(role: String, operation: String): js.Promise[Boolean] = js.native
  def can(role: String, operation: String, params: js.Object): js.Promise[Boolean] = js.native
  def can(role: js.Array[Roles | String], operation: String): js.Promise[Boolean] = js.native
  def can(role: js.Array[Roles | String], operation: String, params: js.Object): js.Promise[Boolean] = js.native
}
