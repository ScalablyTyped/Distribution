package typings.elasticlunr.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizer {
  
  @JSImport("elasticlunr", "tokenizer")
  @js.native
  def apply(): js.Array[String] = js.native
  @JSImport("elasticlunr", "tokenizer")
  @js.native
  def apply(str: String): js.Array[String] = js.native
  
  @JSImport("elasticlunr", "tokenizer.defaultSeperator")
  @js.native
  val defaultSeperator: RegExp = js.native
  
  @JSImport("elasticlunr", "tokenizer.getSeperator")
  @js.native
  def getSeperator(): RegExp = js.native
  
  @JSImport("elasticlunr", "tokenizer.resetSeperator")
  @js.native
  def resetSeperator(): Unit = js.native
  
  @JSImport("elasticlunr", "tokenizer.seperator")
  @js.native
  val seperator: RegExp = js.native
  
  @JSImport("elasticlunr", "tokenizer.setSeperator")
  @js.native
  def setSeperator(sep: RegExp): Unit = js.native
}
