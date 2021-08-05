package typings.googleProfanityWords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profanityMod {
  
  @JSImport("google-profanity-words/lib/profanity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profanity(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("profanity")().asInstanceOf[js.Array[String]]
}
