package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Key
import typings.gapiClientTagmanager.anon.Oauthtoken
import typings.gapiClientTagmanager.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: Oauthtoken): Request[CreateBuiltInVariableResponse] = js.native
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: Path): Request[Unit] = js.native
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: Key): Request[ListEnabledBuiltInVariablesResponse] = js.native
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: Path): Request[RevertBuiltInVariableResponse] = js.native
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
  @scala.inline
  implicit class BuiltInVariablesResourceOps[Self <: BuiltInVariablesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Oauthtoken => Request[CreateBuiltInVariableResponse]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Path => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListEnabledBuiltInVariablesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: Path => Request[RevertBuiltInVariableResponse]): Self = this.set("revert", js.Any.fromFunction1(value))
  }
  
}

