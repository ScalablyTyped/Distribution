package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object finch {
  
  type FinchCallback = js.Function2[
    /* bindings */ js.UndefOr[js.Any], 
    /* childCallback */ js.UndefOr[js.Function0[scala.Unit]], 
    js.Any
  ]
  
  type ObserveCallback = js.Function1[/* repeated */ js.Any, java.lang.String]
}
