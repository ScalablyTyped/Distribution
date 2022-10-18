package typings.ecmarkup

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClauseMod {
  
  @JSImport("ecmarkup/lib/Clause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractStructuredHeader(header: Element): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractStructuredHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
