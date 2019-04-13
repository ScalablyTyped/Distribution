package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefSchema extends Schema {
  /**
    * A json-pointer to a schema to use as a reference
    */
  @JSName("$ref")
  var $ref: java.lang.String
}

object RefSchema {
  @scala.inline
  def apply($ref: java.lang.String): RefSchema = {
    val __obj = js.Dynamic.literal($ref = $ref)
  
    __obj.asInstanceOf[RefSchema]
  }
}

