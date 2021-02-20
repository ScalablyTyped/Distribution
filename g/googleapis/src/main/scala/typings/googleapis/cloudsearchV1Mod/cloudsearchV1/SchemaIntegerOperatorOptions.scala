package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to provide a search operator for integer properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait SchemaIntegerOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * integer property using the greater-than operator. For example, if
    * greaterThanOperatorName is *priorityabove* and the property&#39;s name is
    * *priorityVal*, then queries like *priorityabove:&amp;lt;value&amp;gt;*
    * will show results only where the value of the property named
    * *priorityVal* is greater than *&amp;lt;value&amp;gt;*. The operator name
    * can only contain lowercase letters (a-z). The maximum length is 32
    * characters.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * integer property using the less-than operator. For example, if
    * lessThanOperatorName is *prioritybelow* and the property&#39;s name is
    * *priorityVal*, then queries like *prioritybelow:&amp;lt;value&amp;gt;*
    * will show results only where the value of the property named
    * *priorityVal* is less than *&amp;lt;value&amp;gt;*. The operator name can
    * only contain lowercase letters (a-z). The maximum length is 32
    * characters.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * integer property. For example, if operatorName is *priority* and the
    * property&#39;s name is *priorityVal*, then queries like
    * *priority:&amp;lt;value&amp;gt;* will show results only where the value
    * of the property named *priorityVal* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any String properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}
object SchemaIntegerOperatorOptions {
  
  @scala.inline
  def apply(): SchemaIntegerOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerOperatorOptions]
  }
  
  @scala.inline
  implicit class SchemaIntegerOperatorOptionsMutableBuilder[Self <: SchemaIntegerOperatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreaterThanOperatorName(value: String): Self = StObject.set(x, "greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThanOperatorNameUndefined: Self = StObject.set(x, "greaterThanOperatorName", js.undefined)
    
    @scala.inline
    def setLessThanOperatorName(value: String): Self = StObject.set(x, "lessThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanOperatorNameUndefined: Self = StObject.set(x, "lessThanOperatorName", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
