package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.formik.formikStrings.validate
  import typings.formik.formikStrings.validationSchema
  import typings.react.reactMod.InputHTMLAttributes
  import typings.react.reactMod.SelectHTMLAttributes
  import typings.react.reactMod.TextareaHTMLAttributes
  import typings.std.HTMLInputElement
  import typings.std.HTMLSelectElement
  import typings.std.HTMLTextAreaElement
  import typings.std.Pick

  type FormikContext[Values] = FormikProps[Values] with (Pick[FormikConfig[Values], validate | validationSchema])
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typings.formik.formikStrings.FormikErrors with Values
  type FormikProps[Values] = FormikSharedConfig[js.Object] with FormikState[Values] with FormikActions[Values] with FormikHandlers with FormikComputedProps[Values] with FormikRegistration
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typings.formik.formikStrings.FormikTouched with Values
  type FormikValues = StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement]
}
