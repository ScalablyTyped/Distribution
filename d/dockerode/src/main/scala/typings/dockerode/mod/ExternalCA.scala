package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalCA extends js.Object {
  
  var CACert: String = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
  
  var Protocol: ExternalCAProtocol = js.native
  
  var URL: String = js.native
}
object ExternalCA {
  
  @scala.inline
  def apply(CACert: String, Protocol: ExternalCAProtocol, URL: String): ExternalCA = {
    val __obj = js.Dynamic.literal(CACert = CACert.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalCA]
  }
  
  @scala.inline
  implicit class ExternalCAOps[Self <: ExternalCA] (val x: Self) extends AnyVal {
    
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
    def setCACert(value: String): Self = this.set("CACert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: ExternalCAProtocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
  }
}
