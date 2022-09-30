package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.createPendingActivity
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.ISetStatus
import typings.redux.mod.Dispatch
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var args: Parameters[
    js.Function1[
      /* hasIdStatus */ Id, 
      js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity]
    ]
  ]
  
  var name: createPendingActivity
}
object Name {
  
  inline def apply(
    args: Parameters[
      js.Function1[
        /* hasIdStatus */ Id, 
        js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity]
      ]
    ]
  ): Name = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "createPendingActivity")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setArgs(
      value: Parameters[
          js.Function1[
            /* hasIdStatus */ Id, 
            js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity]
          ]
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: createPendingActivity): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
