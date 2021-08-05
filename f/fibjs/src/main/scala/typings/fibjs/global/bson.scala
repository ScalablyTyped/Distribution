package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bson {
  
  @JSGlobal("__bson")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: typings.fibjs.ClassBuffer): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def encode(data: js.Object): typings.fibjs.ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[typings.fibjs.ClassBuffer]
}
