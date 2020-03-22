package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FieldValidator = js.Function1[
    /* value */ js.Any, 
    java.lang.String | scala.Unit | (js.Promise[java.lang.String | scala.Unit])
  ]
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K][number]> * / object> | string | std.Array<string> : string | std.Array<string> : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typings.formik.formikStrings.FormikErrors with js.Any
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K][number]> * / object> : boolean : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typings.formik.formikStrings.FormikTouched with js.Any
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = typings.react.mod.DetailedHTMLProps[
    typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] | typings.react.mod.SelectHTMLAttributes[typings.std.HTMLSelectElement] | typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
    typings.std.HTMLInputElement | typings.std.HTMLSelectElement | typings.std.HTMLTextAreaElement
  ]
}
