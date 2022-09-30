package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.activityTick
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var args: Parameters[js.Function1[/* hasIdIncrement */ Increment, IUpdateActivity | Null]]
  
  var name: activityTick
}
object `4` {
  
  inline def apply(args: Parameters[js.Function1[/* hasIdIncrement */ Increment, IUpdateActivity | Null]]): `4` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "activityTick")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setArgs(value: Parameters[js.Function1[/* hasIdIncrement */ Increment, IUpdateActivity | Null]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: activityTick): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
