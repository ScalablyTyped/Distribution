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

