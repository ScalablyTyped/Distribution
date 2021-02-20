package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for double properties.
  */
@js.native
trait SchemaDoublePropertyOptions extends StObject {
  
  /**
    * If set, describes how the double should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDoubleOperatorOptions] = js.native
}
object SchemaDoublePropertyOptions {
  
  @scala.inline
  def apply(): SchemaDoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoublePropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaDoublePropertyOptionsMutableBuilder[Self <: SchemaDoublePropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: SchemaDoubleOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
