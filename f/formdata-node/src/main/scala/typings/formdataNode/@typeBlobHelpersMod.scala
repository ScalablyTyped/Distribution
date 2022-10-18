package typings.formdataNode

import typings.formdataNode.`@typeBlobPartMod`.BlobPart
import typings.std.AsyncGenerator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeBlobHelpersMod` {
  
  @JSImport("formdata-node/@type/blobHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeBlobParts(parts: js.Array[BlobPart]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("consumeBlobParts")(parts.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]]
  inline def consumeBlobParts(parts: js.Array[BlobPart], clone: Boolean): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeBlobParts")(parts.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]]
  
  inline def sliceBlob(blobParts: js.Array[BlobPart], blobSize: Double): Generator[BlobPart, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceBlob")(blobParts.asInstanceOf[js.Any], blobSize.asInstanceOf[js.Any])).asInstanceOf[Generator[BlobPart, Unit, Any]]
  inline def sliceBlob(blobParts: js.Array[BlobPart], blobSize: Double, start: Double): Generator[BlobPart, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceBlob")(blobParts.asInstanceOf[js.Any], blobSize.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Generator[BlobPart, Unit, Any]]
  inline def sliceBlob(blobParts: js.Array[BlobPart], blobSize: Double, start: Double, end: Double): Generator[BlobPart, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceBlob")(blobParts.asInstanceOf[js.Any], blobSize.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Generator[BlobPart, Unit, Any]]
  inline def sliceBlob(blobParts: js.Array[BlobPart], blobSize: Double, start: Unit, end: Double): Generator[BlobPart, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceBlob")(blobParts.asInstanceOf[js.Any], blobSize.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Generator[BlobPart, Unit, Any]]
}
