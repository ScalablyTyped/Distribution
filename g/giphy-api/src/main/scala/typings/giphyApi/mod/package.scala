package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[TResponse] = js.Function2[/* err */ typings.std.Error, /* res */ TResponse, scala.Unit]
}
