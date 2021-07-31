package typings.globalthis

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  
  @JSImport("globalthis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the `globalThis` object.
    */
  @scala.inline
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfill")().asInstanceOf[ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ]]
  
  /**
    * The `globalThis` object.
    */
  @JSImport("globalthis", "implementation")
  @js.native
  val implementation: /* globalThis */ js.Any = js.native
  
  /**
    * Installs the `globalThis` property onto the global object.
    */
  @scala.inline
  def shim(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ]]
}
