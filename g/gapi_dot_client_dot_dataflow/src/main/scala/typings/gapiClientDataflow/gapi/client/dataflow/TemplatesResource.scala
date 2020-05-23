package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataflow.anon.GcsPath
import typings.gapiClientDataflow.anon.QuotaUser
import typings.gapiClientDataflow.anon.UploadType
import typings.gapiClientDataflow.anon.Uploadprotocol
import typings.gapiClientDataflow.anon.ValidateOnly
import typings.gapiClientDataflow.anon.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: QuotaUser): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: Uploadprotocol): Request[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: GcsPath): Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: View): Request[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: UploadType): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: ValidateOnly): Request[LaunchTemplateResponse] = js.native
}

