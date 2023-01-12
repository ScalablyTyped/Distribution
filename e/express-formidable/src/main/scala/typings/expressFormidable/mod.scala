package typings.expressFormidable

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressFormidable.expressFormidableStrings.md5
import typings.expressFormidable.expressFormidableStrings.multipart
import typings.expressFormidable.expressFormidableStrings.sha1
import typings.expressFormidable.expressFormidableStrings.urlencoded
import typings.formidable.mod.EventNames
import typings.formidable.mod.Fields
import typings.formidable.mod.Files
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Unit, events: js.Array[ExpressFormidableEvents]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: ExpressFormidableOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: ExpressFormidableOptions, events: js.Array[ExpressFormidableEvents]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-formidable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ExpressFormidableEvents extends StObject {
    
    def action(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction,
      formidableParameters: Any*
    ): Unit
    
    var event: EventNames
  }
  object ExpressFormidableEvents {
    
    inline def apply(
      action: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], NextFunction, /* repeated */ Any) => Unit,
      event: EventNames
    ): ExpressFormidableEvents = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction4(action), event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressFormidableEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressFormidableEvents] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]], NextFunction, /* repeated */ Any) => Unit
      ): Self = StObject.set(x, "action", js.Any.fromFunction4(value))
      
      inline def setEvent(value: EventNames): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressFormidableOptions] (val x: Self) extends AnyVal {
      
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
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
          
          inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
          
          inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        }
      }
    }
  }
}
