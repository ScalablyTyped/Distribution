package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional. Provides a search operator for date properties. Search operators
  * let users restrict the query to specific fields relevant to the type of
  * item being searched.
  */
trait SchemaDateOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * date property using the greater-than operator. For example, if
    * greaterThanOperatorName is *closedafter* and the property&#39;s name is
    * *closeDate*, then queries like *closedafter:&amp;lt;value&amp;gt;* will
    * show results only where the value of the property named *closeDate* is
    * later than *&amp;lt;value&amp;gt;*. The operator name can only contain
    * lowercase letters (a-z). The maximum length is 32 characters.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * date property using the less-than operator. For example, if
    * lessThanOperatorName is *closedbefore* and the property&#39;s name is
    * *closeDate*, then queries like *closedbefore:&amp;lt;value&amp;gt;* will
    * show results only where the value of the property named *closeDate* is
    * earlier than *&amp;lt;value&amp;gt;*. The operator name can only contain
    * lowercase letters (a-z). The maximum length is 32 characters.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the actual string required in the query in order to isolate the
    * date property. For example, suppose an issue tracking schema object has a
    * property named *closeDate* that specifies an operator with an
    * operatorName of *closedon*. For searches on that data, queries like
    * *closedon:&amp;lt;value&amp;gt;* will show results only where the value
    * of the *closeDate* property matches *&amp;lt;value&amp;gt;*. By contrast,
    * a search that uses the same *&amp;lt;value&amp;gt;* without an operator
    * will return all items where *&amp;lt;value&amp;gt;* matches the value of
    * any String properties or text within the content field for the indexed
    * datasource. The operator name can only contain lowercase letters (a-z).
    * The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object SchemaDateOperatorOptions {
  
  @scala.inline
  def apply(): SchemaDateOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateOperatorOptions]
  }
  
  @scala.inline
  implicit class SchemaDateOperatorOptionsMutableBuilder[Self <: SchemaDateOperatorOptions] (val x: Self) extends AnyVal {
    
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
