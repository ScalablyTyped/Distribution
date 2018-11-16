package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: gapiDotClientDotDataflowLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintGcsPath): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintGcsPathBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: gapiDotClientDotDataflowLib.Anon_ValidateOnly): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: gapiDotClientDotDataflowLib.Anon_ValidateOnlyAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
}

