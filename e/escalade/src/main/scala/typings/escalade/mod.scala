package typings.escalade

import typings.escalade.escaladeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escalade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(directory: String, callback: Callback): js.Promise[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(directory.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Unit]]
  
  type Callback = js.Function2[
    /* directory */ String, 
    /* files */ js.Array[String], 
    Promisable[String | `false` | Unit]
  ]
  
  type Promisable[T] = T | js.Promise[T]
}
