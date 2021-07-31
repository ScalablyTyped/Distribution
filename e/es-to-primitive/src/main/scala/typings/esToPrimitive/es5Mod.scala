package typings.esToPrimitive

import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es5Mod {
  
  @scala.inline
  def apply(input: js.Any): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  @scala.inline
  def apply(input: js.Any, hint: NumberConstructor): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  @scala.inline
  def apply(input: js.Any, hint: StringConstructor): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  
  @JSImport("es-to-primitive/es5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
