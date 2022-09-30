package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderName extends StObject {
  
  var folderName: String
  
  var scale: Double
}
object FolderName {
  
  inline def apply(folderName: String, scale: Double): FolderName = {
    val __obj = js.Dynamic.literal(folderName = folderName.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderName]
  }
  
  extension [Self <: FolderName](x: Self) {
    
    inline def setFolderName(value: String): Self = StObject.set(x, "folderName", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
