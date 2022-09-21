package typings.globToRegexp

import typings.globToRegexp.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def GlobToRegExp(glob: String): js.RegExp = js.Dynamic.global.applyDynamic("GlobToRegExp")(glob.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def GlobToRegExp(glob: String, options: Options): js.RegExp = (js.Dynamic.global.applyDynamic("GlobToRegExp")(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
}
