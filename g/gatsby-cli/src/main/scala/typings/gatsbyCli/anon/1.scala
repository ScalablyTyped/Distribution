package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.setActivityErrored
import typings.gatsbyCli.typesMod.IActivityErrored
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var args: Parameters[js.Function1[/* hasId */ IdString, IActivityErrored | Null]]
  
  var name: setActivityErrored
}
object `1` {
  
  inline def apply(args: Parameters[js.Function1[/* hasId */ IdString, IActivityErrored | Null]]): `1` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "setActivityErrored")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setArgs(value: Parameters[js.Function1[/* hasId */ IdString, IActivityErrored | Null]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: setActivityErrored): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
