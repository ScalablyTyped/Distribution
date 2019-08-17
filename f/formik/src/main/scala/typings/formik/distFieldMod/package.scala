package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFieldMod {
  import typings.formik.distTypesMod.GenericFieldHTMLAttributes

  type FieldAttributes[T] = GenericFieldHTMLAttributes with FieldConfig with T
}
