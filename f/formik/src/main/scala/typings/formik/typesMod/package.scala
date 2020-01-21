package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FormikContext[Values] = typings.formik.typesMod.FormikProps[Values] with (typings.std.Pick[
    typings.formik.typesMod.FormikConfig[Values], 
    typings.formik.formikStrings.validate | typings.formik.formikStrings.validationSchema
  ])
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typings.formik.formikStrings.FormikErrors with Values
  type FormikProps[Values] = typings.formik.typesMod.FormikSharedConfig[js.Object] with typings.formik.typesMod.FormikState[Values] with typings.formik.typesMod.FormikActions[Values] with typings.formik.typesMod.FormikHandlers with typings.formik.typesMod.FormikComputedProps[Values] with typings.formik.typesMod.FormikRegistration
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typings.formik.formikStrings.FormikTouched with Values
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] | typings.react.mod.SelectHTMLAttributes[typings.std.HTMLSelectElement] | typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]
}
