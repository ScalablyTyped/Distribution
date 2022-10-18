package typings.firebaseFirestore

import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformNodeLoadProtosMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/load_protos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadProtos(): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtos")().asInstanceOf[GrpcObject]
  
  inline def loadRawProtos(): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRawProtos")().asInstanceOf[Root]
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/load_protos", "protoLoaderOptions")
  @js.native
  val protoLoaderOptions: IConversionOptions = js.native
}
