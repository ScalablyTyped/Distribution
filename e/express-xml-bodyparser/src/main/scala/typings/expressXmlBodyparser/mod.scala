package typings.expressXmlBodyparser

import typings.express.mod.Handler
import typings.std.RegExp
import typings.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  @scala.inline
  def apply(options: ParserOptions): Handler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("express-xml-bodyparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // @deprecated Will be removed in future versions
  @JSImport("express-xml-bodyparser", "regexp")
  @js.native
  def regexp: RegExp = js.native
  @scala.inline
  def regexp_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
}
