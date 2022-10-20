package typings.findImports

import typings.findImports.anon.AbsoluteImports
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(files: String): Record[String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Array[String]]]
  inline def apply(files: String, options: AbsoluteImports): Record[String, js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[String]]]
  inline def apply(files: js.Array[String]): Record[String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Array[String]]]
  inline def apply(files: js.Array[String], options: AbsoluteImports): Record[String, js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[String]]]
  
  @JSImport("find-imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
