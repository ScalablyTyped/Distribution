package typings.evaluatex

import typings.evaluatex.mod.AbstractSyntaxTreeNode
import typings.evaluatex.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  inline def apply(token: js.Array[Token]): AbstractSyntaxTreeNode = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[AbstractSyntaxTreeNode]
  
  @JSImport("evaluatex/dist/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
