package typings.googleGax.operationsMod.google.protobuf

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Any. */
@js.native
trait IAny extends StObject {
  
  /** Any type_url */
  var type_url: js.UndefOr[String | Null] = js.native
  
  /** Any value */
  var value: js.UndefOr[Uint8Array | Null] = js.native
}
object IAny {
  
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  @scala.inline
  implicit class IAnyMutableBuilder[Self <: IAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_urlNull: Self = StObject.set(x, "type_url", null)
    
    @scala.inline
    def setType_urlUndefined: Self = StObject.set(x, "type_url", js.undefined)
    
    @scala.inline
    def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
