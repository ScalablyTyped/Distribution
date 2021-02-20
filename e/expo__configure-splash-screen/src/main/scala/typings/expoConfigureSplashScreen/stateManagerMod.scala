package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/StateManager", JSImport.Default)
  @js.native
  class default[StateType, AppliedActionResultType, ActionName /* <: String */] protected () extends StateManager[StateType, AppliedActionResultType, ActionName] {
    def this(state: StateType) = this()
  }
  
  @js.native
  trait StateManager[StateType, AppliedActionResultType, ActionName /* <: String */] extends StObject {
    
    var appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any] = js.native
    
    def applyAction[NewActionName /* <: String */](
      action: js.Function2[
          /* content */ StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any], 
          js.Tuple3[StateType, NewActionName, AppliedActionResultType]
        ]
    ): StateManager[StateType, AppliedActionResultType, ActionName | NewActionName] = js.native
    
    var state: StateType = js.native
  }
  object StateManager {
    
    @scala.inline
    def apply[StateType, AppliedActionResultType, ActionName /* <: String */](
      appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any],
      applyAction: js.Function2[
          /* content */ StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any], 
          js.Tuple3[StateType, js.Any, AppliedActionResultType]
        ] => StateManager[StateType, AppliedActionResultType, ActionName | js.Any],
      state: StateType
    ): StateManager[StateType, AppliedActionResultType, ActionName] = {
      val __obj = js.Dynamic.literal(appliedActions = appliedActions.asInstanceOf[js.Any], applyAction = js.Any.fromFunction1(applyAction), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateManager[StateType, AppliedActionResultType, ActionName]]
    }
    
    @scala.inline
    implicit class StateManagerMutableBuilder[Self <: StateManager[_, _, _], StateType, AppliedActionResultType, ActionName /* <: String */] (val x: Self with (StateManager[StateType, AppliedActionResultType, ActionName])) extends AnyVal {
      
      @scala.inline
      def setAppliedActions(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in ActionName ]: AppliedActionResultType}
        */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any]
      ): Self = StObject.set(x, "appliedActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyAction(
        value: js.Function2[
              /* content */ StateType, 
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in ActionName ]: AppliedActionResultType}
        */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any], 
              js.Tuple3[StateType, js.Any, AppliedActionResultType]
            ] => StateManager[StateType, AppliedActionResultType, ActionName | js.Any]
      ): Self = StObject.set(x, "applyAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: StateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
