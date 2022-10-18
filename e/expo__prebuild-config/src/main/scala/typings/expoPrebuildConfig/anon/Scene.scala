package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBScene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scene extends StObject {
  
  var scene: js.Array[IBScene]
}
object Scene {
  
  inline def apply(scene: js.Array[IBScene]): Scene = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  extension [Self <: Scene](x: Self) {
    
    inline def setScene(value: js.Array[IBScene]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneVarargs(value: IBScene*): Self = StObject.set(x, "scene", js.Array(value*))
  }
}
