package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.setActivityTotal
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var args: Parameters[js.Function1[/* hasIdTotal */ Total, IUpdateActivity | Null]]
  
  var name: setActivityTotal
}
object `3` {
  
  inline def apply(args: Parameters[js.Function1[/* hasIdTotal */ Total, IUpdateActivity | Null]]): `3` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "setActivityTotal")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setArgs(value: Parameters[js.Function1[/* hasIdTotal */ Total, IUpdateActivity | Null]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: setActivityTotal): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
