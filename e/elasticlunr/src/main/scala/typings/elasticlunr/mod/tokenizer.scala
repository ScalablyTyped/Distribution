package typings.elasticlunr.mod

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
  val defaultSeperator: js.RegExp = js.native
  
  inline def getSeperator(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeperator")().asInstanceOf[js.RegExp]
  
  inline def resetSeperator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSeperator")().asInstanceOf[Unit]
  
  @JSImport("elasticlunr", "tokenizer.seperator")
  @js.native
  val seperator: js.RegExp = js.native
  
  inline def setSeperator(sep: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSeperator")(sep.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
