package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings.setStatus
import typings.gatsbyCli.typesMod.ISetStatus
import typings.redux.mod.Dispatch
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsName extends StObject {
  
  var args: Parameters[
    js.Function2[
      /* status */ typings.gatsbyCli.gatsbyCliStrings._empty | ActivityStatuses, 
      /* force */ js.UndefOr[Boolean], 
      js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
    ]
  ]
  
  var name: setStatus
}
object ArgsName {
  
  inline def apply(
    args: Parameters[
      js.Function2[
        /* status */ typings.gatsbyCli.gatsbyCliStrings._empty | ActivityStatuses, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ]
  ): ArgsName = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "setStatus")
    __obj.asInstanceOf[ArgsName]
  }
  
  extension [Self <: ArgsName](x: Self) {
    
    inline def setArgs(
      value: Parameters[
          js.Function2[
            /* status */ typings.gatsbyCli.gatsbyCliStrings._empty | ActivityStatuses, 
            /* force */ js.UndefOr[Boolean], 
            js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
          ]
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: setStatus): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
