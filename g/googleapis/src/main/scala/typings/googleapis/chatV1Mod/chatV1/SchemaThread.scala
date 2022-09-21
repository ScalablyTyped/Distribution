package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThread extends StObject {
  
  /**
    * Resource name, in the form "spaces/x/threads/x". Example: spaces/AAAAAAAAAAA/threads/TTTTTTTTTTT
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaThread {
  
  inline def apply(): SchemaThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThread]
  }
  
  extension [Self <: SchemaThread](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
