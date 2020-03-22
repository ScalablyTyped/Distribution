package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonKey
import typings.gapiClientTagmanager.AnonOauthtoken
import typings.gapiClientTagmanager.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: AnonOauthtoken): Request_[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: AnonPath): Request_[Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: AnonKey): Request_[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: AnonPath): Request_[RevertBuiltInVariableResponse]
}

object BuiltInVariablesResource {
  @scala.inline
  def apply(
    create: AnonOauthtoken => Request_[CreateBuiltInVariableResponse],
    delete: AnonPath => Request_[Unit],
    list: AnonKey => Request_[ListEnabledBuiltInVariablesResponse],
    revert: AnonPath => Request_[RevertBuiltInVariableResponse]
  ): BuiltInVariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
  
    __obj.asInstanceOf[BuiltInVariablesResource]
  }
}

