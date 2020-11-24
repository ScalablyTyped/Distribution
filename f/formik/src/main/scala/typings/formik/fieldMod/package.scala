package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fieldMod {
  
  type FieldAttributes[T] = typings.formik.typesMod.GenericFieldHTMLAttributes with typings.formik.fieldMod.FieldConfig[T] with T with typings.formik.anon.Name
  
  type FieldHookConfig[T] = typings.formik.typesMod.GenericFieldHTMLAttributes with typings.formik.fieldMod.FieldConfig[T]
}
