package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  /** When set to true, allows multiple selection of resource names, thus creating multiple instances of same appointment for the selected resources.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  /** It holds the name of the resource field to be bound to the Schedule appointments that contains the resource Id.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.native
  
  /** A unique resource name that is used for differentiating various resource objects while grouping it in various levels.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  
  /** It holds the field names of the resources to be bound to the Schedule and also the dataSource.
    */
  var resourceSettings: js.UndefOr[ResourcesResourceSettings] = js.native
  
  /** It holds the title name of the resource field to be displayed on the Schedule appointment window.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceSettings(value: ResourcesResourceSettings): Self = this.set("resourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSettings: Self = this.set("resourceSettings", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
