package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerTimeZone extends StObject {
  
  /**
    * [descr:dxSchedulerTimeZone.id]
    */
  var id: String
  
  /**
    * [descr:dxSchedulerTimeZone.offset]
    */
  var offset: Double
  
  /**
    * [descr:dxSchedulerTimeZone.title]
    */
  var title: String
}
object dxSchedulerTimeZone {
  
  @scala.inline
  def apply(id: String, offset: Double, title: String): dxSchedulerTimeZone = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerTimeZone]
  }
  
  @scala.inline
  implicit class dxSchedulerTimeZoneMutableBuilder[Self <: dxSchedulerTimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
