package typings
package googleDashGaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcApiCallableMod {
  type APICall = js.Function3[
    /* argument */ js.UndefOr[js.Object | scala.Null], 
    /* callOptions */ js.UndefOr[js.Object | scala.Null], 
    /* callback */ js.UndefOr[APICallback], 
    js.Any
  ]
  type APICallback = js.Function4[
    /* err */ googleDashGaxLib.buildSrcGoogleErrorMod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[js.Any], 
    /* next */ js.UndefOr[js.Object | scala.Null], 
    /* rawResponse */ js.UndefOr[js.Object | scala.Null], 
    scala.Unit
  ]
  type APIFunc = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ APICallback, 
    Canceller
  ]
  type ArgumentFunction = js.Function2[/* argument */ js.Object, /* callback */ APICallback, scala.Unit]
}
