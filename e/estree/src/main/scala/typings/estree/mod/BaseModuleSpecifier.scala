package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseModuleSpecifier
  extends StObject
     with BaseNode {
  
  var local: Identifier
}
object BaseModuleSpecifier {
  
  inline def apply(local: Identifier, `type`: String): BaseModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModuleSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseModuleSpecifier] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Identifier): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
