package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFusiontables.Anon_AltFields
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKey
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request[Unit]
  /** Retrieves a specific template by its id */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request[Template]
  /** Creates a new template for the table. */
  def insert(request: Anon_AltFields): Request[Template]
  /** Retrieves a list of templates. */
  def list(request: Anon_AltFieldsKey): Request[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request[Template]
  /** Updates an existing template */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId): Request[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request[Template],
    insert: Anon_AltFields => Request[Template],
    list: Anon_AltFieldsKey => Request[TemplateList],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request[Template],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId => Request[Template]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TemplateResource]
  }
}

