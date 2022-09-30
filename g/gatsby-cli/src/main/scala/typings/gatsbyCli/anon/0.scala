package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.updateActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var args: Parameters[js.Function1[/* hasIdRest */ StatusText, IUpdateActivity | Null]]
  
  var name: updateActivity
}
object `0` {
  
  inline def apply(args: Parameters[js.Function1[/* hasIdRest */ StatusText, IUpdateActivity | Null]]): `0` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "updateActivity")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setArgs(value: Parameters[js.Function1[/* hasIdRest */ StatusText, IUpdateActivity | Null]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: updateActivity): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
