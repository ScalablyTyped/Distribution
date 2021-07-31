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
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: ExpressFormidableOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
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
    
    @scala.inline
    def apply(): ExpressFormidableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressFormidableOptions]
    }
    
    @scala.inline
    implicit class ExpressFormidableOptionsMutableBuilder[Self <: ExpressFormidableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean | sha1 | md5): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
      
      @scala.inline
      def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      @scala.inline
      def setMaxFieldsUndefined: Self = StObject.set(x, "maxFields", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
      
      @scala.inline
      def setType(value: multipart | urlencoded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
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
        
        @scala.inline
        def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
          
          @scala.inline
          def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        }
      }
    }
  }
}
