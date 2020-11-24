package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:interface-name */
@js.native
trait IPAM extends js.Object {
  
  var Config: js.UndefOr[js.Array[StringDictionary[String]]] = js.native
  
  var Driver: String = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
}
object IPAM {
  
  @scala.inline
  def apply(Driver: String): IPAM = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAM]
  }
  
  @scala.inline
  implicit class IPAMOps[Self <: IPAM] (val x: Self) extends AnyVal {
    
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
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVarargs(value: StringDictionary[String]*): Self = this.set("Config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[StringDictionary[String]]): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("Config", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
  }
}
