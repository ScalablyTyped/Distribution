package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.callee
import typings.ecmarkup.libExprParserMod.PathItem
import typings.ecmarkup.libExprParserMod.SDOCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexParent
  extends StObject
     with PathItem {
  
  var index: callee | Double
  
  var parent: SDOCall
}
object IndexParent {
  
  inline def apply(index: callee | Double, parent: SDOCall): IndexParent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexParent]
  }
  
  extension [Self <: IndexParent](x: Self) {
    
    inline def setIndex(value: callee | Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: SDOCall): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
