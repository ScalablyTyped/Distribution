package typings.formDataEncoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<form-data-encoder.form-data-encoder/@type/util/Headers.FormDataEncoderHeaders> */
  trait ReadonlyFormDataEncoderHe extends StObject {
    
    val `Content-Length`: js.UndefOr[String] = js.undefined
    
    val `Content-Type`: String
    
    val `content-length`: js.UndefOr[String] = js.undefined
    
    val `content-type`: String
  }
  object ReadonlyFormDataEncoderHe {
    
    inline def apply(`Content-Type`: String, `content-type`: String): ReadonlyFormDataEncoderHe = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyFormDataEncoderHe]
    }
    
    extension [Self <: ReadonlyFormDataEncoderHe](x: Self) {
      
      inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
      
      inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
}
