package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetting extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user setting.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource (&quot;calendar#setting&quot;).
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the user setting. The format of the value depends on the ID of
    * the setting. It must always be a UTF-8 string of length up to 1024
    * characters.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaSetting {
  
  @scala.inline
  def apply(): SchemaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetting]
  }
  
  @scala.inline
  implicit class SchemaSettingMutableBuilder[Self <: SchemaSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
