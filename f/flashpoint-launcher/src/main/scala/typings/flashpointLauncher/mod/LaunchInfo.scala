package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchInfo extends StObject {
  
  var env: ProcessEnv
  
  var gameArgs: String | js.Array[String]
  
  var gamePath: String
  
  var useWine: Boolean
}
object LaunchInfo {
  
  inline def apply(env: ProcessEnv, gameArgs: String | js.Array[String], gamePath: String, useWine: Boolean): LaunchInfo = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], gameArgs = gameArgs.asInstanceOf[js.Any], gamePath = gamePath.asInstanceOf[js.Any], useWine = useWine.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchInfo] (val x: Self) extends AnyVal {
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setGameArgs(value: String | js.Array[String]): Self = StObject.set(x, "gameArgs", value.asInstanceOf[js.Any])
    
    inline def setGameArgsVarargs(value: String*): Self = StObject.set(x, "gameArgs", js.Array(value*))
    
    inline def setGamePath(value: String): Self = StObject.set(x, "gamePath", value.asInstanceOf[js.Any])
    
    inline def setUseWine(value: Boolean): Self = StObject.set(x, "useWine", value.asInstanceOf[js.Any])
  }
}
