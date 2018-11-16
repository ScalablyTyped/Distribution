package typings
package expressDashBunyanDashLoggerLib.expressDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FactoryNs {
  type FormatFunction = js.Function1[/* meta */ js.Any, java.lang.String]
  type IncludesFunction = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    js.Any
  ]
  type LevelFunction = js.Function3[
    /* status */ scala.Double, 
    /* err */ nodeLib.Error | scala.Null, 
    /* meta */ js.Any, 
    java.lang.String
  ]
  type RequestIdGenFunction = js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]
}
