package typings.fastifyMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MultipartFields = org.scalablytyped.runtime.StringDictionary[
    typings.fastifyMultipart.mod.Multipart[typings.fastifyMultipart.fastifyMultipartBooleans.`true`] | (js.Array[
      typings.fastifyMultipart.mod.Multipart[typings.fastifyMultipart.fastifyMultipartBooleans.`true`]
    ])
  ]
  
  type MultipartHandler = js.Function5[
    /* field */ java.lang.String, 
    /* file */ js.Any, 
    /* filename */ java.lang.String, 
    /* encoding */ java.lang.String, 
    /* mimetype */ java.lang.String, 
    scala.Unit
  ]
}
