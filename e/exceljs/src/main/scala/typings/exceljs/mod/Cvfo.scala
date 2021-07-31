package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvfo extends StObject {
  
  var `type`: CfvoTypes
  
  var value: js.UndefOr[Double] = js.undefined
}
object Cvfo {
  
  @scala.inline
  def apply(`type`: CfvoTypes): Cvfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvfo]
  }
  
  @scala.inline
  implicit class CvfoMutableBuilder[Self <: Cvfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CfvoTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
