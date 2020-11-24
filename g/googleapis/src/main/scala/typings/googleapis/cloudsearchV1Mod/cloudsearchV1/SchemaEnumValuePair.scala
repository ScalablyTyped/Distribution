package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The enumeration value pair defines two things: a required string value and
  * an optional integer value. The string value defines the necessary query
  * term required to retrieve that item, such as *p0* for a priority item. The
  * integer value determines the ranking of that string value relative to other
  * enumerated values for the same property. For example, you might associate
  * *p0* with *0* and define another enum pair such as *p1* and *1*. You must
  * use the integer value in combination with ordered ranking to set the
  * ranking of a given value relative to other enumerated values for the same
  * property name. Here, a ranking order of DESCENDING for *priority*
  * properties results in a ranking boost for items indexed with a value of
  * *p0* compared to items indexed with a value of *p1*. Without a specified
  * ranking order, the integer value has no effect on item ranking.
  */
@js.native
trait SchemaEnumValuePair extends js.Object {
  
  /**
    * The integer value of the EnumValuePair which must be non-negative.
    * Optional.
    */
  var integerValue: js.UndefOr[Double] = js.native
  
  /**
    * The string value of the EnumValuePair. The maximum length is 32
    * characters.
    */
  var stringValue: js.UndefOr[String] = js.native
}
object SchemaEnumValuePair {
  
  @scala.inline
  def apply(): SchemaEnumValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValuePair]
  }
  
  @scala.inline
  implicit class SchemaEnumValuePairOps[Self <: SchemaEnumValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntegerValue(value: Double): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
