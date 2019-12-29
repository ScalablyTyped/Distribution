package typings.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternal
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import typings.atFirebaseStorage.atFirebaseStorageStrings.`totally-legit-auth-token`
import typings.atFirebaseStorage.atFirebaseStorageStrings.mybucket
import typings.atFirebaseStorage.distSrcImplementationErrorMod.Code
import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typings.atFirebaseStorage.distSrcImplementationXhrioMod.Headers
import typings.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typings.atFirebaseStorage.distSrcImplementationXhriopoolMod.XhrIoPool
import typings.atFirebaseStorage.distTestXhrioMod.SendHook
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/test/testshared", JSImport.Namespace)
@js.native
object distTestTestsharedMod extends js.Object {
  val authToken: `totally-legit-auth-token` = js.native
  val bucket: mybucket = js.native
  val emptyAuthProvider: js.Any = js.native
  val fakeApp: FirebaseApp = js.native
  val fakeAuthProvider: Provider[FirebaseAuthInternal] = js.native
  def assertObjectIncludes(included: StringDictionary[js.Any], obj: StringDictionary[js.Any]): Unit = js.native
  def assertThrows(f: js.Function0[Unit], code: Code): FirebaseStorageError = js.native
  def assertUint8ArrayEquals(arr1: Uint8Array, arr2: Uint8Array): Unit = js.native
  def bind(f: js.Function, ctx: js.Any, args: js.Any*): js.Function0[Unit] = js.native
  def fakeXhrIo(headers: Headers): XhrIo = js.native
  def fakeXhrIo(headers: Headers, status: Double): XhrIo = js.native
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(bucketArg: String): FirebaseApp = js.native
  def makeFakeAuthProvider(): Provider[FirebaseAuthInternal] = js.native
  def makeFakeAuthProvider(token: js.Object): Provider[FirebaseAuthInternal] = js.native
  def makePool(): XhrIoPool = js.native
  def makePool(sendHook: SendHook): XhrIoPool = js.native
}

