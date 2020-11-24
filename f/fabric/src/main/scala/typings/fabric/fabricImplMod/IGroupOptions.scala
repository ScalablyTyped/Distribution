package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupOptions extends IObjectOptions {
  
  /**
    * Indicates if click, mouseover, mouseout events & hoverCursor should also check for subtargets
    * @type Boolean
    */
  var subTargetCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
    * available setting this boolean to true.
    * @type Boolean
    * @since 2.0.0
    * @default
    */
  var useSetOnGroup: js.UndefOr[Boolean] = js.native
}
object IGroupOptions {
  
  @scala.inline
  def apply(): IGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupOptions]
  }
  
  @scala.inline
  implicit class IGroupOptionsOps[Self <: IGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setSubTargetCheck(value: Boolean): Self = this.set("subTargetCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTargetCheck: Self = this.set("subTargetCheck", js.undefined)
    
    @scala.inline
    def setUseSetOnGroup(value: Boolean): Self = this.set("useSetOnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSetOnGroup: Self = this.set("useSetOnGroup", js.undefined)
  }
}
