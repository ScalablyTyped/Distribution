package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyMetadata extends StObject {
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the property is editable. Valid values are:
    *
    * - `editable`
    * - `read_only`
    */
  var rights: js.UndefOr[String] = js.undefined
}
object PropertyMetadata {
  
  @scala.inline
  def apply(): PropertyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyMetadata]
  }
  
  @scala.inline
  implicit class PropertyMetadataMutableBuilder[Self <: PropertyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
  }
}
