package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message specifies a header location to extract JWT token.
  */
@js.native
trait SchemaJwtHeader extends StObject {
  
  /**
    * The HTTP header name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value prefix. The value format is &quot;value_prefix&quot; For
    * example, for &quot;Authorization: Bearer &quot;,
    * value_prefix=&quot;Bearer &quot; with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.native
}
object SchemaJwtHeader {
  
  @scala.inline
  def apply(): SchemaJwtHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtHeader]
  }
  
  @scala.inline
  implicit class SchemaJwtHeaderMutableBuilder[Self <: SchemaJwtHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}
