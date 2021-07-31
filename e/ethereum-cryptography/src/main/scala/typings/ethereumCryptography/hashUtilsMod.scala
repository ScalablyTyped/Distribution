package typings.ethereumCryptography

import typings.node.Buffer
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashUtilsMod {
  
  @JSImport("ethereum-cryptography/hash-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createHashFunction(hashConstructor: js.Function0[Hash]): js.Function1[/* msg */ Buffer, Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashFunction")(hashConstructor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* msg */ Buffer, Buffer]]
}
