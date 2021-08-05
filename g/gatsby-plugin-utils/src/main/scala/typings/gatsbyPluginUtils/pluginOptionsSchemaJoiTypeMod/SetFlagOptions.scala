package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFlagOptions extends StObject {
  
  @JSName("clone")
  var clone_FSetFlagOptions: Boolean
}
object SetFlagOptions {
  
  inline def apply(clone_ : Boolean): SetFlagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFlagOptions]
  }
  
  extension [Self <: SetFlagOptions](x: Self) {
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
  }
}
