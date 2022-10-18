package typings.firebase.anon

import typings.firebase.compatMod.firebase.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * Threshhold log level. Only logs at or above this level trigger the `logCallback`
    * passed to `onLog`.
    */
  var level: LogLevel
}
object Level {
  
  inline def apply(level: LogLevel): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
