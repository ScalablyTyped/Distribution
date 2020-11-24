package typings.domutils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodeEntities extends js.Object {
  
  var decodeEntities: js.UndefOr[Boolean] = js.native
  
  var xmlMode: js.UndefOr[Boolean] = js.native
}
object DecodeEntities {
  
  @scala.inline
  def apply(): DecodeEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeEntities]
  }
  
  @scala.inline
  implicit class DecodeEntitiesOps[Self <: DecodeEntities] (val x: Self) extends AnyVal {
    
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
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setXmlMode(value: Boolean): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
}
