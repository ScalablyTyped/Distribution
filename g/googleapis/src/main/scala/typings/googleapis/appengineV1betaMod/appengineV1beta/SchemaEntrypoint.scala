package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntrypoint extends StObject {
  
  /**
    * The format should be a shell command that can be fed to bash -c.
    */
  var shell: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntrypoint {
  
  inline def apply(): SchemaEntrypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntrypoint]
  }
  
  extension [Self <: SchemaEntrypoint](x: Self) {
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellNull: Self = StObject.set(x, "shell", null)
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
