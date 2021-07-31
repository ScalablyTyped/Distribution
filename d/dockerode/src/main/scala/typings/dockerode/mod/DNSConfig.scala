package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSConfig extends StObject {
  
  var Nameservers: js.UndefOr[js.Array[String]] = js.undefined
  
  var Options: js.UndefOr[js.Array[String]] = js.undefined
  
  var Search: js.UndefOr[js.Array[String]] = js.undefined
}
object DNSConfig {
  
  @scala.inline
  def apply(): DNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSConfig]
  }
  
  @scala.inline
  implicit class DNSConfigMutableBuilder[Self <: DNSConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameservers(value: js.Array[String]): Self = StObject.set(x, "Nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversUndefined: Self = StObject.set(x, "Nameservers", js.undefined)
    
    @scala.inline
    def setNameserversVarargs(value: String*): Self = StObject.set(x, "Nameservers", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "Options", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: js.Array[String]): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "Search", js.undefined)
    
    @scala.inline
    def setSearchVarargs(value: String*): Self = StObject.set(x, "Search", js.Array(value :_*))
  }
}
