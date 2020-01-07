package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Schema$EnumValuePair extends js.Object {
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

object Schema$EnumValuePair {
  @scala.inline
  def apply(integerValue: Int | Double = null, stringValue: String = null): Schema$EnumValuePair = {
    val __obj = js.Dynamic.literal()
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnumValuePair]
  }
}

