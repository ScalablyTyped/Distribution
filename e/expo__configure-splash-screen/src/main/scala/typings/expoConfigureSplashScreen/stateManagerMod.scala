package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/StateManager", JSImport.Default)
  @js.native
  class default[StateType, AppliedActionResultType, ActionName /* <: String */] protected ()
    extends StObject
       with StateManager[StateType, AppliedActionResultType, ActionName] {
    def this(state: StateType) = this()
    
    /* CompleteClass */
    var appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any] = js.native
    
    /* CompleteClass */
    override def applyAction[NewActionName /* <: String */](
      action: js.Function2[
          StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any], 
          js.Tuple3[StateType, NewActionName, AppliedActionResultType]
        ]
    ): StateManager[StateType, AppliedActionResultType, ActionName | NewActionName] = js.native
    
    /* CompleteClass */
    var state: StateType = js.native
  }
  
  trait StateManager[StateType, AppliedActionResultType, ActionName /* <: String */] extends StObject {
    
    var appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any]
    
    def applyAction[NewActionName /* <: String */](
      action: js.Function2[
          /* content */ StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any], 
          js.Tuple3[StateType, NewActionName, AppliedActionResultType]
        ]
    ): StateManager[StateType, AppliedActionResultType, ActionName | NewActionName]
    
    var state: StateType
  }
  object StateManager {
    
    inline def apply[StateType, AppliedActionResultType, ActionName /* <: String */](
      appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any],
      applyAction: js.Function2[
          /* content */ StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any], 
          js.Tuple3[StateType, js.Any, AppliedActionResultType]
        ] => StateManager[StateType, AppliedActionResultType, ActionName | js.Any],
      state: StateType
    ): StateManager[StateType, AppliedActionResultType, ActionName] = {
      val __obj = js.Dynamic.literal(appliedActions = appliedActions.asInstanceOf[js.Any], applyAction = js.Any.fromFunction1(applyAction), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateManager[StateType, AppliedActionResultType, ActionName]]
    }
    
    extension [Self <: StateManager[?, ?, ?], StateType, AppliedActionResultType, ActionName /* <: String */](x: Self & (StateManager[StateType, AppliedActionResultType, ActionName])) {
      
      inline def setAppliedActions(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in ActionName ]: AppliedActionResultType}
        */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any]
      ): Self = StObject.set(x, "appliedActions", value.asInstanceOf[js.Any])
      
      inline def setApplyAction(
        value: js.Function2[
              /* content */ StateType, 
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in ActionName ]: AppliedActionResultType}
        */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager & TopLevel[js.Any], 
              js.Tuple3[StateType, js.Any, AppliedActionResultType]
            ] => StateManager[StateType, AppliedActionResultType, ActionName | js.Any]
      ): Self = StObject.set(x, "applyAction", js.Any.fromFunction1(value))
      
      inline def setState(value: StateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
