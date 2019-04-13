package typings
package expressDashMungLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashMungMod {
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    js.Any
  ]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ java.lang.String | nodeLib.Buffer, 
    /* encoding */ java.lang.String | scala.Null, 
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    java.lang.String | nodeLib.Buffer
  ]
  type TransformHeader = js.Function2[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    js.Any
  ]
  type TransformHeaderAsync = js.Function2[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    js.Thenable[js.Any]
  ]
}
