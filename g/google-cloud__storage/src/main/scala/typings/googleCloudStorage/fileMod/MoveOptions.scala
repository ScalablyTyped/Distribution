package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object MoveOptions {
  
  inline def apply(): MoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveOptions]
  }
  
  extension [Self <: MoveOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
