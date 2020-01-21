package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonAltFields
import typings.gapiClientFusiontables.AnonAltFieldsKey
import typings.gapiClientFusiontables.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request_[Unit]
  /** Retrieves a specific template by its id */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request_[Template]
  /** Creates a new template for the table. */
  def insert(request: AnonAltFields): Request_[Template]
  /** Retrieves a list of templates. */
  def list(request: AnonAltFieldsKey): Request_[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request_[Template]
  /** Updates an existing template */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request_[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request_[Template],
    insert: AnonAltFields => Request_[Template],
    list: AnonAltFieldsKey => Request_[TemplateList],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request_[Template],
    update: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request_[Template]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TemplateResource]
  }
}

