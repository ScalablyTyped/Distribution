package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsInstanceTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTemplatesResource extends js.Object {
  /**
    * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group
    * will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
    */
  def delete(request: typings.gapiClientCompute.anon.InstanceTemplate): Request[Operation] = js.native
  /** Returns the specified instance template. Get a list of available instance templates by making a list() request. */
  def get(request: FieldsInstanceTemplate): Request[InstanceTemplate] = js.native
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an
    * existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves a list of instance templates that are contained within the specified project and zone. */
  def list(request: Alt): Request[InstanceTemplateList] = js.native
}

object InstanceTemplatesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.InstanceTemplate => Request[Operation],
    get: FieldsInstanceTemplate => Request[InstanceTemplate],
    insert: AltFields => Request[Operation],
    list: Alt => Request[InstanceTemplateList]
  ): InstanceTemplatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InstanceTemplatesResource]
  }
  @scala.inline
  implicit class InstanceTemplatesResourceOps[Self <: InstanceTemplatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.InstanceTemplate => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsInstanceTemplate => Request[InstanceTemplate]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[InstanceTemplateList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

