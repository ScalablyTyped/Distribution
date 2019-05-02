package typings
package fastifyDashCorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastifyDashCorsMod {
  type originCallback = js.Function2[/* err */ stdLib.Error, /* allow */ scala.Boolean, scala.Unit]
  type originFunction = js.Function2[/* origin */ java.lang.String, /* callback */ originCallback, scala.Unit]
}
