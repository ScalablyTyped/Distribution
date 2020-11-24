package typings.formatNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type format = js.Function2[
    /* number */ scala.Double, 
    /* overrideOptions */ js.UndefOr[typings.formatNumber.mod.IFormatNumberOverrideOptions], 
    java.lang.String
  ]
}
