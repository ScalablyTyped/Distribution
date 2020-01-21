package typings.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleapisCommon.googleapisCommonStrings.`object`
  - typings.googleapisCommon.googleapisCommonStrings.integer
  - typings.googleapisCommon.googleapisCommonStrings.string
  - typings.googleapisCommon.googleapisCommonStrings.array
  - typings.googleapisCommon.googleapisCommonStrings.boolean
*/
trait SchemaType extends js.Object

object SchemaType {
  @scala.inline
  def array: typings.googleapisCommon.googleapisCommonStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.googleapisCommon.googleapisCommonStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.googleapisCommon.googleapisCommonStrings.integer = this.cast("integer")
  @scala.inline
  def `object`: typings.googleapisCommon.googleapisCommonStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.googleapisCommon.googleapisCommonStrings.string = this.cast("string")
}

