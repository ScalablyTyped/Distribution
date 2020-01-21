package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAltFieldsKey
import typings.gapiClientTagmanager.AnonAltFieldsKeyOauthtoken
import typings.gapiClientTagmanager.AnonAltFieldsKeyOauthtokenPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: AnonAltFieldsKeyOauthtoken): Request_[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: AnonAltFieldsKeyOauthtokenPath): Request_[Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: AnonAltFieldsKey): Request_[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: AnonAltFieldsKeyOauthtokenPath): Request_[RevertBuiltInVariableResponse]
}

object BuiltInVariablesResource {
  @scala.inline
  def apply(
    create: AnonAltFieldsKeyOauthtoken => Request_[CreateBuiltInVariableResponse],
    delete: AnonAltFieldsKeyOauthtokenPath => Request_[Unit],
    list: AnonAltFieldsKey => Request_[ListEnabledBuiltInVariablesResponse],
    revert: AnonAltFieldsKeyOauthtokenPath => Request_[RevertBuiltInVariableResponse]
  ): BuiltInVariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
  
    __obj.asInstanceOf[BuiltInVariablesResource]
  }
}

