package typings.formDataEncoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeUtilHeadersMod` {
  
  trait FormDataEncoderHeaders
    extends StObject
       with RawHeaders {
    
    var `content-length`: js.UndefOr[String] = js.undefined
    
    var `content-type`: String
  }
  object FormDataEncoderHeaders {
    
    inline def apply(`Content-Type`: String, `content-type`: String): FormDataEncoderHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormDataEncoderHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormDataEncoderHeaders] (val x: Self) extends AnyVal {
      
      inline def `setContent-length`(value: String): Self = StObject.set(x, "content-length", value.asInstanceOf[js.Any])
      
      inline def `setContent-lengthUndefined`: Self = StObject.set(x, "content-length", js.undefined)
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawHeaders extends StObject {
    
    var `Content-Length`: js.UndefOr[String] = js.undefined
    
    var `Content-Type`: String
  }
  object RawHeaders {
    
    inline def apply(`Content-Type`: String): RawHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawHeaders] (val x: Self) extends AnyVal {
      
      inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
      
      inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
}
