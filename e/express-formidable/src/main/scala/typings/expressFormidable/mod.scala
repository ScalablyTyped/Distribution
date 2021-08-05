package typings.expressFormidable

import typings.express.mod.RequestHandler
import typings.expressFormidable.expressFormidableStrings.md5
import typings.expressFormidable.expressFormidableStrings.multipart
import typings.expressFormidable.expressFormidableStrings.sha1
import typings.expressFormidable.expressFormidableStrings.urlencoded
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.formidable.mod.Fields
import typings.formidable.mod.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: ExpressFormidableOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-formidable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ExpressFormidableOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[Boolean | sha1 | md5] = js.undefined
    
    var keepExtensions: js.UndefOr[Boolean] = js.undefined
    
    var maxFields: js.UndefOr[Double] = js.undefined
    
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var multiples: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[multipart | urlencoded] = js.undefined
    
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object ExpressFormidableOptions {
    
    inline def apply(): ExpressFormidableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressFormidableOptions]
    }
    
    extension [Self <: ExpressFormidableOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHash(value: Boolean | sha1 | md5): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      inline def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      inline def setMaxFieldsUndefined: Self = StObject.set(x, "maxFields", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      inline def setType(value: multipart | urlencoded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  // Extend the express request object with attached formidable files and fields
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var fields: js.UndefOr[Fields] = js.undefined
        
        var files: js.UndefOr[Files] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
          
          inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
          
          inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        }
      }
    }
  }
}
