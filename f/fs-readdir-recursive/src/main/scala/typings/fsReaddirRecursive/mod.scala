package typings.fsReaddirRecursive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(
    path: String,
    filter: js.Function3[/* name */ String, /* index */ Double, /* dir */ String, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("fs-readdir-recursive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
