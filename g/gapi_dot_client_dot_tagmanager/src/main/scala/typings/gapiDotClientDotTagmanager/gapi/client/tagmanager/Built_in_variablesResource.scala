package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKeyOauthtokenPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Built_in_variablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: Anon_AltFieldsKeyOauthtoken): Request[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPath): Request[Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: Anon_AltFieldsKey): Request[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: Anon_AltFieldsKeyOauthtokenPath): Request[RevertBuiltInVariableResponse]
}

object Built_in_variablesResource {
  @scala.inline
  def apply(
    create: Anon_AltFieldsKeyOauthtoken => Request[CreateBuiltInVariableResponse],
    delete: Anon_AltFieldsKeyOauthtokenPath => Request[Unit],
    list: Anon_AltFieldsKey => Request[ListEnabledBuiltInVariablesResponse],
    revert: Anon_AltFieldsKeyOauthtokenPath => Request[RevertBuiltInVariableResponse]
  ): Built_in_variablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
  
    __obj.asInstanceOf[Built_in_variablesResource]
  }
}

