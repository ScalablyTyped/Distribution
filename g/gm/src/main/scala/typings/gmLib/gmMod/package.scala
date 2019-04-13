package typings
package gmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gmMod {
  type CompareCallback = js.Function4[
    /* err */ stdLib.Error, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ stdLib.Error, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ stdLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
}
