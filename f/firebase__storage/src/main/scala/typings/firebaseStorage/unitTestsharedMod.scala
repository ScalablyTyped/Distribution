package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseStorage.anon.AccessToken
import typings.firebaseStorage.anon.PartialMetadataBucket
import typings.firebaseStorage.anon.Token
import typings.firebaseStorage.implementationConnectionMod.Connection
import typings.firebaseStorage.implementationConnectionMod.ConnectionType
import typings.firebaseStorage.implementationConnectionMod.Headers
import typings.firebaseStorage.implementationErrorMod.StorageError
import typings.firebaseStorage.srcServiceMod.FirebaseStorageImpl
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitTestsharedMod {
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "appCheckToken")
  @js.native
  val appCheckToken: /* "totally-shady-token" */ String = js.native
  
  inline def assertObjectIncludes(included: StringDictionary[Any], obj: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectIncludes")(included.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertThrows(f: js.Function0[Unit], code: String): StorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThrows")(f.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[StorageError]
  
  inline def assertUint8ArrayEquals(arr1: js.typedarray.Uint8Array, arr2: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUint8ArrayEquals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "authToken")
  @js.native
  val authToken: /* "totally-legit-auth-token" */ String = js.native
  
  inline def bind(f: js.Function, ctx: Any, args: Any*): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")((scala.List(f.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "bucket")
  @js.native
  val bucket: /* "mybucket" */ String = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "emptyAuthProvider")
  @js.native
  val emptyAuthProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'auth-internal'> */ Any = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeApp")
  @js.native
  val fakeApp: FirebaseApp = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeAppCheckTokenProvider")
  @js.native
  val fakeAppCheckTokenProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'app-check-internal'> */ Any = js.native
  
  @JSImport("@firebase/storage/dist/test/unit/testshared", "fakeAuthProvider")
  @js.native
  val fakeAuthProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'auth-internal'> */ Any = js.native
  
  inline def fakeServerHandler(): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeServerHandler")().asInstanceOf[RequestHandler]
  inline def fakeServerHandler(fakeMetadata: PartialMetadataBucket): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeServerHandler")(fakeMetadata.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  inline def fakeXhrIo[I /* <: ConnectionType */](headers: Headers): Connection[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeXhrIo")(headers.asInstanceOf[js.Any]).asInstanceOf[Connection[I]]
  inline def fakeXhrIo[I /* <: ConnectionType */](headers: Headers, status: Double): Connection[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fakeXhrIo")(headers.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Connection[I]]
  
  inline def makeFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")().asInstanceOf[FirebaseApp]
  inline def makeFakeApp(bucketArg: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")(bucketArg.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def makeFakeAppCheckProvider(tokenResult: Token): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeAppCheckProvider")(tokenResult.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def makeFakeAuthProvider(token: AccessToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeAuthProvider")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def storageServiceWithHandler(handler: RequestHandler): FirebaseStorageImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("storageServiceWithHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageImpl]
  
  type RequestHandler = js.Function4[
    /* url */ String, 
    /* method */ String, 
    /* body */ js.UndefOr[js.typedarray.ArrayBufferView | Blob | String | Null], 
    /* headers */ js.UndefOr[Headers], 
    Response
  ]
  
  trait Response extends StObject {
    
    var body: String
    
    var headers: Headers
    
    var status: Double
  }
  object Response {
    
    inline def apply(body: String, headers: Headers, status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
