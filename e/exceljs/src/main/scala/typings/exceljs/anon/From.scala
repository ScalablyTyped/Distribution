package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: String | Column
  
  var to: String | Column
}
object From {
  
  @scala.inline
  def apply(from: String | Column, to: String | Column): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String | Column): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String | Column): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
