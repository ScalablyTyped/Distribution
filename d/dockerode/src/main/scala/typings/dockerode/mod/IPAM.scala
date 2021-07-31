package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:interface-name */
trait IPAM extends StObject {
  
  var Config: js.UndefOr[js.Array[StringDictionary[String]]] = js.undefined
  
  var Driver: String
  
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
}
object IPAM {
  
  @scala.inline
  def apply(Driver: String): IPAM = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAM]
  }
  
  @scala.inline
  implicit class IPAMMutableBuilder[Self <: IPAM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    @scala.inline
    def setConfigVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "Config", js.Array(value :_*))
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
  }
}
