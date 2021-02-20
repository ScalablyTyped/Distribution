package typings.findupSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  def apply(patternOrPatterns: String): String | Null = js.native
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  def apply(patternOrPatterns: String, micromatchOptions: Options): String | Null = js.native
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  def apply(patternOrPatterns: js.Array[String]): String | Null = js.native
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  def apply(patternOrPatterns: js.Array[String], micromatchOptions: Options): String | Null = js.native
  
  @js.native
  trait Options
    extends typings.micromatch.mod.Options
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
