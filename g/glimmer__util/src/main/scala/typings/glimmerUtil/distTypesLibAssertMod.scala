package typings.glimmerUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibAssertMod {
  
  @JSImport("@glimmer/util/dist/types/lib/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(test: Any, msg: String): /* asserts test */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts test */ Boolean]
  
  inline def debugAssert(test: Any, msg: String): /* asserts test */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("debugAssert")(test.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts test */ Boolean]
  
  inline def deprecate(desc: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(desc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def prodAssert(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prodAssert")().asInstanceOf[Unit]
}
