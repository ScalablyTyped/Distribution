package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.linkColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  systemColor :'linkColor' | string} & {  key :string} */
trait systemColorlinkColorstrin extends StObject {
  
  /** @example `textColor` */
  var key: String
  
  var systemColor: linkColor | String
}
object systemColorlinkColorstrin {
  
  inline def apply(key: String, systemColor: linkColor | String): systemColorlinkColorstrin = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], systemColor = systemColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[systemColorlinkColorstrin]
  }
  
  extension [Self <: systemColorlinkColorstrin](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSystemColor(value: linkColor | String): Self = StObject.set(x, "systemColor", value.asInstanceOf[js.Any])
  }
}
