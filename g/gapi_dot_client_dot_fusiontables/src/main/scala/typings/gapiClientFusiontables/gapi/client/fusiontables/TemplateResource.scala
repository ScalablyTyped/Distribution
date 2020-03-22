package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonFields
import typings.gapiClientFusiontables.AnonKey
import typings.gapiClientFusiontables.AnonTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: AnonTemplateId): Request_[Unit]
  /** Retrieves a specific template by its id */
  def get(request: AnonTemplateId): Request_[Template]
  /** Creates a new template for the table. */
  def insert(request: AnonFields): Request_[Template]
  /** Retrieves a list of templates. */
  def list(request: AnonKey): Request_[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: AnonTemplateId): Request_[Template]
  /** Updates an existing template */
  def update(request: AnonTemplateId): Request_[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: AnonTemplateId => Request_[Unit],
    get: AnonTemplateId => Request_[Template],
    insert: AnonFields => Request_[Template],
    list: AnonKey => Request_[TemplateList],
    patch: AnonTemplateId => Request_[Template],
    update: AnonTemplateId => Request_[Template]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TemplateResource]
  }
}

