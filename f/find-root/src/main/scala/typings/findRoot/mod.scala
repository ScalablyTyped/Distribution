package typings.findRoot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns the path for the nearest directory to startingPath containing a package.json file. If a check function is
    * provided, then this will return the nearest directory for which the function returns true.
    * @param startingPath The path to start searching from, e.g. __dirname
    * @param check The check predicate
    * @throws {Error} if package.json cannot be found or if the function never returns true
    */
  inline def apply(startingPath: String): String = ^.asInstanceOf[js.Dynamic].apply(startingPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(startingPath: String, check: FindRootCheckFn): String = (^.asInstanceOf[js.Dynamic].apply(startingPath.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("find-root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FindRootCheckFn = js.Function1[/* dir */ String, Boolean]
}
