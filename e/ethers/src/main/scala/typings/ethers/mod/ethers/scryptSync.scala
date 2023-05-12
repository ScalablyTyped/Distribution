package typings.ethers.mod.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scryptSync {
  
  inline def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): String = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ethers", "ethers.scryptSync")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers", "ethers.scryptSync._")
  @js.native
  def _underscore: js.Function6[
    /* passwd */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* N */ Double, 
    /* r */ Double, 
    /* p */ Double, 
    /* dkLen */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  inline def _underscore_=(
    x: js.Function6[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      js.typedarray.Uint8Array
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "ethers.scryptSync.lock")
  @js.native
  def lock: js.Function0[Unit] = js.native
  inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "ethers.scryptSync.register")
  @js.native
  def register: js.Function1[
    /* func */ js.Function6[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      BytesLike
    ], 
    Unit
  ] = js.native
  inline def register_=(
    x: js.Function1[
      /* func */ js.Function6[
        /* passwd */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* N */ Double, 
        /* r */ Double, 
        /* p */ Double, 
        /* dkLen */ Double, 
        BytesLike
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
