package typings.filepond.mod

import typings.filepond.anon.Fetch
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondServerConfigProps extends js.Object {
  
  /**
    * Force use of chunk uploads even for files smaller than chunk size
    * @default false
    */
  var chunkForce: js.UndefOr[Boolean] = js.native
  
  /**
    * Amount of times to retry upload of a chunk when it fails
    * @default [500, 1000, 3000]
    */
  var chunkRetryDelays: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Size of chunks (5MB default)
    * @default 5000000
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * Enable chunk uploads
    * @default false
    */
  var chunkUploads: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of file locations that should be loaded immediately.
    * See: https://pqina.nl/filepond/docs/patterns/api/filepond-object/#setting-initial-files
    * @default []
    */
  var files: js.UndefOr[js.Array[FilePondInitialFile | ActualFileObject | Blob | String]] = js.native
  
  /**
    * Immediately upload new files to the server.
    * @default true
    */
  var instantUpload: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of files that can be uploaded in parallel.
    * @default 2
    */
  var maxParallelUploads: js.UndefOr[Double] = js.native
  
  /**
    * Server API Configuration.
    * See: https://pqina.nl/filepond/docs/patterns/api/server
    * @default null
    */
  var server: js.UndefOr[String | Fetch | Null] = js.native
}
object FilePondServerConfigProps {
  
  @scala.inline
  def apply(): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
  
  @scala.inline
  implicit class FilePondServerConfigPropsOps[Self <: FilePondServerConfigProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkForce(value: Boolean): Self = this.set("chunkForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkForce: Self = this.set("chunkForce", js.undefined)
    
    @scala.inline
    def setChunkRetryDelaysVarargs(value: Double*): Self = this.set("chunkRetryDelays", js.Array(value :_*))
    
    @scala.inline
    def setChunkRetryDelays(value: js.Array[Double]): Self = this.set("chunkRetryDelays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkRetryDelays: Self = this.set("chunkRetryDelays", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setChunkUploads(value: Boolean): Self = this.set("chunkUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkUploads: Self = this.set("chunkUploads", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: (FilePondInitialFile | ActualFileObject | Blob | String)*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[FilePondInitialFile | ActualFileObject | Blob | String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setInstantUpload(value: Boolean): Self = this.set("instantUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantUpload: Self = this.set("instantUpload", js.undefined)
    
    @scala.inline
    def setMaxParallelUploads(value: Double): Self = this.set("maxParallelUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxParallelUploads: Self = this.set("maxParallelUploads", js.undefined)
    
    @scala.inline
    def setServer(value: String | Fetch): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setServerNull: Self = this.set("server", null)
  }
}
