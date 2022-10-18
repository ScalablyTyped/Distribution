package typings.envify

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod {
  
  inline def apply(environment: StringDictionary[Any]): js.Function2[/* file */ String, /* environment */ StringDictionary[Any], ReadWriteStream] = ^.asInstanceOf[js.Dynamic].apply(environment.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* file */ String, /* environment */ StringDictionary[Any], ReadWriteStream]]
  
  @JSImport("envify/custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
