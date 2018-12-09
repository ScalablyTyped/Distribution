package typings
package expressDashMungLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashMungMod {
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    js.Any
  ]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ java.lang.String | nodeLib.Buffer, 
    /* encoding */ java.lang.String | scala.Null, 
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    java.lang.String | nodeLib.Buffer
  ]
  type TransformHeader = js.Function2[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    js.Any
  ]
  type TransformHeaderAsync = js.Function2[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    js.Thenable[js.Any]
  ]
}
