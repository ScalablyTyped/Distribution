package typings.fsExtra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayBufferView = typings.node.NodeJS.TypedArray | typings.std.DataView
  
  type CopyFilterAsync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, js.Promise[scala.Boolean]]
  
  type CopyFilterSync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Boolean]
  
  type Mode = java.lang.String | scala.Double
}
