package typings.ethers.mod

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2 {
  
  inline def apply(
    _password: BytesLike,
    _salt: BytesLike,
    iterations: Double,
    keylen: Double,
    algo: typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512
  ): String = (^.asInstanceOf[js.Dynamic].apply(_password.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], algo.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ethers", "pbkdf2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers", "pbkdf2._")
  @js.native
  def _underscore: js.Function5[
    /* password */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* iterations */ Double, 
    /* keylen */ Double, 
    /* algo */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
    BytesLike
  ] = js.native
  
  inline def _underscore_=(
    x: js.Function5[
      /* password */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* iterations */ Double, 
      /* keylen */ Double, 
      /* algo */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
      BytesLike
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "pbkdf2.lock")
  @js.native
  def lock: js.Function0[Unit] = js.native
  inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
  
  @JSImport("ethers", "pbkdf2.register")
  @js.native
  def register: js.Function1[
    /* func */ js.Function5[
      /* password */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* iterations */ Double, 
      /* keylen */ Double, 
      /* algo */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
      BytesLike
    ], 
    Unit
  ] = js.native
  inline def register_=(
    x: js.Function1[
      /* func */ js.Function5[
        /* password */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* iterations */ Double, 
        /* keylen */ Double, 
        /* algo */ typings.ethers.ethersStrings.sha256 | typings.ethers.ethersStrings.sha512, 
        BytesLike
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
