package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of a tab stop.
  */
@js.native
trait TabSettings extends js.Object {
  
  /**
    * Specifies the tab alignment type.
    */
  var alignment: TabAlign = js.native
  
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  var deleted: Boolean = js.native
  
  /**
    * Specifies the tab leader symbol.
    */
  var leader: TabLeaderType = js.native
  
  /**
    * Specifies the position of the tab stop.
    */
  var position: Double = js.native
}
object TabSettings {
  
  @scala.inline
  def apply(alignment: TabAlign, deleted: Boolean, leader: TabLeaderType, position: Double): TabSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSettings]
  }
  
  @scala.inline
  implicit class TabSettingsOps[Self <: TabSettings] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: TabAlign): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeader(value: TabLeaderType): Self = this.set("leader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
