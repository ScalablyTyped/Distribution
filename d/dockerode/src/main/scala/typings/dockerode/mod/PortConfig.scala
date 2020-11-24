package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.host
import typings.dockerode.dockerodeStrings.ingress
import typings.dockerode.dockerodeStrings.sctp
import typings.dockerode.dockerodeStrings.tcp
import typings.dockerode.dockerodeStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortConfig extends js.Object {
  
  var Name: js.UndefOr[String] = js.native
  
  var Protocol: js.UndefOr[tcp | udp | sctp] = js.native
  
  var PublishMode: js.UndefOr[ingress | host] = js.native
  
  var PublishedPort: js.UndefOr[Double] = js.native
  
  var TargetPort: js.UndefOr[Double] = js.native
}
object PortConfig {
  
  @scala.inline
  def apply(): PortConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortConfig]
  }
  
  @scala.inline
  implicit class PortConfigOps[Self <: PortConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProtocol(value: tcp | udp | sctp): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setPublishMode(value: ingress | host): Self = this.set("PublishMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishMode: Self = this.set("PublishMode", js.undefined)
    
    @scala.inline
    def setPublishedPort(value: Double): Self = this.set("PublishedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedPort: Self = this.set("PublishedPort", js.undefined)
    
    @scala.inline
    def setTargetPort(value: Double): Self = this.set("TargetPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPort: Self = this.set("TargetPort", js.undefined)
  }
}
