package typings
package envifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("envify/custom", JSImport.Namespace)
@js.native
object customMod extends js.Object {
  def apply(environment: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Function2[
    /* file */ java.lang.String, 
    /* environment */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    nodeLib.NodeJSNs.ReadWriteStream
  ] = js.native
}

