package typings.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExifCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.exif.mod.ExifData, 
    /* dataPath */ java.lang.String, 
    scala.Unit
  ]
  
  type ExifImageCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.exif.mod.ExifData, 
    scala.Unit
  ]
}
