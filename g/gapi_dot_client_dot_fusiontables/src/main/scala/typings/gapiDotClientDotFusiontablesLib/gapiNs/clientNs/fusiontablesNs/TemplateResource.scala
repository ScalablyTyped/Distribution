package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(
    request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific template by its id */
  def get(
    request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Template]
  /** Creates a new template for the table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Template]
  /** Retrieves a list of templates. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TemplateList]
  /** Updates an existing template. This method supports patch semantics. */
  def patch(
    request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Template]
  /** Updates an existing template */
  def update(
    request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Template]
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Template]
    ],
    insert: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Template]
    ],
    list: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TemplateList]
    ],
    patch: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Template]
    ],
    update: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserTableIdTemplateId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Template]
    ]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TemplateResource]
  }
}

