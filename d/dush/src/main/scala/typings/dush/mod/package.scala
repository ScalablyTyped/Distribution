package typings.dush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DushStatic = js.Function0[typings.dush.mod.Emitter]
  
  type Handler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[java.lang.String], /* repeated */ js.Any, scala.Unit]
}
