package typings.formik.fieldMod

import typings.formik.typesMod.FieldHelperProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Field", "useField")
@js.native
object useField extends js.Object {
  def apply[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  def apply[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
}

