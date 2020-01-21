package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsGcsPath
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKey
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsGcsPath): Request_[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation): Request_[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKey): Request_[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken): Request_[LaunchTemplateResponse] = js.native
}

