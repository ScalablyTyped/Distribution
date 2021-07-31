package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of a tab stop.
  */
trait TabSettings extends StObject {
  
  /**
    * Specifies the tab alignment type.
    */
  var alignment: TabAlign
  
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  var deleted: Boolean
  
  /**
    * Specifies the tab leader symbol.
    */
  var leader: TabLeaderType
  
  /**
    * Specifies the position of the tab stop.
    */
  var position: Double
}
object TabSettings {
  
  @scala.inline
  def apply(alignment: TabAlign, deleted: Boolean, leader: TabLeaderType, position: Double): TabSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSettings]
  }
  
  @scala.inline
  implicit class TabSettingsMutableBuilder[Self <: TabSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: TabAlign): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeader(value: TabLeaderType): Self = StObject.set(x, "leader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
