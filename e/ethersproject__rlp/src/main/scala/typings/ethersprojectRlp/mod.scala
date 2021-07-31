package typings.ethersprojectRlp

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/rlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(data: BytesLike): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def encode(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
}
