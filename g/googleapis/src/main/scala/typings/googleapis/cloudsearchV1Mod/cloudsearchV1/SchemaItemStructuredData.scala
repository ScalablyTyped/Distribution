package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available structured data fields for the item.
  */
trait SchemaItemStructuredData extends StObject {
  
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The structured data object that should conform to a registered object
    * definition in the schema for the data source.
    */
  var `object`: js.UndefOr[SchemaStructuredDataObject] = js.undefined
}
object SchemaItemStructuredData {
  
  @scala.inline
  def apply(): SchemaItemStructuredData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStructuredData]
  }
  
  @scala.inline
  implicit class SchemaItemStructuredDataMutableBuilder[Self <: SchemaItemStructuredData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setObject(value: SchemaStructuredDataObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
