package typings.docusignEsign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEMO extends js.Object {
  
  var DEMO: String = js.native
  
  var PRODUCTION: String = js.native
  
  var STAGE: String = js.native
}
object DEMO {
  
  @scala.inline
  def apply(DEMO: String, PRODUCTION: String, STAGE: String): DEMO = {
    val __obj = js.Dynamic.literal(DEMO = DEMO.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEMO]
  }
  
  @scala.inline
  implicit class DEMOOps[Self <: DEMO] (val x: Self) extends AnyVal {
    
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
    def setDEMO(value: String): Self = this.set("DEMO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRODUCTION(value: String): Self = this.set("PRODUCTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTAGE(value: String): Self = this.set("STAGE", value.asInstanceOf[js.Any])
  }
}
