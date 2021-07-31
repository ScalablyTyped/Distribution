package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAttachmentConfig extends StObject {
  
  var Aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Target: js.UndefOr[String] = js.undefined
}
object NetworkAttachmentConfig {
  
  @scala.inline
  def apply(): NetworkAttachmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAttachmentConfig]
  }
  
  @scala.inline
  implicit class NetworkAttachmentConfigMutableBuilder[Self <: NetworkAttachmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setDriverOpts(value: StringDictionary[String]): Self = StObject.set(x, "DriverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverOptsUndefined: Self = StObject.set(x, "DriverOpts", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
