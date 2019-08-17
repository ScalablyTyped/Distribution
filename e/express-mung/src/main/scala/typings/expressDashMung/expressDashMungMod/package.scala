package typings.expressDashMung

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashMungMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.node.Buffer

  type Transform = js.Function3[/* body */ js.Object, /* request */ Request, /* response */ Response, js.Any]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ Request, 
    /* response */ Response, 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ String | Buffer, 
    /* encoding */ String | Null, 
    /* request */ Request, 
    /* response */ Response, 
    String | Buffer
  ]
  type TransformHeader = js.Function2[/* request */ Request, /* response */ Response, js.Any]
  type TransformHeaderAsync = js.Function2[/* request */ Request, /* response */ Response, js.Thenable[js.Any]]
}
