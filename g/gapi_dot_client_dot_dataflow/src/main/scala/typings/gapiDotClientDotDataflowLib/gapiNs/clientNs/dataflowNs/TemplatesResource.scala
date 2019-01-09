package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPath): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation
  ): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKey): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
}

