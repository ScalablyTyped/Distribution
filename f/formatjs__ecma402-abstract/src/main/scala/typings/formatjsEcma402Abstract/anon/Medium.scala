package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var full: String
  
  var long: String
  
  var medium: String
  
  var short: String
}
object Medium {
  
  @scala.inline
  def apply(full: String, long: String, medium: String, short: String): Medium = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  @scala.inline
  implicit class MediumMutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
