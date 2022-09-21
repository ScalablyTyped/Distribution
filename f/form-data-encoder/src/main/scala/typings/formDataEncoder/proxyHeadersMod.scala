package typings.formDataEncoder

import typings.formDataEncoder.lowercaseObjectKeysMod.LowercaseObjectKeys
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyHeadersMod {
  
  @JSImport("form-data-encoder/@type/util/proxyHeaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def proxyHeaders[T /* <: AnyObject */](`object`: T): T & LowercaseObjectKeys[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyHeaders")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & LowercaseObjectKeys[T]]
  
  type AnyObject = Record[String | js.Symbol, String]
}
