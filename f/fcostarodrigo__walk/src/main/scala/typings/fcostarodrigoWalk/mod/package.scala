package typings.fcostarodrigoWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Walk = js.Function3[
    /* path */ js.UndefOr[java.lang.String], 
    /* listFolders */ js.UndefOr[scala.Boolean], 
    /* walkFolder */ js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]], 
    typings.std.AsyncIterable[java.lang.String]
  ]
}
