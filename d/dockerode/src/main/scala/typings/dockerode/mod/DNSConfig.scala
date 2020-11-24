package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DNSConfig extends js.Object {
  
  var Nameservers: js.UndefOr[js.Array[String]] = js.native
  
  var Options: js.UndefOr[js.Array[String]] = js.native
  
  var Search: js.UndefOr[js.Array[String]] = js.native
}
object DNSConfig {
  
  @scala.inline
  def apply(): DNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSConfig]
  }
  
  @scala.inline
  implicit class DNSConfigOps[Self <: DNSConfig] (val x: Self) extends AnyVal {
    
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
    def setNameserversVarargs(value: String*): Self = this.set("Nameservers", js.Array(value :_*))
    
    @scala.inline
    def setNameservers(value: js.Array[String]): Self = this.set("Nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameservers: Self = this.set("Nameservers", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("Options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    
    @scala.inline
    def setSearchVarargs(value: String*): Self = this.set("Search", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: js.Array[String]): Self = this.set("Search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("Search", js.undefined)
  }
}
