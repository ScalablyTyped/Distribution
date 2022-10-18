package typings.fbjs

import typings.fbjs.fbjsStrings.entries
import typings.fbjs.fbjsStrings.keys
import typings.fbjs.fbjsStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnumerateMod {
  
  inline def apply(o: Any): Any = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(o: Any, kind: Any): Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("fbjs/lib/enumerate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fbjs/lib/enumerate", "KIND_ENTRIES")
  @js.native
  val KIND_ENTRIES: entries = js.native
  
  @JSImport("fbjs/lib/enumerate", "KIND_KEYS")
  @js.native
  val KIND_KEYS: keys = js.native
  
  @JSImport("fbjs/lib/enumerate", "KIND_VALUES")
  @js.native
  val KIND_VALUES: values = js.native
  
  inline def entries(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def generic(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generic")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Convenient explicit iterators for special kinds.
    */
  inline def keys(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def values(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
