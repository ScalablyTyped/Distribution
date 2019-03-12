package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Built_in_variablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPath): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPath): gapiDotClientLib.gapiNs.clientNs.Request[RevertBuiltInVariableResponse]
}

object Built_in_variablesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[CreateBuiltInVariableResponse],
    delete: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPath => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    list: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListEnabledBuiltInVariablesResponse],
    revert: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPath => gapiDotClientLib.gapiNs.clientNs.Request[RevertBuiltInVariableResponse]
  ): Built_in_variablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
  
    __obj.asInstanceOf[Built_in_variablesResource]
  }
}

