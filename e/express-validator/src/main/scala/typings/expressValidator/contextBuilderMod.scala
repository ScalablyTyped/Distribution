package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import typings.expressValidator.contextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextBuilderMod {
  
  @JSImport("express-validator/src/context-builder", "ContextBuilder")
  @js.native
  class ContextBuilder () extends StObject {
    
    def addItem(items: ContextItem*): this.type = js.native
    
    def build(): Context = js.native
    
    var fields: js.Any = js.native
    
    var locations: js.Any = js.native
    
    var message: js.Any = js.native
    
    var optional: js.Any = js.native
    
    def setFields(fields: js.Array[String]): this.type = js.native
    
    def setLocations(locations: js.Array[Location]): this.type = js.native
    
    def setMessage(message: js.Any): this.type = js.native
    
    def setOptional(options: Optional): this.type = js.native
    
    val stack: js.Any = js.native
  }
}
