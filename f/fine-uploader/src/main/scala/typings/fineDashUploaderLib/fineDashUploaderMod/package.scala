package typings
package fineDashUploaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fineDashUploaderMod {
  type ShowConfirmFunction = js.Function1[
    /* message */ java.lang.String, 
    fineDashUploaderLib.libCoreMod.PromiseOptions | scala.Unit
  ]
  type ShowMessageFunction = js.Function1[
    /* message */ java.lang.String, 
    fineDashUploaderLib.libCoreMod.PromiseOptions | scala.Unit
  ]
  type ShowPromptFunction = js.Function2[
    /* message */ java.lang.String, 
    /* defaultValue */ java.lang.String, 
    fineDashUploaderLib.libCoreMod.PromiseOptions | scala.Unit
  ]
}
