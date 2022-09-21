package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.expoConfigPluginsStrings.head
import typings.expoConfigPlugins.expoConfigPluginsStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: head | tail
}
object Position {
  
  inline def apply(position: head | tail): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: head | tail): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
