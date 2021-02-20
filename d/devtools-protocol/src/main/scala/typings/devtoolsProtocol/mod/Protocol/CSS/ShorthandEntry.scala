package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShorthandEntry extends StObject {
  
  /**
    * Whether the property has "!important" annotation (implies `false` if absent).
    */
  var important: js.UndefOr[Boolean] = js.native
  
  /**
    * Shorthand name.
    */
  var name: String = js.native
  
  /**
    * Shorthand value.
    */
  var value: String = js.native
}
object ShorthandEntry {
  
  @scala.inline
  def apply(name: String, value: String): ShorthandEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShorthandEntry]
  }
  
  @scala.inline
  implicit class ShorthandEntryMutableBuilder[Self <: ShorthandEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
