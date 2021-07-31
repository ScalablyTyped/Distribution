package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColorDefinition extends StObject {
  
  /**
    * The background color associated with this color definition.
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * The foreground color that can be used to write on top of a background
    * with &#39;background&#39; color.
    */
  var foreground: js.UndefOr[String] = js.undefined
}
object SchemaColorDefinition {
  
  @scala.inline
  def apply(): SchemaColorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorDefinition]
  }
  
  @scala.inline
  implicit class SchemaColorDefinitionMutableBuilder[Self <: SchemaColorDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
  }
}
