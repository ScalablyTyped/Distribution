package typings.ethers.typesEthersMod

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeHmac {
  
  inline def apply(
    algorithm: typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512,
    _key: BytesLike,
    _data: BytesLike
  ): String = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], _data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ethers/types/ethers", "computeHmac")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/ethers", "computeHmac._")
  @js.native
  def _underscore: js.Function3[
    /* algorithm */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
    /* key */ js.typedarray.Uint8Array, 
    /* data */ js.typedarray.Uint8Array, 
    BytesLike
  ] = js.native
  
  inline def _underscore_=(
    x: js.Function3[
      /* algorithm */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
      /* key */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      BytesLike
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers/types/ethers", "computeHmac.lock")
  @js.native
  def lock: js.Function0[Unit] = js.native
  inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers/types/ethers", "computeHmac.register")
  @js.native
  def register: js.Function1[
    /* func */ js.Function3[
      /* algorithm */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
      /* key */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      BytesLike
    ], 
    Unit
  ] = js.native
  inline def register_=(
    x: js.Function1[
      /* func */ js.Function3[
        /* algorithm */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
        /* key */ js.typedarray.Uint8Array, 
        /* data */ js.typedarray.Uint8Array, 
        BytesLike
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
