package typings.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParseWithEachType = typings.getenv.mod.ParseWithType[
    typings.getenv.getenvStrings.string | typings.getenv.getenvStrings.int | typings.getenv.getenvStrings.float | typings.getenv.getenvStrings.bool | typings.getenv.getenvStrings.boolish | typings.getenv.getenvStrings.url
  ]
  
  type ParseWithFallback = js.Tuple2[java.lang.String, java.lang.String]
  
  type ParseWithType[T /* <: typings.getenv.mod.ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
