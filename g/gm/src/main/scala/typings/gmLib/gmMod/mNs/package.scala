package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mNs {
  type CompareCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  type GetterCallback[T] = js.Function2[/* err */ nodeLib.Error, /* value */ T, js.Any]
  type WriteCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
}
