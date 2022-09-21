package typings.esutils

import typings.esutils.anon.DecodeUtf16
import typings.esutils.anon.IsDecimalDigit
import typings.esutils.anon.IsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("esutils", "ast")
  @js.native
  def ast: IsExpression = js.native
  inline def ast_=(x: IsExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ast")(x.asInstanceOf[js.Any])
  
  @JSImport("esutils", "code")
  @js.native
  def code: IsDecimalDigit = js.native
  inline def code_=(x: IsDecimalDigit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
  
  @JSImport("esutils", "keyword")
  @js.native
  def keyword: DecodeUtf16 = js.native
  inline def keyword_=(x: DecodeUtf16): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyword")(x.asInstanceOf[js.Any])
}
