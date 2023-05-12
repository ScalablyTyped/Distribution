package typings.expressValidator

import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcContextItemsContextItemMod.ContextItem
import typings.expressValidator.srcContextMod.Context
import typings.expressValidator.srcContextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextBuilderMod {
  
  @JSImport("express-validator/src/context-builder", "ContextBuilder")
  @js.native
  open class ContextBuilder () extends StObject {
    
    def addItem(items: ContextItem*): this.type = js.native
    
    def build(): Context = js.native
    
    /* private */ var fields: Any = js.native
    
    /* private */ var locations: Any = js.native
    
    /* private */ var message: Any = js.native
    
    /* private */ var optional: Any = js.native
    
    /* private */ var requestBail: Any = js.native
    
    def setFields(fields: js.Array[String]): this.type = js.native
    
    def setLocations(locations: js.Array[Location]): this.type = js.native
    
    def setMessage(message: Any): this.type = js.native
    
    def setOptional(options: Optional): this.type = js.native
    
    def setRequestBail(): this.type = js.native
    
    /* private */ val stack: Any = js.native
  }
}
