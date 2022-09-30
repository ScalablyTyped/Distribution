package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.setActivityStatusText
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var args: Parameters[js.Function1[/* hasIdStatusText */ IdStatusText, IUpdateActivity | Null]]
  
  var name: setActivityStatusText
}
object `2` {
  
  inline def apply(args: Parameters[js.Function1[/* hasIdStatusText */ IdStatusText, IUpdateActivity | Null]]): `2` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "setActivityStatusText")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setArgs(value: Parameters[js.Function1[/* hasIdStatusText */ IdStatusText, IUpdateActivity | Null]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: setActivityStatusText): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
