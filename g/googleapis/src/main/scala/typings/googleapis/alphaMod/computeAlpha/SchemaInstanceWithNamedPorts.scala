package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceWithNamedPorts extends js.Object {
  
  /**
    * [Output Only] The URL of the instance.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The named ports that belong to this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.native
  
  /**
    * [Output Only] The status of the instance.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaInstanceWithNamedPorts {
  
  @scala.inline
  def apply(): SchemaInstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceWithNamedPorts]
  }
  
  @scala.inline
  implicit class SchemaInstanceWithNamedPortsOps[Self <: SchemaInstanceWithNamedPorts] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setNamedPortsVarargs(value: SchemaNamedPort*): Self = this.set("namedPorts", js.Array(value :_*))
    
    @scala.inline
    def setNamedPorts(value: js.Array[SchemaNamedPort]): Self = this.set("namedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedPorts: Self = this.set("namedPorts", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
