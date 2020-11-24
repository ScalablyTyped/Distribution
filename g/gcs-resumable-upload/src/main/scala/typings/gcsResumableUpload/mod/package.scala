package typings.gcsResumableUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CreateUriCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* uri */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
