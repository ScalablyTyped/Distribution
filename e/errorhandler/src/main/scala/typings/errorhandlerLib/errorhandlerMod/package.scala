package typings
package errorhandlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorhandlerMod {
  type LoggingCallback = js.Function4[
    /* err */ stdLib.Error, 
    /* str */ java.lang.String, 
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    scala.Unit
  ]
}
