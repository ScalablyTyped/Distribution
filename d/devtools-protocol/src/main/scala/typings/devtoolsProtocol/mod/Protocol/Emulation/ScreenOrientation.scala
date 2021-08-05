package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.landscapePrimary
import typings.devtoolsProtocol.devtoolsProtocolStrings.landscapeSecondary
import typings.devtoolsProtocol.devtoolsProtocolStrings.portraitPrimary
import typings.devtoolsProtocol.devtoolsProtocolStrings.portraitSecondary
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenOrientation extends StObject {
  
  /**
    * Orientation angle.
    */
  var angle: integer
  
  /**
    * Orientation type. (ScreenOrientationType enum)
    */
  var `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary
}
object ScreenOrientation {
  
  inline def apply(
    angle: integer,
    `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary
  ): ScreenOrientation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientation]
  }
  
  extension [Self <: ScreenOrientation](x: Self) {
    
    inline def setAngle(value: integer): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setType(value: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
