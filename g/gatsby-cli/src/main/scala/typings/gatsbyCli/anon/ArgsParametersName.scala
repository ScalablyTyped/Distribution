package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.endActivity
import typings.gatsbyCli.typesMod.ICancelActivity
import typings.gatsbyCli.typesMod.ICreateLog
import typings.gatsbyCli.typesMod.IEndActivity
import typings.gatsbyCli.typesMod.ISetStatus
import typings.redux.mod.Dispatch
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsParametersName extends StObject {
  
  var args: Parameters[
    js.Function1[
      /* hasIdStatus */ Status, 
      (js.Array[
        ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
      ]) | Null
    ]
  ]
  
  var name: endActivity
}
object ArgsParametersName {
  
  inline def apply(
    args: Parameters[
      js.Function1[
        /* hasIdStatus */ Status, 
        (js.Array[
          ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
        ]) | Null
      ]
    ]
  ): ArgsParametersName = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "endActivity")
    __obj.asInstanceOf[ArgsParametersName]
  }
  
  extension [Self <: ArgsParametersName](x: Self) {
    
    inline def setArgs(
      value: Parameters[
          js.Function1[
            /* hasIdStatus */ Status, 
            (js.Array[
              ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: endActivity): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
