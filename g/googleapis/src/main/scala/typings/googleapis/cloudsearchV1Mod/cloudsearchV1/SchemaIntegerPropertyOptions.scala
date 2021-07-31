package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for integer properties.
  */
trait SchemaIntegerPropertyOptions extends StObject {
  
  /**
    * The maximum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values greater than the maximum are accepted and
    * ranked with the same weight as items indexed with the maximum value.
    */
  var maximumValue: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum value of the property. The minimum and maximum values for the
    * property are used to rank results according to the ordered ranking.
    * Indexing requests with values less than the minimum are accepted and
    * ranked with the same weight as items indexed with the minimum value.
    */
  var minimumValue: js.UndefOr[String] = js.undefined
  
  /**
    * If set, describes how the integer should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaIntegerOperatorOptions] = js.undefined
  
  /**
    * Used to specify the ordered ranking for the integer. Can only be used if
    * isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.undefined
}
object SchemaIntegerPropertyOptions {
  
  @scala.inline
  def apply(): SchemaIntegerPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaIntegerPropertyOptionsMutableBuilder[Self <: SchemaIntegerPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumValue(value: String): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: String): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setOperatorOptions(value: SchemaIntegerOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    @scala.inline
    def setOrderedRanking(value: String): Self = StObject.set(x, "orderedRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedRankingUndefined: Self = StObject.set(x, "orderedRanking", js.undefined)
  }
}
