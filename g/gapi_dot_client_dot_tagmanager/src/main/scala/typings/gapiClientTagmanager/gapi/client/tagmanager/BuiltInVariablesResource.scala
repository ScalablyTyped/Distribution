package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Key
import typings.gapiClientTagmanager.anon.Oauthtoken
import typings.gapiClientTagmanager.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: Oauthtoken): Request[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: Path): Request[Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: Key): Request[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: Path): Request[RevertBuiltInVariableResponse]
}

object BuiltInVariablesResource {
  @scala.inline
  def apply(
    create: Oauthtoken => Request[CreateBuiltInVariableResponse],
    delete: Path => Request[Unit],
    list: Key => Request[ListEnabledBuiltInVariablesResponse],
    revert: Path => Request[RevertBuiltInVariableResponse]
  ): BuiltInVariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
    __obj.asInstanceOf[BuiltInVariablesResource]
  }
}

