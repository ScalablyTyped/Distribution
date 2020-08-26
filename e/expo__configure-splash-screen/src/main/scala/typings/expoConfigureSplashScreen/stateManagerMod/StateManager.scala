package typings.expoConfigureSplashScreen.stateManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateManager[StateType, AppliedActionResultType, ActionName /* <: String */] extends js.Object {
  var appliedActions: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ActionName ]: AppliedActionResultType}
    */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any] = js.native
  var state: StateType = js.native
  def applyAction[NewActionName /* <: String */](
    action: js.Function2[
      /* content */ StateType, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ActionName ]: AppliedActionResultType}
    */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any], 
      js.Tuple3[StateType, NewActionName, AppliedActionResultType]
    ]
  ): StateManager[StateType, AppliedActionResultType, ActionName | NewActionName] = js.native
}

object StateManager {
  @scala.inline
  def apply[StateType, AppliedActionResultType, /* <: java.lang.String */ ActionName](
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
  implicit class StateManagerOps[Self <: StateManager[_, _, _], StateType, AppliedActionResultType, /* <: java.lang.String */ ActionName] (val x: Self with (StateManager[StateType, AppliedActionResultType, ActionName])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppliedActions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any]
    ): Self = this.set("appliedActions", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyAction(
      value: js.Function2[
          /* content */ StateType, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ActionName ]: AppliedActionResultType}
      */ /* actions */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.StateManager with TopLevel[js.Any], 
          js.Tuple3[StateType, js.Any, AppliedActionResultType]
        ] => StateManager[StateType, AppliedActionResultType, ActionName | js.Any]
    ): Self = this.set("applyAction", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: StateType): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

