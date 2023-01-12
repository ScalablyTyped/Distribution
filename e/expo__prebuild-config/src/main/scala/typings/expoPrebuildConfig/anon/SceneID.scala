package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneID extends StObject {
  
  var sceneID: String
}
object SceneID {
  
  inline def apply(sceneID: String): SceneID = {
    val __obj = js.Dynamic.literal(sceneID = sceneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneID] (val x: Self) extends AnyVal {
    
    inline def setSceneID(value: String): Self = StObject.set(x, "sceneID", value.asInstanceOf[js.Any])
  }
}
