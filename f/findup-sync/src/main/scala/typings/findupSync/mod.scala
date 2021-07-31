package typings.findupSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(patternOrPatterns: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def apply(patternOrPatterns: String, micromatchOptions: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any], micromatchOptions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def apply(patternOrPatterns: js.Array[String]): String | Null = ^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def apply(patternOrPatterns: js.Array[String], micromatchOptions: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(patternOrPatterns.asInstanceOf[js.Any], micromatchOptions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("findup-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with typings.micromatch.mod.Options
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
