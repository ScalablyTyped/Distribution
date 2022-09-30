package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.startActivity
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.redux.mod.Dispatch
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsParameters extends StObject {
  
  var args: Parameters[
    js.Function1[
      /* hasIdTextTypeStatusCurrentTotal */ Current, 
      js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity]
    ]
  ]
  
  var name: startActivity
}
object ArgsParameters {
  
  inline def apply(
    args: Parameters[
      js.Function1[
        /* hasIdTextTypeStatusCurrentTotal */ Current, 
        js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity]
      ]
    ]
  ): ArgsParameters = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "startActivity")
    __obj.asInstanceOf[ArgsParameters]
  }
  
  extension [Self <: ArgsParameters](x: Self) {
    
    inline def setArgs(
      value: Parameters[
          js.Function1[
            /* hasIdTextTypeStatusCurrentTotal */ Current, 
            js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity]
          ]
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: startActivity): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
