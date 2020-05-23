package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.Key
import typings.gapiClientFusiontables.anon.TemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: TemplateId): Request[Unit]
  /** Retrieves a specific template by its id */
  def get(request: TemplateId): Request[Template]
  /** Creates a new template for the table. */
  def insert(request: Fields): Request[Template]
  /** Retrieves a list of templates. */
  def list(request: Key): Request[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: TemplateId): Request[Template]
  /** Updates an existing template */
  def update(request: TemplateId): Request[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: TemplateId => Request[Unit],
    get: TemplateId => Request[Template],
    insert: Fields => Request[Template],
    list: Key => Request[TemplateList],
    patch: TemplateId => Request[Template],
    update: TemplateId => Request[Template]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TemplateResource]
  }
}

