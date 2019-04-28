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
  type FormikProps[Values] = FormikSharedConfig with FormikState[Values] with FormikActions[Values] with FormikHandlers with FormikComputedProps[Values] with FormikRegistration
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] | reactLib.reactMod.SelectHTMLAttributes[stdLib.HTMLSelectElement] | reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement]
}
