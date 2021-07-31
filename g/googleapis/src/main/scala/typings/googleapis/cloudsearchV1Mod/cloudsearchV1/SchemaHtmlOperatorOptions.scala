package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to provide a search operator for html properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
trait SchemaHtmlOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * html property. For example, if operatorName is *subject* and the
    * property&#39;s name is *subjectLine*, then queries like
    * *subject:&amp;lt;value&amp;gt;* will show results only where the value of
    * the property named *subjectLine* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any html properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object SchemaHtmlOperatorOptions {
  
  @scala.inline
  def apply(): SchemaHtmlOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlOperatorOptions]
  }
  
  @scala.inline
  implicit class SchemaHtmlOperatorOptionsMutableBuilder[Self <: SchemaHtmlOperatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
