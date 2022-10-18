package typings.firebaseStorage

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationFsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlob(args: (String | Blob | js.typedarray.ArrayBuffer)*): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Blob]
  
  inline def sliceBlob(blob: Blob, start: Double, end: Double): Blob | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceBlob")(blob.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Blob | Null]
}
