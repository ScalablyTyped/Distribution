package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAttachmentConfig extends js.Object {
  
  var Aliases: js.UndefOr[js.Array[String]] = js.native
  
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.native
  
  var Target: js.UndefOr[String] = js.native
}
object NetworkAttachmentConfig {
  
  @scala.inline
  def apply(): NetworkAttachmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAttachmentConfig]
  }
  
  @scala.inline
  implicit class NetworkAttachmentConfigOps[Self <: NetworkAttachmentConfig] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("Aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    
    @scala.inline
    def setDriverOpts(value: StringDictionary[String]): Self = this.set("DriverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverOpts: Self = this.set("DriverOpts", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
}
