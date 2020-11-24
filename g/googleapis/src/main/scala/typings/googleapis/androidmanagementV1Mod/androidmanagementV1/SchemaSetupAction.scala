package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action executed during setup.
  */
@js.native
trait SchemaSetupAction extends js.Object {
  
  /**
    * Description of this action.
    */
  var description: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * An action to launch an app.
    */
  var launchApp: js.UndefOr[SchemaLaunchAppAction] = js.native
  
  /**
    * Title of this action.
    */
  var title: js.UndefOr[SchemaUserFacingMessage] = js.native
}
object SchemaSetupAction {
  
  @scala.inline
  def apply(): SchemaSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupAction]
  }
  
  @scala.inline
  implicit class SchemaSetupActionOps[Self <: SchemaSetupAction] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: SchemaUserFacingMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLaunchApp(value: SchemaLaunchAppAction): Self = this.set("launchApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchApp: Self = this.set("launchApp", js.undefined)
    
    @scala.inline
    def setTitle(value: SchemaUserFacingMessage): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
