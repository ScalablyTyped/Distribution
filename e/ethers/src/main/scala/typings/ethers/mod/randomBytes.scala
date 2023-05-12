package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomBytes {
  
  inline def apply(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("ethers", "randomBytes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers", "randomBytes._")
  @js.native
  def _underscore: js.Function1[/* length */ Double, js.typedarray.Uint8Array] = js.native
  
  inline def _underscore_=(x: js.Function1[/* length */ Double, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "randomBytes.lock")
  @js.native
  def lock: js.Function0[Unit] = js.native
  inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "randomBytes.register")
  @js.native
  def register: js.Function1[/* func */ js.Function1[/* length */ Double, js.typedarray.Uint8Array], Unit] = js.native
  inline def register_=(x: js.Function1[/* func */ js.Function1[/* length */ Double, js.typedarray.Uint8Array], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
