package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFormMod {
  type FormikFormProps = stdLib.Pick[
    reactLib.reactMod.ReactNs.FormHTMLAttributes[stdLib.HTMLFormElement], 
    stdLib.Exclude[
      java.lang.String, 
      formikLib.formikLibStrings.onReset | formikLib.formikLibStrings.onSubmit
    ]
  ]
}
