package typings.elasticlunr.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizer {
  
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("elasticlunr", "tokenizer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("elasticlunr", "tokenizer.defaultSeperator")
  @js.native
  val defaultSeperator: RegExp = js.native
  
  inline def getSeperator(): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeperator")().asInstanceOf[RegExp]
  
  inline def resetSeperator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSeperator")().asInstanceOf[Unit]
  
  @JSImport("elasticlunr", "tokenizer.seperator")
  @js.native
  val seperator: RegExp = js.native
  
  inline def setSeperator(sep: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSeperator")(sep.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
