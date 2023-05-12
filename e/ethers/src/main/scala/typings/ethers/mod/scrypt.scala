package typings.ethers.mod

import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrypt {
  
  inline def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    _passwd: BytesLike,
    _salt: BytesLike,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progress: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("ethers", "scrypt")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers", "scrypt._")
  @js.native
  def _underscore: js.Function7[
    /* passwd */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* N */ Double, 
    /* r */ Double, 
    /* p */ Double, 
    /* dkLen */ Double, 
    /* onProgress */ js.UndefOr[ProgressCallback], 
    js.Promise[js.typedarray.Uint8Array]
  ] = js.native
  
  inline def _underscore_=(
    x: js.Function7[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      /* onProgress */ js.UndefOr[ProgressCallback], 
      js.Promise[js.typedarray.Uint8Array]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "scrypt.lock")
  @js.native
  def lock: js.Function0[Unit] = js.native
  inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "scrypt.register")
  @js.native
  def register: js.Function1[
    /* func */ js.Function7[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      /* progress */ js.UndefOr[ProgressCallback], 
      js.Promise[BytesLike]
    ], 
    Unit
  ] = js.native
  inline def register_=(
    x: js.Function1[
      /* func */ js.Function7[
        /* passwd */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* N */ Double, 
        /* r */ Double, 
        /* p */ Double, 
        /* dkLen */ Double, 
        /* progress */ js.UndefOr[ProgressCallback], 
        js.Promise[BytesLike]
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
