package typings.enhancedResolve

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globToRegExpMod {
  
  @JSImport("enhanced-resolve/lib/globToRegExp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def globToRegExp(glob: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("globToRegExp")(glob.asInstanceOf[js.Any]).asInstanceOf[RegExp]
}
