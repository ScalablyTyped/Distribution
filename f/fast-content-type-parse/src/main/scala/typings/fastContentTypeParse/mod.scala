package typings.fastContentTypeParse

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-content-type-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-content-type-parse", JSImport.Default)
  @js.native
  val default: FastContentTypeParse_ = js.native
  
  @JSImport("fast-content-type-parse", "defaultContentType")
  @js.native
  val defaultContentType: ContentType = js.native
  
  @JSImport("fast-content-type-parse", "fastContentTypeParse")
  @js.native
  val fastContentTypeParse: FastContentTypeParse_ = js.native
  
  inline def parse(header: String): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(header.asInstanceOf[js.Any]).asInstanceOf[ContentType]
  
  inline def safeParse(header: String): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(header.asInstanceOf[js.Any]).asInstanceOf[ContentType]
  
  trait ContentType extends StObject {
    
    var parameters: Record[String, String]
    
    var `type`: String
  }
  object ContentType {
    
    inline def apply(parameters: Record[String, String], `type`: String): ContentType = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastContentTypeParse_ extends StObject {
    
    var defaultContentType: ContentType
    
    def parse(header: String): ContentType
    
    def safeParse(header: String): ContentType
  }
  object FastContentTypeParse_ {
    
    inline def apply(defaultContentType: ContentType, parse: String => ContentType, safeParse: String => ContentType): FastContentTypeParse_ = {
      val __obj = js.Dynamic.literal(defaultContentType = defaultContentType.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), safeParse = js.Any.fromFunction1(safeParse))
      __obj.asInstanceOf[FastContentTypeParse_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastContentTypeParse_] (val x: Self) extends AnyVal {
      
      inline def setDefaultContentType(value: ContentType): Self = StObject.set(x, "defaultContentType", value.asInstanceOf[js.Any])
      
      inline def setParse(value: String => ContentType): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setSafeParse(value: String => ContentType): Self = StObject.set(x, "safeParse", js.Any.fromFunction1(value))
    }
  }
}
