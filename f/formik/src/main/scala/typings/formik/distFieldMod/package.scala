package typings.formik

import typings.formik.distTypesMod.GenericFieldHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFieldMod {
  type FieldAttributes[T] = GenericFieldHTMLAttributes with FieldConfig with T
}
