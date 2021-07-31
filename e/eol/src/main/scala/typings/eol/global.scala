package typings.eol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object eol {
    
    @JSGlobal("eol")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def after(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def auto(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def before(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def cr(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cr")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def crlf(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crlf")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def lf(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lf")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def split(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
