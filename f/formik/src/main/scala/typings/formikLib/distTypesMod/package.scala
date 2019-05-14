package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type FormikContext[Values] = FormikProps[Values] with (stdLib.Pick[
    FormikConfig[Values], 
    formikLib.formikLibStrings.validate | formikLib.formikLibStrings.validationSchema
  ])
  type FormikErrors[Values] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? object : string}
    */ formikLib.formikLibStrings.FormikErrors with Values
  type FormikProps[Values] = FormikSharedConfig with FormikState[Values] with FormikActions[Values] with FormikHandlers with FormikComputedProps[Values] with FormikRegistration
  type FormikTouched[Values] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? object : boolean}
    */ formikLib.formikLibStrings.FormikTouched with Values
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] | reactLib.reactMod.SelectHTMLAttributes[stdLib.HTMLSelectElement] | reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement]
}
