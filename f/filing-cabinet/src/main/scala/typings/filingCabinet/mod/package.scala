package typings.filingCabinet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Resolver = js.Function4[
    /* partial */ java.lang.String, 
    /* filename */ java.lang.String, 
    /* directory */ java.lang.String, 
    /* config */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
