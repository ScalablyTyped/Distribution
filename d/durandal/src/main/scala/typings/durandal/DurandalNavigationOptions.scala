package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalNavigationOptions extends StObject {
  
  var replace: Boolean
  
  var trigger: Boolean
}
object DurandalNavigationOptions {
  
  @scala.inline
  def apply(replace: Boolean, trigger: Boolean): DurandalNavigationOptions = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalNavigationOptions]
  }
  
  @scala.inline
  implicit class DurandalNavigationOptionsMutableBuilder[Self <: DurandalNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: Boolean): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
