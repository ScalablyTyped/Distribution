package typings.fbWatchman

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type doneCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* resp */ js.UndefOr[js.Any], 
    js.Any
  ]
}
