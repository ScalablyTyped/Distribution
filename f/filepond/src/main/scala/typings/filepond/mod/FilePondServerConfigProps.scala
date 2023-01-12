package typings.filepond.mod

import typings.filepond.anon.Fetch
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondServerConfigProps extends StObject {
  
  /**
    * Force use of chunk uploads even for files smaller than chunk size
    * @default false
    */
  var chunkForce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Amount of times to retry upload of a chunk when it fails
    * @default [500, 1000, 3000]
    */
  var chunkRetryDelays: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Size of chunks (5MB default)
    * @default 5000000
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable chunk uploads
    * @default false
    */
  var chunkUploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of file locations that should be loaded immediately.
    * See: https://pqina.nl/filepond/docs/patterns/api/filepond-object/#setting-initial-files
    * @default []
    */
  var files: js.UndefOr[js.Array[FilePondInitialFile | ActualFileObject | Blob | String]] = js.undefined
  
  /**
    * Immediately upload new files to the server.
    * @default true
    */
  var instantUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of files that can be uploaded in parallel.
    * @default 2
    */
  var maxParallelUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * Server API Configuration.
    * See: https://pqina.nl/filepond/docs/patterns/api/server
    * @default null
    */
  var server: js.UndefOr[String | Fetch | Null] = js.undefined
}
object FilePondServerConfigProps {
  
  inline def apply(): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePondServerConfigProps] (val x: Self) extends AnyVal {
    
    inline def setChunkForce(value: Boolean): Self = StObject.set(x, "chunkForce", value.asInstanceOf[js.Any])
    
    inline def setChunkForceUndefined: Self = StObject.set(x, "chunkForce", js.undefined)
    
    inline def setChunkRetryDelays(value: js.Array[Double]): Self = StObject.set(x, "chunkRetryDelays", value.asInstanceOf[js.Any])
    
    inline def setChunkRetryDelaysUndefined: Self = StObject.set(x, "chunkRetryDelays", js.undefined)
    
    inline def setChunkRetryDelaysVarargs(value: Double*): Self = StObject.set(x, "chunkRetryDelays", js.Array(value*))
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setChunkUploads(value: Boolean): Self = StObject.set(x, "chunkUploads", value.asInstanceOf[js.Any])
    
    inline def setChunkUploadsUndefined: Self = StObject.set(x, "chunkUploads", js.undefined)
    
    inline def setFiles(value: js.Array[FilePondInitialFile | ActualFileObject | Blob | String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: (FilePondInitialFile | ActualFileObject | Blob | String)*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInstantUpload(value: Boolean): Self = StObject.set(x, "instantUpload", value.asInstanceOf[js.Any])
    
    inline def setInstantUploadUndefined: Self = StObject.set(x, "instantUpload", js.undefined)
    
    inline def setMaxParallelUploads(value: Double): Self = StObject.set(x, "maxParallelUploads", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelUploadsUndefined: Self = StObject.set(x, "maxParallelUploads", js.undefined)
    
    inline def setServer(value: String | Fetch): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerNull: Self = StObject.set(x, "server", null)
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
