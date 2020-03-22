package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonGcsPath
import typings.gapiClientDataflow.AnonQuotaUser
import typings.gapiClientDataflow.AnonUploadType
import typings.gapiClientDataflow.AnonUploadprotocol
import typings.gapiClientDataflow.AnonValidateOnly
import typings.gapiClientDataflow.AnonView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonQuotaUser): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonUploadprotocol): Request_[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonGcsPath): Request_[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonView): Request_[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonUploadType): Request_[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonValidateOnly): Request_[LaunchTemplateResponse] = js.native
}

