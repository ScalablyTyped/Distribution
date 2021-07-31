package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeConditions extends StObject {
  
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.undefined
}
object IncludeConditions {
  
  @scala.inline
  def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  
  @scala.inline
  implicit class IncludeConditionsMutableBuilder[Self <: IncludeConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeConditions(value: SchemaIncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
