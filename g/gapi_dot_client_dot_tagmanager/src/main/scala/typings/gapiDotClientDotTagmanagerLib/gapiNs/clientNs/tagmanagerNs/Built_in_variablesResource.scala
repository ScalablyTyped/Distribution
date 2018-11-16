package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Built_in_variablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_PathPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_PathPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[RevertBuiltInVariableResponse]
}

