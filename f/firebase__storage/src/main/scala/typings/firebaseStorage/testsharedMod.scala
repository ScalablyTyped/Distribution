package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.anon.AccessToken
import typings.firebaseStorage.errorMod.Code
import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.firebaseStorage.firebaseStorageStrings.`auth-internal`
import typings.firebaseStorage.unitXhrioMod.SendHook
import typings.firebaseStorage.xhrioMod.Headers
import typings.firebaseStorage.xhrioMod.XhrIo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testsharedMod {
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertObjectIncludes(included: StringDictionary[js.Any], obj: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectIncludes")(included.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertThrows(f: js.Function0[Unit], code: Code): FirebaseStorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThrows")(f.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorageError]
  
  inline def assertUint8ArrayEquals(arr1: Uint8Array, arr2: Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUint8ArrayEquals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "authToken")
  @js.native
  val authToken: /* "totally-legit-auth-token" */ String = js.native
  
  inline def bind(f: js.Function, ctx: js.Any, args: js.Any*): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(f.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "bucket")
  @js.native
  val bucket: /* "mybucket" */ String = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "emptyAuthProvider")
  @js.native
  val emptyAuthProvider: Provider[`auth-internal`] = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeApp")
  @js.native
  val fakeApp: FirebaseApp = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeAuthProvider")
  @js.native
  val fakeAuthProvider: Provider[`auth-internal`] = js.native
  
  inline def fakeXhrIo(headers: Headers): XhrIo = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeXhrIo")(headers.asInstanceOf[js.Any]).asInstanceOf[XhrIo]
  inline def fakeXhrIo(headers: Headers, status: Double): XhrIo = (^.asInstanceOf[js.Dynamic].applyDynamic("fakeXhrIo")(headers.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[XhrIo]
  
  inline def makeFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")().asInstanceOf[FirebaseApp]
  inline def makeFakeApp(bucketArg: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")(bucketArg.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def makeFakeAuthProvider(token: AccessToken): Provider[FirebaseAuthInternalName] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeAuthProvider")(token.asInstanceOf[js.Any]).asInstanceOf[Provider[FirebaseAuthInternalName]]
  
  inline def makePool(): XhrIoPool = ^.asInstanceOf[js.Dynamic].applyDynamic("makePool")().asInstanceOf[XhrIoPool]
  inline def makePool(sendHook: SendHook): XhrIoPool = ^.asInstanceOf[js.Dynamic].applyDynamic("makePool")(sendHook.asInstanceOf[js.Any]).asInstanceOf[XhrIoPool]
}
