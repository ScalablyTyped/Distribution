package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.callee
import typings.ecmarkup.libExprParserMod.Call
import typings.ecmarkup.libExprParserMod.PathItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent
  extends StObject
     with PathItem {
  
  var index: callee | Double
  
  var parent: Call
}
object Parent {
  
  inline def apply(index: callee | Double, parent: Call): Parent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setIndex(value: callee | Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Call): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
