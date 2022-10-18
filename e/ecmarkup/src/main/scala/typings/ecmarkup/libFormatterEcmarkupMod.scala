package typings.ecmarkup

import typings.ecmarkup.libFormatterLineBuilderMod.LineBuilder
import typings.std.Element
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterEcmarkupMod {
  
  @JSImport("ecmarkup/lib/formatter/ecmarkup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkup/lib/formatter/ecmarkup", "VOID_ELEMENTS")
  @js.native
  val VOID_ELEMENTS: Set[String] = js.native
  
  inline def printDocument(src: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("printDocument")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def printElement(src: String, node: Element, indent: Double): js.Promise[LineBuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("printElement")(src.asInstanceOf[js.Any], node.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LineBuilder]]
  
  inline def printStartTag(tag: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printStartTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
}
