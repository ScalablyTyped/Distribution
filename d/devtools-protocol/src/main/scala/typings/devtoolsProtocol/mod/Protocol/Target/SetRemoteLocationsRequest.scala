package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRemoteLocationsRequest extends js.Object {
  
  /**
    * List of remote locations.
    */
  var locations: js.Array[RemoteLocation] = js.native
}
object SetRemoteLocationsRequest {
  
  @scala.inline
  def apply(locations: js.Array[RemoteLocation]): SetRemoteLocationsRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRemoteLocationsRequest]
  }
  
  @scala.inline
  implicit class SetRemoteLocationsRequestOps[Self <: SetRemoteLocationsRequest] (val x: Self) extends AnyVal {
    
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
    def setLocationsVarargs(value: RemoteLocation*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[RemoteLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
}
