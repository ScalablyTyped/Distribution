package typings.getPixels

import typings.ndarray.mod.NdArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: String, `type`: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: js.typedarray.Uint8Array, `type`: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("get-pixels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* pixels */ NdArray[js.typedarray.Uint8Array], Unit]
}
