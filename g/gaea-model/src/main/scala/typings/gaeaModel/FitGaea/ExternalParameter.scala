package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalParameter extends StObject {
  
  /**
    * 名称
    */
  var name: String
  
  /**
    * 类型
    * number string boolean
    */
  var `type`: String
}
object ExternalParameter {
  
  @scala.inline
  def apply(name: String, `type`: String): ExternalParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalParameter]
  }
  
  @scala.inline
  implicit class ExternalParameterMutableBuilder[Self <: ExternalParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
