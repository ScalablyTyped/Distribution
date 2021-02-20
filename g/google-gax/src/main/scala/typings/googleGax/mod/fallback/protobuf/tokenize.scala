package typings.googleGax.mod.fallback.protobuf

import typings.protobufjs.mod.ITokenizerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenize {
  
  @JSImport("google-gax", "fallback.protobuf.tokenize")
  @js.native
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  @JSImport("google-gax", "fallback.protobuf.tokenize.unescape")
  @js.native
  def unescape(str: String): String = js.native
}
