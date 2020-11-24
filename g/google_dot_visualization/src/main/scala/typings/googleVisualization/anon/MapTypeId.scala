package typings.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeId extends js.Object {
  
  var mapTypeId: Name = js.native
}
object MapTypeId {
  
  @scala.inline
  def apply(mapTypeId: Name): MapTypeId = {
    val __obj = js.Dynamic.literal(mapTypeId = mapTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeId]
  }
  
  @scala.inline
  implicit class MapTypeIdOps[Self <: MapTypeId] (val x: Self) extends AnyVal {
    
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
    def setMapTypeId(value: Name): Self = this.set("mapTypeId", value.asInstanceOf[js.Any])
  }
}
