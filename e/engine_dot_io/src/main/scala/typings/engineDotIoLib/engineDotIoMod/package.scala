package typings
package engineDotIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineDotIoMod {
  type AllowRequestFunction = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* fn */ js.Function2[
      /* err */ js.UndefOr[java.lang.String | scala.Null], 
      /* success */ scala.Boolean, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type Message = java.lang.String | nodeLib.Buffer | stdLib.ArrayBuffer | stdLib.ArrayBufferView
}
