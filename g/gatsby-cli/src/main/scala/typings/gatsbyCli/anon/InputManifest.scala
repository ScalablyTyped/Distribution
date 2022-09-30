package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputManifest extends StObject {
  
  var inputManifest: Any
}
object InputManifest {
  
  inline def apply(inputManifest: Any): InputManifest = {
    val __obj = js.Dynamic.literal(inputManifest = inputManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputManifest]
  }
  
  extension [Self <: InputManifest](x: Self) {
    
    inline def setInputManifest(value: Any): Self = StObject.set(x, "inputManifest", value.asInstanceOf[js.Any])
  }
}
