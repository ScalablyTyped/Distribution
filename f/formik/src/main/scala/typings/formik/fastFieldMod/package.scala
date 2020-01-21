package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastFieldMod {
  type FastFieldAttributes[T] = typings.formik.typesMod.GenericFieldHTMLAttributes with typings.formik.fastFieldMod.FastFieldConfig[T] with T
}
