package typings.gatsbyCli.anon

import typings.gatsbyCli.gatsbyCliStrings.createLog
import typings.gatsbyCli.typesMod.ICreateLog
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: Parameters[
    js.Function1[
      /* hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName */ Activitycurrent, 
      ICreateLog
    ]
  ]
  
  var name: createLog
}
object Args {
  
  inline def apply(
    args: Parameters[
      js.Function1[
        /* hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName */ Activitycurrent, 
        ICreateLog
      ]
    ]
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "createLog")
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(
      value: Parameters[
          js.Function1[
            /* hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName */ Activitycurrent, 
            ICreateLog
          ]
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: createLog): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
