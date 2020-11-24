package typings.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details of the currently effective value. */
@js.native
trait GetReturnDetails extends js.Object {
  
  /**
    * Whether the effective value is specific to the incognito session.
    * This property will _only_ be present if the `incognito` property in the `details` parameter of `get()` was true.
    */
  var incognitoSpecific: js.UndefOr[Boolean] = js.native
  
  /** The level of control of the setting. */
  var levelOfControl: LevelOfControl = js.native
  
  /** The value of the setting. */
  var value: js.Any = js.native
}
object GetReturnDetails {
  
  @scala.inline
  def apply(levelOfControl: LevelOfControl, value: js.Any): GetReturnDetails = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReturnDetails]
  }
  
  @scala.inline
  implicit class GetReturnDetailsOps[Self <: GetReturnDetails] (val x: Self) extends AnyVal {
    
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
    def setLevelOfControl(value: LevelOfControl): Self = this.set("levelOfControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognitoSpecific(value: Boolean): Self = this.set("incognitoSpecific", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognitoSpecific: Self = this.set("incognitoSpecific", js.undefined)
  }
}
