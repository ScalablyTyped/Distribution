package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Array of guest attribute namespace/key/value tuples.
  */
trait SchemaGuestAttributesValue extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaGuestAttributesEntry]] = js.undefined
}
object SchemaGuestAttributesValue {
  
  @scala.inline
  def apply(): SchemaGuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesValue]
  }
  
  @scala.inline
  implicit class SchemaGuestAttributesValueMutableBuilder[Self <: SchemaGuestAttributesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaGuestAttributesEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGuestAttributesEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
