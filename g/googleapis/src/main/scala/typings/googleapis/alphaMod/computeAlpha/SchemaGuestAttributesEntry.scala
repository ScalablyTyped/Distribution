package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A guest attributes namespace/key/value entry.
  */
@js.native
trait SchemaGuestAttributesEntry extends StObject {
  
  /**
    * Key for the guest attribute entry.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Namespace for the guest attribute entry.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Value for the guest attribute entry.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGuestAttributesEntry {
  
  @scala.inline
  def apply(): SchemaGuestAttributesEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesEntry]
  }
  
  @scala.inline
  implicit class SchemaGuestAttributesEntryMutableBuilder[Self <: SchemaGuestAttributesEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
