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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testsharedMod {
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "assertObjectIncludes")
  @js.native
  def assertObjectIncludes(included: StringDictionary[js.Any], obj: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "assertThrows")
  @js.native
  def assertThrows(f: js.Function0[Unit], code: Code): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "assertUint8ArrayEquals")
  @js.native
  def assertUint8ArrayEquals(arr1: Uint8Array, arr2: Uint8Array): Unit = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "authToken")
  @js.native
  val authToken: /* "totally-legit-auth-token" */ String = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "bind")
  @js.native
  def bind(f: js.Function, ctx: js.Any, args: js.Any*): js.Function0[Unit] = js.native
  
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
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeXhrIo")
  @js.native
  def fakeXhrIo(headers: Headers): XhrIo = js.native
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeXhrIo")
  @js.native
  def fakeXhrIo(headers: Headers, status: Double): XhrIo = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "makeFakeApp")
  @js.native
  def makeFakeApp(): FirebaseApp = js.native
  @JSImport("@firebase/storage/dist/test/unit/testshared", "makeFakeApp")
  @js.native
  def makeFakeApp(bucketArg: String): FirebaseApp = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "makeFakeAuthProvider")
  @js.native
  def makeFakeAuthProvider(token: AccessToken): Provider[FirebaseAuthInternalName] = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "makePool")
  @js.native
  def makePool(): XhrIoPool = js.native
  @JSImport("@firebase/storage/dist/test/unit/testshared", "makePool")
  @js.native
  def makePool(sendHook: SendHook): XhrIoPool = js.native
}
