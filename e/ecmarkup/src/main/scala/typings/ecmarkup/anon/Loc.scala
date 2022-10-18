package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loc extends StObject {
  
  var loc: Line
  
  var name: String
}
object Loc {
  
  inline def apply(loc: Line, name: String): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
  
  extension [Self <: Loc](x: Self) {
    
    inline def setLoc(value: Line): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
