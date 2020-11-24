package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULT extends js.Object {
  
  var DEFAULT: String = js.native
  
  var SNIFF_INTERVAL: String = js.native
  
  var SNIFF_ON_CONNECTION_FAULT: String = js.native
  
  var SNIFF_ON_START: String = js.native
}
object DEFAULT {
  
  @scala.inline
  def apply(DEFAULT: String, SNIFF_INTERVAL: String, SNIFF_ON_CONNECTION_FAULT: String, SNIFF_ON_START: String): DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], SNIFF_INTERVAL = SNIFF_INTERVAL.asInstanceOf[js.Any], SNIFF_ON_CONNECTION_FAULT = SNIFF_ON_CONNECTION_FAULT.asInstanceOf[js.Any], SNIFF_ON_START = SNIFF_ON_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  @scala.inline
  implicit class DEFAULTOps[Self <: DEFAULT] (val x: Self) extends AnyVal {
    
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
    def setDEFAULT(value: String): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_INTERVAL(value: String): Self = this.set("SNIFF_INTERVAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_ON_CONNECTION_FAULT(value: String): Self = this.set("SNIFF_ON_CONNECTION_FAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNIFF_ON_START(value: String): Self = this.set("SNIFF_ON_START", value.asInstanceOf[js.Any])
  }
}
