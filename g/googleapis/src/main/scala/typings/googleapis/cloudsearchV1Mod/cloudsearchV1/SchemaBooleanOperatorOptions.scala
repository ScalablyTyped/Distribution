package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to provide a search operator for boolean properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
trait SchemaBooleanOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * boolean property. For example, if operatorName is *closed* and the
    * property&#39;s name is *isClosed*, then queries like
    * *closed:&amp;lt;value&amp;gt;* will show results only where the value of
    * the property named *isClosed* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any String properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object SchemaBooleanOperatorOptions {
  
  @scala.inline
  def apply(): SchemaBooleanOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanOperatorOptions]
  }
  
  @scala.inline
  implicit class SchemaBooleanOperatorOptionsMutableBuilder[Self <: SchemaBooleanOperatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
