package typings.getUri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetUriCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* res */ js.UndefOr[typings.node.streamMod.Readable], 
    scala.Unit
  ]
  
  type GetUriProtocol = js.Function2[
    /* parsed */ typings.node.urlMod.UrlWithStringQuery, 
    /* opts */ typings.getUri.mod.GetUriOptions, 
    js.Promise[typings.node.streamMod.Readable]
  ]
}
