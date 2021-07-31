package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blake2bMod {
  
  @JSImport("ethereum-cryptography/blake2b", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def blake2b(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def blake2b(input: Buffer, outputLength: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
