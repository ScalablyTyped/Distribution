package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsRelationshipsResourceObject extends StObject {
  
  var data: js.Object
}
object CommandsRelationshipsResourceObject {
  
  inline def apply(data: js.Object): CommandsRelationshipsResourceObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsRelationshipsResourceObject]
  }
  
  extension [Self <: CommandsRelationshipsResourceObject](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
