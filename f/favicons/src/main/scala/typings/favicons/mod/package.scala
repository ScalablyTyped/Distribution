package typings.favicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* response */ typings.favicons.mod.FavIconResponse, 
    scala.Unit
  ]
}
