package typings
package expressDashBunyanDashLoggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashBunyanDashLoggerMod {
  type FormatFunction = js.Function1[/* meta */ js.Any, java.lang.String]
  type IncludesFunction = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    js.Any
  ]
  type LevelFunction = js.Function3[
    /* status */ scala.Double, 
    /* err */ stdLib.Error | scala.Null, 
    /* meta */ js.Any, 
    java.lang.String
  ]
  type RequestIdGenFunction = js.Function1[/* req */ expressLib.expressMod.Request, java.lang.String]
}
