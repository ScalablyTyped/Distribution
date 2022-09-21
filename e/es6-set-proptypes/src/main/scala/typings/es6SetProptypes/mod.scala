package typings.es6SetProptypes

import org.scalablytyped.runtime.Shortcut
import typings.propTypes.mod.Requireable
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("es6-set-proptypes", JSImport.Namespace)
  @js.native
  val ^ : Requireable[Set[Any]] = js.native
  
  type _To = Requireable[Set[Any]]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Requireable[Set[Any]] = ^
}
