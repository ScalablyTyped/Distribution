package typings.geoipLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  
  type CmpArgs = scala.Double | js.Array[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geoipLite.geoipLiteNumbers.`1`
    - typings.geoipLite.geoipLiteNumbers.`-1`
    - typings.geoipLite.geoipLiteNumbers.`0`
    - scala.Null
  */
  type CmpResult = typings.geoipLite.mod._CmpResult | scala.Null
}
