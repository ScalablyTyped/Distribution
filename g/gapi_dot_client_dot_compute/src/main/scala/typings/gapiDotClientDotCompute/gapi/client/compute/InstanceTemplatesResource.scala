package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceTemplate
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceTemplateKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTemplatesResource extends js.Object {
  /**
    * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group
    * will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
    */
  def delete(request: Anon_AltFieldsInstanceTemplate): Request[Operation]
  /** Returns the specified instance template. Get a list of available instance templates by making a list() request. */
  def get(request: Anon_AltFieldsInstanceTemplateKey): Request[InstanceTemplate]
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an
    * existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves a list of instance templates that are contained within the specified project and zone. */
  def list(request: Anon_Alt): Request[InstanceTemplateList]
}

object InstanceTemplatesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsInstanceTemplate => Request[Operation],
    get: Anon_AltFieldsInstanceTemplateKey => Request[InstanceTemplate],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[InstanceTemplateList]
  ): InstanceTemplatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InstanceTemplatesResource]
  }
}

