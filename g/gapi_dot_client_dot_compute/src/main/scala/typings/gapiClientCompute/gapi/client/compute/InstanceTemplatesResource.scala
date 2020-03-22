package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonFieldsInstanceTemplate
import typings.gapiClientCompute.AnonInstanceTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTemplatesResource extends js.Object {
  /**
    * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group
    * will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
    */
  def delete(request: AnonInstanceTemplate): Request_[Operation]
  /** Returns the specified instance template. Get a list of available instance templates by making a list() request. */
  def get(request: AnonFieldsInstanceTemplate): Request_[InstanceTemplate]
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an
    * existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of instance templates that are contained within the specified project and zone. */
  def list(request: AnonAlt): Request_[InstanceTemplateList]
}

object InstanceTemplatesResource {
  @scala.inline
  def apply(
    delete: AnonInstanceTemplate => Request_[Operation],
    get: AnonFieldsInstanceTemplate => Request_[InstanceTemplate],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[InstanceTemplateList]
  ): InstanceTemplatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InstanceTemplatesResource]
  }
}

