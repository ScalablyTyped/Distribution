package typings.formik

import typings.formik.distTypesMod.GenericFieldHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFastFieldMod {
  type FastFieldAttributes[T] = GenericFieldHTMLAttributes with FastFieldConfig[T] with T
}
