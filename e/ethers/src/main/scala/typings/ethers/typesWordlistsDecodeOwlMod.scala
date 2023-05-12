package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsDecodeOwlMod {
  
  @JSImport("ethers/types/wordlists/decode-owl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String, subs: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], subs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def decodeOwl(data: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeOwl")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
