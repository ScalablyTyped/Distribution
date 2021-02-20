package typings.globalthis

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("globalthis", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  
  /**
    * Gets the `globalThis` object.
    */
  @JSImport("globalthis", "getPolyfill")
  @js.native
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
  
  /**
    * The `globalThis` object.
    */
  @JSImport("globalthis", "implementation")
  @js.native
  val implementation: /* globalThis */ js.Any = js.native
  
  /**
    * Installs the `globalThis` property onto the global object.
    */
  @JSImport("globalthis", "shim")
  @js.native
  def shim(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
}
