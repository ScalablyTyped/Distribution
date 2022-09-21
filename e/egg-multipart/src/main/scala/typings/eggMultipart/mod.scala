package typings.eggMultipart

import typings.eggMultipart.anon.AutoFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait Context extends StObject {
    
    /**
      * clean up request tmp files helper
      * @param {EggFile[]} files file paths need to clenup, default is `ctx.request.files`.
      * @return {Promise<void>}
      */
    def cleanupRequestFiles(): js.Promise[Unit] = js.native
    def cleanupRequestFiles(files: js.Array[EggFile]): js.Promise[Unit] = js.native
    
    /**
      * get upload file stream
      * @param {MultipartOptions} options
      * @return {Promise<MultipartFileStream>}
      */
    def getFileStream(): js.Promise[MultipartFileStream] = js.native
    def getFileStream(options: MultipartOptions): js.Promise[MultipartFileStream] = js.native
    
    /**
      * create multipart.parts instance, to get separated files.
      * @param {MultipartOptions} options
      * @return {Function} return a function which return a Promise
      */
    def multipart(): js.Function1[/* fn */ js.UndefOr[js.Function], js.Promise[Any]] = js.native
    def multipart(options: MultipartOptions): js.Function1[/* fn */ js.UndefOr[js.Function], js.Promise[Any]] = js.native
    
    /**
      * save request multipart data and files to `ctx.request`
      * @return {Promise<void>}
      */
    def saveRequestFiles(): js.Promise[Unit] = js.native
  }
  
  trait EggAppConfig extends StObject {
    
    var multipart: AutoFields
  }
  object EggAppConfig {
    
    inline def apply(multipart: AutoFields): EggAppConfig = {
      val __obj = js.Dynamic.literal(multipart = multipart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggAppConfig]
    }
    
    extension [Self <: EggAppConfig](x: Self) {
      
      inline def setMultipart(value: AutoFields): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    }
  }
  
  type MatchItem = String | js.RegExp | (js.Function1[/* ctx */ Context, Boolean])
  
  trait Request extends StObject {
    
    /**
      * Files Object Array
      */
    var files: js.Array[EggFile]
  }
  object Request {
    
    inline def apply(files: js.Array[EggFile]): Request = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setFiles(value: js.Array[EggFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: EggFile*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
}
